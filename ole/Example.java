

package com.mycompany.example;


public class Example {

    public static void main(String[] args) throws Exception {
        
        Calculator calculator=new Calculator();
       
        
        try{
             double result=calculator.division(4,0 );
             System.out.println("total: "+result);
        } catch(Exception exception) {
            System.out.println ("Operaciòn ilegal");
            System.out.println(exception.toString());
        }
        
        
        
      
        
        
       
    }
}
