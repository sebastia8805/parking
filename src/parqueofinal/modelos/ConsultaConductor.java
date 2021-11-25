/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueofinal.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Hp
 */
public class ConsultaConductor extends ModeloBD {

      PreparedStatement consultaSQL;
    ResultSet resultadoSQL;
    
    public boolean registrarConductor(Conductor conductor){
        
        Connection conexion=ModeloBD();
        String query="INSERT INTO conductores(nombres,apellidos,cedula,id_Vehiculos)"
                + "VALUES (?,?,?,?,?,?)";
        
        try{
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
            consultaSQL.setString(1,conductor.getNombres());
            consultaSQL.setString(2,conductor.getApellidos());
            consultaSQL.setInt(3,conductor.getCedula());
            consultaSQL.setInt(4,conductor.getidVehiculos());
            consultaSQL.setString(5,Conductor.getFechaOut());
            
            //Ejecuto la consulta
            int resultado=consultaSQL.executeUpdate();
            
            //validando el resultado
            if(resultado>0){
              return true;  
            }else{
               return false; 
            }
            
        }catch(Exception error){
            System.out.println("upsss... "+error);
            return false;
        }
        
    }
    
    public Conductor buscarConductor(int id){
       
        Connection conexion=ModeloBD();
        String query="SELECT * from conducotres where id=?";
        
        try{
            
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
            consultaSQL.setInt(1, id);
            
            //Ejecuto la consulta
            resultadoSQL=consultaSQL.executeQuery();
             
            //Orgaizo el resultado
           Conductor conductor= new Conductor();
            if(resultadoSQL.next()){
                
                conductor.setId(resultadoSQL.getInt("id"));
                conductor.setNombres(resultadoSQL.getString("nombres"));
                conductor.setApellidos(resultadoSQL.getString("apellidos"));
                conductor.setCedula(resultadoSQL.getInt("cedula"));
                conductor.setIdVehiculos(resultadoSQL.getInt("idVehiculos"));
                
                return conductor;
                
                
            }else{
                return null;
            }
            
         
            
        }catch(Exception error){
            System.out.println("upsss... "+error);
            return null;
        }
        
       
   }
    
    
   public  boolean actualizarPiloto(Conductor conductor){
       
       Connection conexion=conectarBD();
       String query="UPDATE conductores SET horaSalida=? WHERE id=?";
       
       try{
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
            consultaSQL.setString(1,conductor.getFechaOut());
            consultaSQL.setInt(2,conductor.getId());
           
            
            //Ejecuto la consulta
            int resultado=consultaSQL.executeUpdate();
            
            //validando el resultado
            if(resultado>0){
              return true;  
            }else{
               return false; 
            }
            
        }catch(Exception error){
            System.out.println("upsss... "+error);
            return false;
        }
       
       
       
   }

    private Connection ModeloBD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

