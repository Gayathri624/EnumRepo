package com.cg.enums;

import java.util.Scanner;

public class EnumEX {
	
enum  Size
{ 
	SMALL , MEDIUM , LARGE 
	}
    
    Size pizzaSize;
    
    EnumEX(Size pizzaSize)
    {
        this.pizzaSize = pizzaSize;
        
    }
	sfdgdfgdfgdfg
    
    public void orderPizza()
    {
         switch(pizzaSize)
         {
         case SMALL:
           System.out.println("it is small sized pizza");
           break;
         case MEDIUM:
               System.out.println("it is Medium sized pizza");
               break;
         case LARGE:
               System.out.println("it is large sized pizza");
               break;
         
         }
         
    }
    
     public static void main(String [] str)
     {
           Scanner  sc = new Scanner(System.in);
           EnumEX obj = new EnumEX(Size.valueOf(sc.next()));
           obj.orderPizza();

           System.out.println("it is large sized pizza");
           System.out.println("it is large sized pizza");
           System.out.println("it is large sized pizza");
           
           

   
                
         }
   

}
