package com.networks.presentacion;

import com.networks.modelo.RangoComisiones;
import com.networks.persistencia.AccesoTablaRangoComisiones;

import java.io.*;
import java.math.BigDecimal;
import java.sql.SQLException;

public class ConvertirCSV {
    public static void main(String[] args) {
        AccesoTablaRangoComisiones atrc1 = new AccesoTablaRangoComisiones();
        //Declaración fichero y buffer de entrada
        FileReader fEntrada = null;
        String linea=null;
        try {
            fEntrada = new FileReader("rango_comisiones.csv");
            BufferedReader bEntrada = new BufferedReader(fEntrada);
            while(true){
                linea = bEntrada.readLine();
                System.out.println("Se ha leido -> " + linea);
                if (linea==null){
                    break;
                }
                RangoComisiones rc1 = convierteAObjetoRango(linea);
                atrc1.insertarRango(rc1);

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }
    public static RangoComisiones convierteAObjetoRango(String linea){
        String[]valores;
        valores = linea.split(",");
        RangoComisiones rc1 = new RangoComisiones(
                BigDecimal.valueOf(Double.parseDouble(valores[0])),
                BigDecimal.valueOf(Double.parseDouble(valores[1])),
                Double.parseDouble(valores[2])
                );
        return rc1;
    }
}
