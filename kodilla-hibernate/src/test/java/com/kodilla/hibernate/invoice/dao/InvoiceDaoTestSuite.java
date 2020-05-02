package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product juice = new Product("Orange Juice");
        Product flour = new Product("Flour");
        Product fries = new Product("Fries");
        Product iceCream = new Product("Ice Creams");

        Item juiceOne = new Item(juice, new BigDecimal("20.0"), 3, new BigDecimal("60.0"));
        Item juiceTwo = new Item(juice, new BigDecimal("20.0"), 15, new BigDecimal("300.0"));
        Item juiceThree = new Item(juice, new BigDecimal("20.0"), 60, new BigDecimal("1200.0"));
        Item flourOne = new Item(flour, new BigDecimal("3.4"), 23, new BigDecimal("78.2"));
        Item flourTwo = new Item(flour, new BigDecimal("3.4"), 150, new BigDecimal("510.0"));
        Item friesOne = new Item(fries, new BigDecimal("12.4"), 15, new BigDecimal("186.0"));
        Item iceCreamOne = new Item(iceCream, new BigDecimal("20.3"), 10, new BigDecimal("203.0"));
        Item iceCreamTwo = new Item(iceCream, new BigDecimal("18.3"), 123, new BigDecimal("2250.9"));

        Invoice invoiceOne = new Invoice("23535353");
        Invoice invoiceTwo = new Invoice("23124312");
        Invoice invoiceThree = new Invoice("32143212");

        invoiceOne.getItems().add(juiceOne);
        invoiceOne.getItems().add(flourOne);
        invoiceOne.getItems().add(friesOne);
        invoiceOne.getItems().add(iceCreamOne);
        invoiceTwo.getItems().add(juiceTwo);
        invoiceTwo.getItems().add(flourTwo);
        invoiceTwo.getItems().add(iceCreamTwo);
        invoiceThree.getItems().add(juiceThree);

        //When
        invoiceDao.save(invoiceOne);
        int invoiceOneId = invoiceOne.getId();
        invoiceDao.save(invoiceTwo);
        int invoiceTwoId = invoiceTwo.getId();
        invoiceDao.save(invoiceThree);
        int invoiceThreeId = invoiceThree.getId();

        //Then
        Assert.assertNotEquals(0, invoiceOneId);
        Assert.assertNotEquals(0, invoiceTwoId);
        Assert.assertNotEquals(0, invoiceThreeId);

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceOneId);
            invoiceDao.deleteById(invoiceTwoId);
            invoiceDao.deleteById(invoiceThreeId);
        } catch (Exception e) {
            //do nothing
        }
    }

}
