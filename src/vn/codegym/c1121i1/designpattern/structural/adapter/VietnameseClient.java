package vn.codegym.c1121i1.designpattern.structural.adapter;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new EnglishTranslatorAdapter(new EnglishAdaptee());
        client.send("Xin chào");
    }
}
