/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package parqueofinal.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hp
 */
public class ConsultaVehiculos  extends ModeloBD{
    
    PreparedStatement consultaSQL;
    ResultSet resultadoSQL;

    public boolean registrarVehiculo(Vehiculos vehiculos){
        
        Connection conexion=conectarBD();
        String query="INSERT INTO (id_vehiculos,placa,horaEntrada,horaSalida)"
                + "VALUES (?,?,?,?)";
        
        try{
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
            consultaSQL.setString(1,vehiculos.getId_vehiculos());
            consultaSQL.setString(2,vehiculos.getPlaca());
            consultaSQL.setString(3,vehiculos.getFechaIn());
            consultaSQL.setString(4,vehiculos.getFechaOut());
            
            
            //Ejecuto la consulta
            int resultado=consultaSQL.executeUpdate();
            
            //validando el resultado
            return resultado>0;
            
        }catch(SQLException error){
            System.out.println("NEA... "+error);
            return false;
        }
        
    }
    
   public Vehiculos buscarVehiculo(int id){
       
        Connection conexion=conectarBD();
        String query="SELECT * from vehiculos where id=?";
        
        try{
            
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
             consultaSQL.setInt(1, id);
            
            //Ejecuto la consulta
            resultadoSQL=consultaSQL.executeQuery();
            
            //Orgaizo el resultado
            Vehiculos vehiculo= new Vehiculos();
            if(resultadoSQL.next()){
                
                vehiculo.setId_vehiculos(resultadoSQL.getString("id"));
                vehiculo.setPlaca(resultadoSQL.getString("placa"));
                vehiculo.setFechaIn(resultadoSQL.getString("horaEntrada"));
                vehiculo.setFechaOut(resultadoSQL.getString("horaSalida"));
               
                
                return vehiculo;
                
            }else{
                return null;
            }
            
         
            
        }catch(Exception error){
            System.out.println("upsss... "+error);
            return null;
        }
        
       
   }

   
}
           
    

