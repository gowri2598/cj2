package com.crio.session4.activity2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<String> fileList = new ArrayList<>();
    fileList.add("Sample1.pptx");
    fileList.add("Sample2.pptx");
    Compressor ctx = new Compressor();
    //we could assume context is already set by preferences
    ctx.setCompressionStrategy(new ZipCompressionStrategy());
    //get a list of files...
    ctx.createArchive(fileList);
    }
}
