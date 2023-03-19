/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_13_figuras_abstractas;

/**
 *
 * @author eduar
 */
public class Triangulo extends figura{
    
        
        private double altura;
        private double base;
    

    public Triangulo() {
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double calcularArea(){
        return (base * altura)/2;
    }
        @Override
    public double calcularPerimetro(){
        return (base * base)+ (altura * altura);
    }
    
    
    }

