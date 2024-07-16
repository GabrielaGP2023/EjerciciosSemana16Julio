package com.networks.persistencia;

import com.networks.modelo.Proveedor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoTablaProveedores extends Conexion{
    public List<Proveedor> consultarTodos() throws SQLException {
        Statement comando;
        ResultSet rejilla;
        String sqlSentencia = "Select * from suppliers;";
        List<Proveedor> resultado = new ArrayList<>();
        //1. Abrir la conexion
        abrirConexion();
        //2. Creo el statement - se obtiene de la conexión
        comando = miConexion.createStatement();
        //3. Ejecuto la sentecia
        rejilla = comando.executeQuery(sqlSentencia);
        //4. Verificar si hay resultado
        while(rejilla.next()){

            Proveedor p1 = new Proveedor(
                    rejilla.getInt("supplier_id"),
                    rejilla.getString("company_name"),
                    rejilla.getString("contact_name"),
                    rejilla.getString("phone"));
            resultado.add(p1);
        }
        //5. obtener cada valor de las columnas
        //6. devolver el resultado
        rejilla.close();
        comando.close();
        cerrarConexion();
        return resultado;
    }

}
