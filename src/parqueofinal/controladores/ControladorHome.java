/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueofinal.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import parqueofinal.modelos.Conductor;
import parqueofinal.modelos.Vehiculos;
import parqueofinal.vistas.VistaHome;
import parqueofinal.vistas.VistaIngreso;
import parqueofinal.vistas.VistaSalida;



/**
 *
 * @author Hp
 */
public abstract class ControladorHome implements ActionListener{



    
    //ATRIBUTOS
    VistaHome vistahome = new VistaHome();
    VistaIngreso vistaingreso = new VistaIngreso();
    VistaSalida vistasalida = new VistaSalida();
    Vehiculos vehiculo = new Vehiculos();
    Conductor conductor = new Conductor();
    
    

    public ControladorHome(VistaHome vistahome,
            Vehiculos vehiculo,Conductor conductor) {
        
        this.vehiculo=vehiculo;
        this.conductor=conductor;
        this.vistahome=vistahome;
        vistahome.btnI.addActionListener(this);
        vistahome.btnR.addActionListener(this);
        vistahome.btnS.addActionListener(this);
    
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==vistahome.btnI){
             
            
            vistaingreso.setVisible(true);
            vistasalida.setVisible(false);
            
            
        }
        
        if(e.getSource()==vistahome.btnR){
            
            
            vistaingreso.setVisible(false);
            vistasalida.setVisible(true);
            
            
        }
        if(e.getSource()==vistahome.btnS){
            System.exit(0);
            
        }
        
       
        
        
        
        
        
        
        
    }
    
    
}

    
    
    
    
