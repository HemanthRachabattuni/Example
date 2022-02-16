package com.company;

import java.util.Scanner;

class Factorial {
   public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int x=sc.nextInt();
       int i=1,fact=1;
      while(i<=x){
          fact=fact*i;
          i++;
      }
      System.out.println("the factorial is"+" "+fact);
   }
}
