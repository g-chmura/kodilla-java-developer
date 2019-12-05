package com.kodilla.stream.beautifier;

public class StreamMainBeautifier {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ABC", String::toLowerCase);
        poemBeautifier.beautify("abc", String::toUpperCase);
        poemBeautifier.beautify("A B C", decor -> decor.replaceAll(" ", "#"));
        poemBeautifier.beautify("ABCC", decor -> decor.replaceFirst("C", "*"));
        poemBeautifier.beautify("ABC", decor ->"****");
        poemBeautifier.decoration("ABC", decor ->"***");
    }
}