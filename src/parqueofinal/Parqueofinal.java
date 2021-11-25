/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueofinal;

import java.awt.event.ActionEvent;
import parqueofinal.controladores.ControladorHome;
import parqueofinal.vistas.VistaHome;
import parqueofinal.modelos.Conductor;
import parqueofinal.modelos.Vehiculos;

/**
 *
 * @author 505
 */
public class parqueofinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VistaHome vistahome = new VistaHome();
        vistahome.setVisible(true);
        Vehiculos vehiculos= new Vehiculos();
        Conductor conductor = new Conductor();
             
        ControladorHome controladorHome = 
                new ControladorHome(vistahome,vehiculos,conductor) {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
    }
    
}
