/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._pp1;

/**
 *
 * @author Camila Alfaro Rivera
 */
public class Nodo {
    Libro dato;       // Dato almacenado en el nodo
    Nodo siguiente;  // Referencia al siguiente nodo en la pila
    
    public Nodo(Libro dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
