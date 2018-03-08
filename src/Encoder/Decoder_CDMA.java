/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encoder;

/**
 *
 * @author yoe
 */
public class Decoder_CDMA {

    int[] coded;
    String[] codOrtogonal;

    public Decoder_CDMA(String coded, String codOrtogonal, String pattern) {
        this.coded = stringToInt(coded, pattern);
        this.codOrtogonal = codOrtogonal.split(pattern);
    }

    public String runDecoder() {

        String decodedMsg = "";
        int byt = 0;

        for (int i = coded.length - 1; i >= 0;) {
            byt = 0;
            for (int j = 0; j < codOrtogonal.length; j++, i--) {
                byt += coded[i] * Integer.parseInt(codOrtogonal[j]);
            }
            // System.out.println("Suma Acum " + byt);
            decodedMsg += (byt < 0) ? 1 : 0;
        }
        System.out.println(decodedMsg);
        System.out.println(decodedMsg.length());
        String decodedCharacteres = "";
        String chain = "";

        for (int i = 0; i < decodedMsg.length(); i += 8) {
            byte aux = (byte) Short.parseShort(invertString(decodedMsg.substring(i, i + 8)), 2);
            // String aChar = new Character((char) aux).toString();
            decodedCharacteres += (char) aux;
            chain += aux;
        }
        return invertString(decodedCharacteres);
    }

    public static String invertString(String arr) {
        String aux = "";
        for (int i = arr.length() - 1; i >= 0; i--) {
            aux += arr.charAt(i);
        }
        return aux;
    }

    public static int[] stringToInt(String cod, String pattern) {
        String[] aux = cod.split(pattern);
        int[] answ = new int[aux.length];
        
        for (int i = 0; i < aux.length; i++) {
            answ[i] = Integer.valueOf(aux[i].trim());
        }
        return answ;
    }

}
