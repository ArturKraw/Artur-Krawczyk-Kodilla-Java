package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautifier(String text, PoemDecorator poemDecorator){
        //metodz, której jako parametry będzie można przekazać:
        // -tekst do upiększenia
        // - wyrażenie lambda upiększające tekst.
        String result = poemDecorator.decorate(text);
        System.out.println("Beatified text (" + text + ") --> (" + result + ")");
    }
}
