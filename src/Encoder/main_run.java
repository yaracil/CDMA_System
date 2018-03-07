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

//        System.out.println("Entre mensaje:");
        Scanner obj = new Scanner(System.in);
//        String msg = obj.next();
//
//        System.out.println("Entre un codigo ortogonal");
//        String vectorMsg = obj.next();
//        String[] codOrt = vectorMsg.split(",");
//
//        Encoder encoder = new Encoder(msg, codOrt);
//        int[] codedString = encoder.runEncoding();        

        System.out.println("Entre mensaje codificado ");
        String codedMsg = obj.next();
        String[] codMensaje = codedMsg.split(",");

        System.out.println("Entre codigo ortogonal ");
        String codOrt = obj.next();
        String[] codOrtogonal = codOrt.split(",");

        String decodedMsg = "", charact;
        int byt = 0;

        System.out.println("CodeMsjLeng " + codMensaje.length);
        System.out.println("Ort " + codOrtogonal.length);

        for (int i = 0; i < codMensaje.length; i++) {

            for (int j = 0; j < codOrtogonal.length; j++, i++) {
                System.out.println("Char Coded " + codOrtogonal[j]);
                System.out.println("Char Ort " + codMensaje[i]);

                byt += Integer.parseInt(codMensaje[i]) * Integer.parseInt(codOrtogonal[j]);
                System.out.println("Suma Acum " + byt);
            }
            decodedMsg += (byt < 0) ? 1 : 0;
        }
        System.out.println(decodedMsg);
        System.out.println(decodedMsg.length());
        String decodedCharacteres = "";

        for (int i = 0; i <= decodedMsg.length() / 8; i++) {
            int aux = Integer.parseInt(decodedMsg.substring(i, i + 8));
            String aChar = new Character((char) aux).toString();
            decodedCharacteres += aChar;
        }
        System.out.println(decodedCharacteres);
    }

}
