package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Wilson Rueda
 */
public class QueryEmpleados extends Conexion{
    
    public boolean registrar(Empleado empleado){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO empleados(nombre, apellido, salario) VALUES (?,?,?)";

        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setInt(3, empleado.getSalario());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
               System.err.println(e);   
            }
        }
    }
    
    public boolean modificar(Empleado empleado){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPPDATE empleados SET nombre = ?, apellido = ?, salario = ? WHERE id = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setFloat(3, empleado.getSalario());
            ps.setInt(4, empleado.getId());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
               System.err.println(e);   
            }
        }
    }
    
    public boolean eliminar(Empleado empleado){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM empleados WHERE ID = ? ";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, empleado.getId());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
               System.err.println(e);   
            }
        }
    }  
    
    public boolean buscar(Empleado empleado){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT * FROM empleados WHERE nombre = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getNombre());
            rs = ps.executeQuery();

            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
               System.err.println(e);   
            }
        }
    }
}
