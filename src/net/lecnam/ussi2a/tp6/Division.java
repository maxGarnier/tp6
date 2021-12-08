package net.lecnam.ussi2a.tp6;

import java.io.IOException;

public class Division {

    public double division1(int a, int b){
        double resultat;
        resultat = a / b;
        return resultat;
    }



    public double division2(int a, int b)  {
        try{
            return a / b;
        } catch (ArithmeticException e){
            System.out.println("Impossible de diviser par 0 !!!!");
        }

        return 0;
    }


    /*public Double division2(int a, int b){
       try{
         int resultat =  a / b;
         return (double) resultat;
       } catch (Exception e){
           System.out.println("Impossible de diviser par 0 !!!!");
       }
        return null;
    }*/

    public double division3(int a, int b) throws IOException{
        try{
            return a / b;
        } catch (ArithmeticException e){
            throw new IOException();
        }
    }

}
