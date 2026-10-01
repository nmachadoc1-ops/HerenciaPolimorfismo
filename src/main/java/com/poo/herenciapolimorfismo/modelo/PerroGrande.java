/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class PerroGrande extends Perro{
    private int PesoKg;

    public PerroGrande(int PesoKg, String Raza, int edad, String nombre) {
        super(Raza, edad, nombre);
        this.PesoKg = PesoKg;
    }

    public PerroGrande(int PesoKg) {
        this.PesoKg = PesoKg;
    }

    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre()+ " ¡¡GUAU!!"); 
    }
    
    
    
}
