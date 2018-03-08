/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encoder;

import java.util.Scanner;

/**
 *
 * @author maestria
 */
public class Encoder_CDMA {

    String msg;
    String[] codOrt;

    public Encoder_CDMA(String msg, String codOrtt,String pattern) {
        this.msg = msg;
        this.codOrt = codOrtt.split(pattern);
    }   

    public int[] runEncoding() {

        byte[] bytes = msg.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
        }
        System.out.print("Msg binario" + binary + " ");
        System.out.println("Longitud cod. ortogonal" + codOrt.length);

//        for (int i = 0; i < codOrt.length; i++) {
//            int cod = Integer.valueOf(codOrt[i]);
//            System.out.println(cod);
//            if (cod != 1 && cod != -1) {
//                throw new Exception("El código ortogonal no es correcto");
//            } else {
//                System.out.println("El codigo es correcto");
//            }
//        }
        int tamCoded = binary.length() * codOrt.length;
        int[] coded = new int[tamCoded];
        for (int i = binary.length()-1; i >=0 ; i--) {
            int a1 = Integer.parseInt(String.valueOf(binary.charAt(i)));
          //  System.out.println("---Coding bit "+a1);
            for (int j = 0; j < codOrt.length; j++) {
                int b1 = Integer.valueOf(codOrt[j]);
          //      System.out.println("Bit ort "+b1);
                int c1 = a1 + b1;
               // System.out.println(c1);
                coded[--tamCoded] = (c1 == 1 || c1 == 0) ? 1 : -1;
          //      System.out.println("Result "+((c1 == 1 || c1 == 0) ? 1 : -1));
            }
        }
        //System.out.println(coded.length);
        String codedString = "";

        for (int i = 0; i < coded.length; i++) {
            codedString += coded[i]+",";
        }
        System.out.println("Vector --"+codedString);
        return coded;
    }

}
