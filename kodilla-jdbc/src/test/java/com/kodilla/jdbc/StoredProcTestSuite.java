package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;


public class StoredProcTestSuite {
    private DbManager dbManager;
    private Statement statement;

    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        dbManager = DbManager.getInstance();
        statement = dbManager.getConnection().createStatement();
        String sqlUpdate = "Update READERS SET VIP_LEVEL=\"Not set\"";
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "Call UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()){
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
    }
    @Test
    public void testUpdateBestsellers() throws SQLException{
        //Given
        dbManager = DbManager.getInstance();
        statement = dbManager.getConnection().createStatement();
        String sqlUpdate = "Update BOOKS SET BESTSELLER=false";
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "Call UpdateBestsellers()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM books WHERE BESTSELLER=true";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()){
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(1, howMany);
    }
}
