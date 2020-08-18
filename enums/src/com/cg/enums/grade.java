package com.cg.enums;

import java.util.Scanner;

public class grade{
	 
        enum Grade 
           { 
               Average,Good,Excellence; 
           } 
       public static void main(String[] args) {
           // TODO Auto-generated method stub
            int marks[]=new int[5];
            int sum=0;
            int grade;
           // static int average=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the marks:");
             for(int i=0; i<5; i++ ) {
                 marks[i]=sc.nextInt();
               sum+=marks[i];
             }
               int average=sum/5;
               System.out.println("The average is "+average);
             if(average>=80)
               {
                  grade=1;
               }
               else if(average>=60 && average<=80 )
               {
                  grade=2;
               } 
               else if(average>=45 && average<=60)
               {
                   grade=3;
               }
               else
               {
                   grade=4;
               }
             switch(grade) {
             case 1:
                 System.out.println("The grade is Excellent");
               break;
             case 2:
                 System.out.println("The grade is Good");
              break;
             case 3:
                 System.out.println("The grade is Average");
                 break;
             case 4:
                 System.out.println("Fail");
              break;
           }
       }





   }





	 