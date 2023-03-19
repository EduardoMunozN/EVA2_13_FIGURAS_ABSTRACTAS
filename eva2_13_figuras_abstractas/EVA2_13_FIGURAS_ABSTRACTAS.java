/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_13_figuras_abstractas;

/**
 *
 * @author eduar
 */
public class EVA2_13_FIGURAS_ABSTRACTAS {

    public static void main(String[] args) {
        //NO SE PUEDE CREAR OBJETO DE FIGURA
        //figura fig1 = new figura ();
        Circulo circu = new Circulo ();
        
    }
}

abstract class figura{

    public figura() {
    }
    
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
    
    
}
