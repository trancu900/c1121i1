package vn.codegym.c1121i1.designpattern.structural.adapter;

public class EnglishTranslatorAdapter implements VietnameseTarget {
    private EnglishAdaptee adaptee;

    public EnglishTranslatorAdapter(EnglishAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "Hello";
    }
}
