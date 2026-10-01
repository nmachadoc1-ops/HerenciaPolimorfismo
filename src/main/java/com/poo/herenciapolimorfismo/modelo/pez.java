/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Crea el método nadar(). Cada vez que se llame, debe aumentar la profundidad y
mostrar un mensaje con el nombre del pez y la profundidad actual.
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class pez extends Animal{
    private int Profundidad;
    
    public pez(int Profundidad, String nombre) {
        super(nombre);
        this.Profundidad=0;
    }
    
    
    public pez(){
        super("Dory");
    }
    
    public void nadar(){
        Profundidad +=5;
         System.out.println(super.getNombre() + " Nada a "+ Profundidad + "Metros de profundidad" );
    }

    
    public void comer(String comida, double gramos){
       System.out.println(super.getNombre() + "Comio  "+ gramos + "gr de: " + comida );
    }
    
        
  @Override
    public void hacerSonido() {
        System.out.println(super.getNombre() + "hace glu glu");
    }
    
    
    
    
}
