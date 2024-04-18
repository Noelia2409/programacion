
package com.mycompany.practica;

     
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number = 0; // Inicializamos la variable para evitar errores de compilación
        boolean inputIsValid = false;
        
        while (!inputIsValid) {
            try {
                System.out.println("Ingrese un valor entero:");
                number = scanner.nextInt();
                inputIsValid = true; // Marcamos que la entrada es válida para salir del bucle
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar valores numéricos.");
                scanner.nextLine(); // Limpiamos el buffer del scanner
            }
        }
        
        int square = number * number;
        System.out.println("El cuadrado de " + number + " es " + square);
        
        scanner.close(); // Cerramos el scanner al finalizar
    }
}

        
        
    

