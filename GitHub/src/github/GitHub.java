/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

/**
 *
 * @author raauu
 */
public class GitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Sumaa;
        Sumaa = Suma(4,7);
        System.out.println("La suma es: " + Sumaa);
        
        String nombre = TuNombre("Raul");
        System.out.println("Tu nombre tiene: " + nombre.length() + " letras");
    }
 
    public static int Suma(int a, int b){
        int suma = a + b;
        return suma;
    }
    
    public static String TuNombre(String nombre){
        String nombreMas1 = nombre + 1;
        return nombreMas1;
    }
    
}
