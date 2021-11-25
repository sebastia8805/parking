/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueofinal.modelos;

/**
 *
 * @author Hp
 */
public class Conductor {

    static String getFechaOut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setId_vehiculos(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private int id;
    private String nombres;
    private String apellidos;
    private int cedula;
    private String idPlaca;
    private int idVehiculos;
    

    public Conductor() {
    }

    public Conductor(int id, String nombres, String apellidos, int cedula, String idPlaca,int idVehiculos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.idPlaca = idPlaca;
        this.idVehiculos = idVehiculos;
        
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getIdPlaca() {
        return idPlaca;
    }

    public void setIdPlaca(String idPlaca) {
        this.idPlaca = idPlaca;
    }
    
       public int getidVehiculos() {
        return idVehiculos;
    }

    public void setIdVehiculos(String idPlaca) {
        this.idVehiculos = idVehiculos;
    }

    void setIdVehiculos(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFechaIn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFechaOut(String fechaSalida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
 
    
}
