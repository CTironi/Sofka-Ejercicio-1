package com.sofka.proyect;

import javax.swing.*;

public class Proyecto_Bienvenido {
    public static void main(String[] args) {
        String nombre;
        String celular;
        String edad;

        nombre = JOptionPane.showInputDialog("Ingresar el Nombre de Usuario");
        celular = JOptionPane.showInputDialog("Ingresar el Numero de Celular");
        edad = JOptionPane.showInputDialog("Ingresar la Edad del Usuario");

        JOptionPane.showMessageDialog(null, "Bienvenido Señor " + nombre + ", es un placer para nosotros contar con una persona de " + edad + " años.\n\"Proximamente nos comunicaremos con usted al numero " + celular + ".\n\"Feliz día");
    }

}
