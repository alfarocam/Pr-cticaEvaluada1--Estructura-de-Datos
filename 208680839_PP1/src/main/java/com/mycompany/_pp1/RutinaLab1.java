/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._pp1;

/**
 *
 *  @author Camila Alfaro Rivera
 */
public class RutinaLab1 {
    public static void main(String[] args) {
        System.out.println("Practica Programada 1 - Camila Alfaro Rivera");
        // se crea varible de tipo PilaLibros
        PilaLibros pila1 = new PilaLibros();
        
        // los 6 libros a la pila, 2 libros Novela, 3 libros Poesía, 1 libro Ficción. 
        pila1.push(new Libro("Tan poca vida", "Hanya Yanagihara", "Novela", 1008 , "2016 "));
        pila1.push(new Libro("El Retrto de Dorian Gray", "Oscar Wilde", "Novela", 256 , "1890"));
        pila1.push(new Libro("Violet Bent Backwards over the Grass", "Lana Del Rey", "Poesia", 128, "2020"));
        pila1.push(new Libro("En esta noche, en este mundo", " Alejandra Pizarnik", "Poesia", 72 , "2017 "));
        pila1.push(new Libro("El amor, las mujeres y la vida", "Mario Benedetti", "Poesia", 208 , "1995"));
        pila1.push(new Libro("Un mundo feliz", "Aldous Huxley", "Ficción", 256 , "1932"));
        
        //muestra el tamaño de la pila
        System.out.println("El tamano de la pila es: " + pila1.retornaTamaño());
        
        //llama el metodo de contar libros por genero 
        //muestra la cantidad de libros de novela 
        System.out.println("Los libros del genero Novela son: " + pila1.cuentaLibrosGenero("Novela"));
        
        //llama el metodo para eliminar el libro de ficcion (esta en la cima por LIFO)
        pila1.eliminaLibro(0);
        
        //muestra otra vez el tamaño actualizado de la pila
        System.out.println("El tamano de la pila es: " + pila1.retornaTamaño());
        
        //llama a metodo retornaInversa 
        System.out.println("Los elementos de la pila son: " + pila1.retornaInversa());
    }
} 
  
