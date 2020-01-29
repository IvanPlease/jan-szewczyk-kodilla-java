package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautifier(String tekst, PoemDecorator poemDecorator){
        String poem = poemDecorator.decorate(tekst);
        System.out.println("Upiększony tekst: " + poem);
    }

}
