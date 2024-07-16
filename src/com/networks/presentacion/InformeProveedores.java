package com.networks.presentacion;

import com.networks.modelo.Proveedor;
import com.networks.persistencia.AccesoTablaProveedores;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class InformeProveedores {
    public static void main(String[] args) {
        List<Proveedor> resultado;
        FileWriter paraEscribir;
        String nombreFichero = "informe_proveedores.txt";
        AccesoTablaProveedores atp1 = new AccesoTablaProveedores();
        FileWriter fsalida = null;

        try {
            fsalida = new FileWriter(nombreFichero);
            resultado = atp1.consultarTodos();
            fsalida.write(String.format(
                    " %5s %-40s %-30s %-15s %n"
                    ,"Id"
                    ,"Nombre"
                    ,"Persona Contacto"
                    ,"Telefono"));
            fsalida.write("=".repeat(100)+"\n");
            for(Proveedor elemento : resultado){
                fsalida.write(String.format(
                        """
                        %5d %-40s %-30s %-15s
                                """
                        ,elemento.getIdProveedor()
                        ,elemento.getNombre()
                        ,elemento.getpContacto()
                        ,elemento.getTelefono()
                ));

            }
            fsalida.flush();
            fsalida.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }
}
