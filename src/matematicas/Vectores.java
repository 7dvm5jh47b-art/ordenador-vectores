/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematicas;

/**
 *
 * @author aaron
 */
public class Vectores {
    
    private int[] vector;
    
    public Vectores (int tamaño){
        vector = new int[tamaño];
    }
    
    public void agregar(int numero, int posicion){
        vector[posicion] = numero;
    }
    
    public void ordenar(){
        java.util.Arrays.sort(vector);
    }
    
    public int[] getVector(){
        return vector;
    }
 
    public int getTamaño(){
        return vector.length;
    }
    }
