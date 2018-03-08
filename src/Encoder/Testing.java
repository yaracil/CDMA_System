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
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        String decodedMsg = "01101000011011110110110001100001";
        Integer intsss = new Integer("01101000");
        String decodedCharacteres = "";

        // System.out.println(bytess);
        for (int i = 0; i < decodedMsg.length(); i += 8) {
            byte aux = (byte) Short.parseShort((decodedMsg.substring(i, i + 8)), 2);
            System.out.println((char) aux);
            // String aChar = new Character((char) aux).toString();
            decodedCharacteres += (char) aux;
        }
//
//        for (int i = 0; i < bytess.length; i++) {
//            System.out.println(bytess[i]);
//
//        }
        System.out.println(decodedCharacteres);

    }
}
