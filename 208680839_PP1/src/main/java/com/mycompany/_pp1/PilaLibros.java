/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._pp1;

/**
 *
 * @author Camila Alfaro Rivera
 */
public class PilaLibros extends Pila {

    /**
     * Elimina el libro en la posición indicada
     *
     * @author Camila Alfaro Rivera
     * @param posicion da la posición del libro a eliminar (en este caso 0 es la
     * cima)
     */
    public void eliminaLibro(int posicion) {
        if (posicion == 0) {
            pop();
            return;
        }
        eliminaLibroRecursivo(getCima(), posicion);
    }

    private void eliminaLibroRecursivo(Nodo actual, int posicion) {
        // caso base si no hay mas nodos se sale
        if (actual == null) {
            return;
        }
        //si estamos en el nodo anterior al que queremos eliminar
        if (posicion == 1) {
            if (actual.siguiente != null) {
                // Saltamos el nodo a eliminar
                actual.siguiente = actual.siguiente.siguiente;
            }
            return; 
        }

        //llamada recursiva y diminuye la posición
        eliminaLibroRecursivo(actual.siguiente, posicion - 1);
    }

    /**
     * Cuenta los libros de un género específico
     *
     * @author Camila Alfaro Rivera
     * @param genero género a contar
     * @return cantidad de libros del género
     */
    public int cuentaLibrosGenero(String genero) {
        int contador = 0;
        Nodo actual = getCima();
        while (actual != null) {
            if (actual.dato.getGenero().equals(genero)) {
                contador++;
            }
            actual = actual.siguiente;
        }
        return contador;
    }

    /**
     * Retorna el tamaño de la pila
     *
     * @author Camila Alfaro Rivera
     * @return la cantidad de libros en la pila
     */
    public int retornaTamaño() {
        int contador = 0;
        Nodo actual = getCima();
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    /**
     * Retorna los elementos en orden inverso en formato json
     *
     * @author Camila Alfaro Rivera
     * @return String con los elementos en formato json
     */
    public String retornaInversa() {
        StringBuilder sb = new StringBuilder("[\n");
        retornaInversaRecursivo(getCima(), sb);
        if (sb.length() > 2) {
            // se elimina la ultima coma y salto de linea
            sb.setLength(sb.length() - 2);
        }
        sb.append("\n]");
        return sb.toString();
    }

    private void retornaInversaRecursivo(Nodo nodo, StringBuilder sb) {
        //Si no hay nodos se sale
        if (nodo == null) {
            return;
        }

        //llamada recursiva 
        retornaInversaRecursivo(nodo.siguiente, sb);

        //se agrega el libro al stringbuilder aka json después de la llamada recursiva
        Libro libro = nodo.dato;
        sb.append("  {\"nombre del libro\": \"").append(libro.getNombre())
                .append("\", \"autor\": \"").append(libro.getAutor())
                .append("\", \"genero\": \"").append(libro.getGenero())
                .append("\", \"Cantidad de paginas\": ").append(libro.getCantidadPaginas())
                .append(", \"Fecha de publicacion\": \"").append(libro.getFechaPublicacion())
                .append("\"},\n");
    }
}
