package com.crio.session7.activity2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;
        try {
            in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("session7/src/main/java/com/crio/session5/activity2/sample.txt")));
            while((c = in.read()) >= 0 ){ 
                System.out.print((char)c);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            in.close();
        }
    }
}
