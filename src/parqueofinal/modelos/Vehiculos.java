/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package parqueofinal.modelos;
/**
 *
 * @author Hp
 */
public class Vehiculos {
    
    private String id_vehiculos;
    private String placa;
     private String fechaIn;
    private String fechaOut;

    public Vehiculos() {
    }

    public Vehiculos (String id_vehiculos, String placa, String fechaIn, String fechaOut) {
        this.id_vehiculos = id_vehiculos;
        this.placa = placa;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
    }

    public String getId_vehiculos() {
        return id_vehiculos;
    }

    public void setId_vehiculos(String id_vehiculos) {
        this.id_vehiculos = id_vehiculos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(String fechaIn) {
        this.fechaIn = fechaIn;
    }

    public String getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(String fechaOut) {
        this.fechaOut = fechaOut;
    }
   

    
    
    
    
    
}
