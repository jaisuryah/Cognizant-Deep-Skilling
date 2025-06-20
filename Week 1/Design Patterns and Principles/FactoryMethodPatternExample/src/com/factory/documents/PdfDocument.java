package com.factory.documents;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}
