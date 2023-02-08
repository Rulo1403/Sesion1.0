package com.Ruli.clase;

import javax.swing.*;

public class Persona {
    private String nombre, mensaje;
   private  float peso;
    private double imc;
    private float estatura;

    public Persona() {
    }

    public Persona(String nombre, String mensaje, float peso, double imc, float estatura) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.peso = peso;
        this.imc = imc;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "\n Hola" + getNombre()
                + "\n Su imc es de " +(peso/(estatura*estatura))+
                "\n Y tiene sobrepeso. Se le recomienda hacer ejercicio";
    }
}
