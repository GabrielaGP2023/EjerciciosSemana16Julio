package com.networks.presentacion;

import java.io.*;

public class LeerFicheroGrabar {
    public static void main(String[] args) {
        try {
            //Declaración fichero y buffer de entrada
            FileReader fEntrada1 = new FileReader("entrada1.txt");
            BufferedReader bEntrada1 = new BufferedReader(fEntrada1);
            FileReader fEntrada2 = new FileReader("entrada2.txt");
            BufferedReader bEntrada2 = new BufferedReader(fEntrada2);
            //Declaración fichero y buffer de salida
            FileWriter fSalida = new FileWriter("salida3.txt");
            BufferedWriter bSalida = new BufferedWriter(fSalida);
            String linea1=null, linea2=null;
            while(true){
                linea1 = bEntrada1.readLine();
                linea2 = bEntrada2.readLine();
                System.out.println("Fichero 1 Se ha leido -> " + linea1);
                System.out.println("Fichero 2 Se ha leido -> " + linea2);
                if (linea1==null || linea2 == null){
                    break;
                }
                //llega hasta aquí se ha podido leer en los dos archivos
                if (linea1.equals(linea2)) {
                    bSalida.write(linea1+"\n");
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
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }

