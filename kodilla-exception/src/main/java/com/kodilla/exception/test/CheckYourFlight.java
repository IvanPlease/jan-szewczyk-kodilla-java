package com.kodilla.exception.test;

public class CheckYourFlight {
    public static void main(String[] args) {
        FlightsImitation flightsImitation = new FlightsImitation();
        Flight flight = new Flight("JFX", "LAX");
        try{
            boolean s = flightsImitation.findFlight(flight);
            if(s){
                System.out.println("Flight was found");
            }
        }catch (RouteNotFoundException e){
            System.out.println("No plane for that airport");
        } finally {
            System.out.println("Thank you for using our services!");
        }
    }
}
