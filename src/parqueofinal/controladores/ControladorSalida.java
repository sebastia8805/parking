/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueofinal.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import parqueofinal.modelos.Conductor;
import parqueofinal.modelos.ConsultaConductor;
import parqueofinal.modelos.ConsultaVehiculos;
import parqueofinal.modelos.Vehiculos;
import parqueofinal.vistas.VistaSalida;



public class ControladorSalida implements ActionListener {
    
    //Atributos
    VistaSalida vistasalida = new VistaSalida();
    Vehiculos vehiculos = new Vehiculos();
    Conductor conductor = new Conductor();

    public ControladorSalida(VistaSalida vistasalida, Vehiculos vehiculos,Conductor conductor) {
        
        this.vistasalida = vistasalida;
        this.vehiculos = vehiculos;
        this.conductor = conductor;
        vistasalida.btnsalida.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
         ConsultaVehiculos consultaVehiculos= 
                 new ConsultaVehiculos();
         
         ConsultaConductor consultaConductor = 
                 new ConsultaConductor();
         
         //Consultar los datos del piloto a buscar para poder editarlo
        conductor=consultaConductor.buscarConductor(Integer.parseInt(vistasalida.cajaplacasalida.getText()));
        
         //consultar la fecha entrada STRING
         String fechaEntrada=conductor.getFechaIn();
         
         //convertir la FECHA STRING EN DATE
         try{
             Date entrada = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(fechaEntrada);
             
             Date salida = new Date();
             SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             String fechaSalida =formato.format(salida);
             
             //rutina para calcular la resta de tiempo
             long tiempoDiferencia=salida.getTime()-entrada.getTime();
             TimeUnit unidadTiempo=TimeUnit.MINUTES;
             long tiempoEnEscuderia=unidadTiempo.convert(tiempoDiferencia,TimeUnit.MILLISECONDS);
             
             
             
             //llevemos el valor de la fecha salida STRING al objeto piloto
             conductor.setFechaOut(fechaSalida);
             
             //ejecutar la consulta para actualizar el piloto
             if(consultaConductor.actualizarPiloto(conductor)){
                  JOptionPane.showMessageDialog(null, "Exito retirando, se quedo: "+tiempoEnEscuderia);
             }else{
                 JOptionPane.showMessageDialog(null, "Fallamos retirando");
             }
                     
         }catch(ParseException error){
             System.out.println("upsss.. "+error);
         }
         
         
    }

  
    
    
    
}
