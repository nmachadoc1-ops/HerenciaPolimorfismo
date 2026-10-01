/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Crea el método volar(). Cada vez que se llame, debe aumentar la altura y mostrar un
mensaje con el nombre del pájaro y la altura actual.
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pajaro extends Animal{
    
    private int altura;
    
    
    
    
    
    public Pajaro(String nombre) {
        super(nombre);
        this.altura=0;
    }
    
    public Pajaro(){
        super("Arnol");
    }

    
    
    public void volar(){
        altura+=10;
         System.out.println(super.getNombre() + " Vuela a "+ altura + "Metros de altura" );
    }

    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre()+ " hace kikiriki");
    }
    
    
    
}
