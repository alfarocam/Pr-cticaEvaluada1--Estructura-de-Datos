/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._pp1;

/**
 *
 * @author Camila Alfaro Rivera
 */
public class Pila {

    private Nodo cima; // Referencia al ultimo nodo apilado (cima)

    public Pila() {
        this.cima = null; // Inicialmente la pila está vacía
    }
// Metodo para apilar un elemento

    public void push(Libro dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cima;// El nuevo nodo apunta a la antigua cima
        cima = nuevoNodo; // La cima ahora es el nuevo nodo
    }
// Metodo para desapilar un elemento

    public Libro pop() {
        if (cima == null) {
            System.out.println("Error: La pila esta vacia.");
            return null;
        }
        Libro dato = cima.dato;// Guardar el dato de la cima
        cima = cima.siguiente;// Mover la cima al siguiente nodo
        return dato;
    }
    // Método para mostrar el contenido actual de la pila

    public void mostrar() {
        if (cima == null) {
            System.out.println("La pila esta vacia.");
            return;
        }
        Nodo actual = cima;
        System.out.println("Contenido de la pila:");
        while (actual != null) {
            System.out.println("Libro: " + actual.dato.getNombre()
                    + ", Autor: " + actual.dato.getAutor()
                    + ", Genero: " + actual.dato.getGenero());
            actual = actual.siguiente;
        }
    }

    protected Nodo getCima() {
        return cima;
    }

    protected void setCima(Nodo cima) {
        this.cima = cima;
    }
}
