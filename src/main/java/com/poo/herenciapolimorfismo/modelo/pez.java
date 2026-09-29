/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class pez extends Animal{
    
    public pez(String nombre) {
        super(nombre);
    }
    
    public pez(){
        super("Dory");
    }

    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre() + "hace glu glu");
    }
    
    
    
}
