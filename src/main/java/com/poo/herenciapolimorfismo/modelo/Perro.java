/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

tenga los atributos privados edad (int) y raza (String) con sus getters;

tenga un constructor Perro(String nombre, int edad, String raza);

siga funcionando con los constructores que ya tenía, Perro() y Perro(String nombre). Estos deben asignar valores
por defecto a edad y raza.
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class Perro extends Animal {
    
    private String Raza;
    private int edad;

    public Perro(String nombre) {
        super(nombre);
    }
    

    public Perro(String Raza, int edad, String nombre) {
        super(nombre);
        this.Raza = Raza;
        this.edad = edad;
    }
    
    
    public Perro() {
        super("Pongo");
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
 
    
  @Override
  public void hacerSonido() {
    System.out.println(super.getNombre()+ " hace Guau guau!");
  }
}

