package com.InAsg1;

import java.io.IOException;

public class App{
    public static void main( String[] args ) throws IOException {
        System.out.println("Loading...");
        Read.findAll();
        Write.save();
    }
}
