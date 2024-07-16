package com.networks.persistencia;

import com.networks.modelo.RangoComisiones;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoTablaRangoComisiones extends Conexion{

    public int insertarRango(RangoComisiones r) throws SQLException {
        //1. Declarar variables
        PreparedStatement comando;
        int resultado;
        String sql =
                """
                        insert into rango_comisiones
                        (limite_inferior, limite_superior,porcentaje_comision)
                        values
                        (?,?,?)
                        """;
        //2. Abrir conexion
        abrirConexion();

        //3. Obtener el Statement de la conexion
        comando = miConexion.prepareStatement(sql);
        comando.setBigDecimal(1,r.getLimiteInferior());
        comando.setBigDecimal(2,r.getLimiteSuperior());
        comando.setDouble(3,r.getPorcentaje());
        resultado = comando.executeUpdate();
        comando.close();
        cerrarConexion();
        //4. devolver el resultado
        return resultado;
    }
}
