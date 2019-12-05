package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String sampleText, PoemDecorator poemDecorator) {
        String text = poemDecorator.decorate(sampleText);
        System.out.println(text);
    }
    public void decoration(String sampleText, PoemDecorator poemDecorator) {
        String decor = poemDecorator.decorate(sampleText);
        System.out.println(decor + sampleText + decor);
    }
}