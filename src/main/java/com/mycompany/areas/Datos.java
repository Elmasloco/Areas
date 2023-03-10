/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areas;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class Datos {
   
    double base = 0.0;
    double altura = 0.0;
    double radio = 0.0;
    double areaCuadrado = 0.0;
    double areaCirculo = 0.0;
    double pi = 3.1416;
    
    public void lecuraDeDatos(){
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base"));
        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el radio"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la altura "));
    }
    
    public void areaCuadrado1(){
        areaCuadrado = base * altura;
    }
    
    public void areaCirculo1(){
        areaCirculo = pi * (radio * radio);
    }
    
    public void imprimirDatos(){
        JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + areaCuadrado);
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es: " + areaCirculo);
    }
    
}
