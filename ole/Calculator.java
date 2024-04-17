
package com.mycompany.example;

public class Calculator {

    public Calculator() {
    }
    
    public double division( double a, double b) throws Exception {
        
        if (b!=0){
            return a/b;
        }
    
    throw new Exception("No es posible dividir entre cero");
    }
    
}
