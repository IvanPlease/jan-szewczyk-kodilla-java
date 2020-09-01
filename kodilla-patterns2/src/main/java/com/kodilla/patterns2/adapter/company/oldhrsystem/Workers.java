package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"2412414124124", "John", "Smith"},
            {"2412414124124", "John", "Smith"},
            {"2412414124124", "John", "Smith"},
            {"2412414124124", "John", "Smith"},
            {"2412414124124", "John", "Smith"}
    };
    private double[] salaries = {
            4500.0,
            3700.0,
            4350.0,
            9000.0,
            6200.0
    };
    public String getWorkers(int n){
        if(n>salaries.length){
            return "";
        }
        return workers[n][0]+", "+workers[n][1]+", "+workers[n][2]+", "+salaries[0];
    }
    public String[][] getWorkers(){
        return workers;
    }
    public double[] getSalaries(){
        return salaries;
    }
}
