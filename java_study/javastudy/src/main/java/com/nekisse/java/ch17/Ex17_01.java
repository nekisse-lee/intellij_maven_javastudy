package com.nekisse.java.ch17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex17_01 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out= null;
        try {
            in = new FileInputStream("intest.txt");
            out = new FileOutputStream("outtest.txt");
            int c;
            while ((c = in.read()) !=  1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }


}
