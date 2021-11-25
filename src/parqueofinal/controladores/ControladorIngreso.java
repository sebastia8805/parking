/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueofinal.controladores;;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import parqueofinal.modelos.Conductor;
import parqueofinal.modelos.Vehiculos;
import parqueofinal.vistas.VistaIngreso;


/**
 *
 * @author Hp
 */
public class ControladorIngreso implements ActionListener  {

    
    
    //ATRIBUTOS
    VistaIngreso vistaingreso = new VistaIngreso();
    Vehiculos vehiculos= new Vehiculos();
    Conductor conductor = new Conductor();
    
    public ControladorIngreso(VistaIngreso vistaingreso,
            Vehiculos vehiculos,Conductor  conductor) {
        
        this.vehiculos = vehiculos;
        this.conductor= conductor;
        this.vistaingreso=vistaingreso;
        vistaingreso.btnI.addActionListener(this);
    

    
    
         
         //registro de escuderia
         
         vehiculos.setPlaca(vistaingreso.cajaPlaca.getText());
       
         
         
         
         //registro de conductor
         conductor.setId(Integer.parseInt(vistaingreso.cajaIdvehiculo.getText()));
         conductor.setNombres(vistaingreso.cajanombre.getText());
         conductor.setApellidos(vistaingreso.cajaapellido.getText());
         conductor.setCedula(Integer.parseInt(vistaingreso.cajaCedula.getText()));
         
        Date entrada = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaEntrada=formato.format(entrada);
        vehiculos.setFechaIn(fechaEntrada);
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
    }


    
    }
    

