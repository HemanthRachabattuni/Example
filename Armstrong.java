package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=0;
        int sum=0;
        int rem;
        int temp;
        System.out.println("enter number");
        n= sc.nextInt();
        temp=n;
        while(n>0){
            rem=n%10;
            sum=(rem*rem*rem)+sum;
            n=n/10;

        }
        if(temp==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }

}
