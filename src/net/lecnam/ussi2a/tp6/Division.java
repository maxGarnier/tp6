package net.lecnam.ussi2a.tp6;

import java.io.IOException;

public class Division {

    public double division1(int a, int b){   // Aucune gestion du problème
        double resultat;
        resultat = a / b;
        return resultat;
    }



    public double division2(int a, int b)  {            // Gestion du problème mais de manière peut convaincante (renvoi d'une valeur numérique en cas d'exception)
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

    public double division3(int a, int b) throws IOException{    // Meilleur manière de gérer l'exception
        try{
            return a / b;
        } catch (ArithmeticException e){
            throw new IOException();
        }
    }

}
