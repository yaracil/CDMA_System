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
public class main_run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//
////        System.out.println("Entre mensaje:");
//        Scanner obj = new Scanner(System.in);
////        String msg = obj.next();
////
////        System.out.println("Entre un codigo ortogonal");
////        String vectorMsg = obj.next();
////        String[] codOrt = vectorMsg.split(",");
////
////        Encoder encoder = new Encoder(msg, codOrt);
////        int[] codedString = encoder.runEncoding();     
//        System.out.println("Entre mensaje 1");
//        String msg1 = obj.next();
//        System.out.println("Entre mensaje 2");
//        String msg2 = obj.next();
//
//        System.out.println("Entre vector ort 1");
//        String[] codOrtogonal1 = obj.next().split(",");
//        System.out.println(toStringArryString(codOrtogonal1));
//
//        System.out.println("Entre vector ort 2");
//        String[] codOrtogonal2 = obj.next().split(",");
//        System.out.println(toStringArryString(codOrtogonal2));
//
//        Encoder_CDMA encod = new Encoder_CDMA(msg1, codOrtogonal1);
//        int[] codMensaje1 = encod.runEncoding();
//
//        Encoder_CDMA encod2 = new Encoder_CDMA(msg2, codOrtogonal2);
//        int[] codMensaje2 = encod2.runEncoding();
//
//        int[] coded = new int[(codMensaje1.length>=codMensaje2.length)?codMensaje1.length:codMensaje2.length];
//
//        //sumo los mensajes codificados
//        
//        for (int i = 0, j = 0; i < codMensaje1.length || j < codMensaje2.length;) {
//            if (i < codMensaje1.length) {
//                coded[i] += codMensaje1[i++];
//            }
//            if (j < codMensaje2.length) {
//                coded[j] += codMensaje2[j++];
//            }
//        }
//
//        System.out.println("Suma de vectores " + toStringArryInt(coded));
//
//        Decoder_CDMA decoder = new Decoder_CDMA(coded, codOrtogonal1);
//        String answ = decoder.runDecoder();
//
//        System.out.println("Decodificado " + answ);

    }

    public static String toStringArryString(String[] arr) {
        String ret = "";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i] + "|";
        }
        return ret; //To change body of generated methods, choose Tools | Templates.
    }

    public static String toStringArryInt(int[] arr) {
        String ret = "";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i] + "|";
        }
        return ret; //To change body of generated methods, choose Tools | Templates.
    }
}
