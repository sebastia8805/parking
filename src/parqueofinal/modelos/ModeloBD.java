/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueofinal.modelos;




import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 505
 */
public class ModeloBD {
    
    private final String servidor="jdbc:mysql://localhost/parqueadero";
    private final String usuario="root";
    private final String password="";

    public ModeloBD() {
    }
    
    public Connection conectarBD(){
        
        Connection conexion=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(servidor,usuario,password);
            System.out.println("Exito conectandonos");
            return conexion;
            
        }catch(Exception error){
            
            System.out.println("UPSS.. "+error);
            return null;
            
        }
    }
    
}

    

