/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._pp1;

/**
 *
 * @author Camila Alfaro Rivera
 */
public class Libro {
    //Declaracion de variables
    private String nombre;
    private String autor;
    private String genero;
    private int cantidadPaginas;
    private String fechaPublicacion;
    //contructor con parametros
    public Libro(String nombre, String autor, String genero, int cantidadPaginas, String fechaPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.cantidadPaginas = cantidadPaginas;
        this.fechaPublicacion = fechaPublicacion;
    }
    //metodos get y set 
    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    //get
    public String getNombre() {
        return nombre;
    }
    public String getAutor() {
        return autor;
    }
    public String getGenero() {
        return genero;
    }
    public int getCantidadPaginas() {
        return cantidadPaginas;
    }
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
   
}
