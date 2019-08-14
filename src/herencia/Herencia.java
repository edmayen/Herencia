/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Date;

/**
 *
 * @author edmayen
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado1=new Empleado("Juan",25000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("Lomas");
        System.out.println("empleado1: "+empleado1);
        
        Empleado empleado2=new Empleado("Juanita",20000);
        empleado2.setEdad(20);
        empleado2.setGenero('F');
        empleado2.setDireccion("Linda");
        System.out.println("empleado2: "+empleado2);
        
        Cliente cliente1=new Cliente(new Date(),true);
        cliente1.setNombre("Monse");
        cliente1.setEdad(22);
        cliente1.setGenero('F');
        cliente1.setDireccion("Lomas");
        System.out.println("Cliente 1: "+cliente1);
    }
    
}
