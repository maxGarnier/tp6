package net.lecnam.ussi2a.tp6;

public class Division {

    public double division1(int a, int b){
        double resultat;
        resultat = a / b;
        return resultat;
    }

    public double division2(int a, int b){
       try{
        return a / b;
       } catch (Exception e){
           System.out.println("Impossible de diviser par 0 !!!!");
       }
        return 0;
    }

}
