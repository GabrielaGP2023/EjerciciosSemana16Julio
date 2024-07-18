package com.networks.presentacion;

import java.io.*;

public class OrdenarFicheros {
    private static FileReader fEntrada1 = null;
    private static BufferedReader bEntrada1;
    private static FileReader fEntrada2 = null;
    private static BufferedReader bEntrada2;
    private static FileWriter fSalida;
    private static BufferedWriter bSalida;


    public static void main(String[] args) {

        try {
            fEntrada1 = new FileReader("entrada1.txt");
            bEntrada1 = new BufferedReader(fEntrada1);
            fEntrada2 = new FileReader("entrada2.txt");
            bEntrada2 = new BufferedReader(fEntrada2);
            //Declaración fichero y buffer de salida
            fSalida = new FileWriter("salida3.txt");
            bSalida = new BufferedWriter(fSalida);
            String linea1=null, linea2=null;
            int numerof1, numerof2;
            linea1 = bEntrada1.readLine();
            linea2 = bEntrada2.readLine();
            while(true){
                if(linea1==null && linea2==null){
                    break;
                }
                if(linea1==null){
                    recorrefichero2(linea2);
                    break;
                }
                if(linea2==null){
                    recorrefichero1(linea1);
                    break;
                }
                numerof1 = Integer.parseInt(linea1);
                numerof2 = Integer.parseInt(linea2);
                if(numerof1==numerof2){
                    bSalida.write(linea1);
                    linea1 = bEntrada1.readLine();
                    linea2 = bEntrada2.readLine();
                }else if(numerof1<numerof2)
                {
                    bSalida.write(linea1);
                    linea1 = bEntrada1.readLine();
                }else{
                    bSalida.write(linea2);
                    linea2 = bEntrada2.readLine();
                }

            }
            bSalida.flush();
            bSalida.close();
            fSalida.close();
            bEntrada1.close();
            bEntrada2.close();
            fEntrada1.close();
            fEntrada2.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }


    }

    private static void recorrefichero1(String linea1) throws IOException {
        while (true){
            fSalida.write(linea1);
            linea1 = bEntrada1.readLine();
            if (linea1==null){
                return;
            }
        }
    }

    private static void recorrefichero2(String linea2) throws IOException {
        while (true){
            fSalida.write(linea2);
            linea2 = bEntrada2.readLine();
            if (linea2==null){
                return;
            }
        }


    }
}
