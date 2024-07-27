package org.Learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LearnTry {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br1 = null;
        try {
            // BufferedReader
            br1 = new BufferedReader(in);
        } catch (Exception e) {
            // TODO: handle exception
        } finally{
            br1.close();
        }


        // Try with Resource
        try (BufferedReader br2 = new BufferedReader(in)) {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
