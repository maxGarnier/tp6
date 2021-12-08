package net.lecnam.ussi2a.tp6;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void exercice1(){
        Division d = new Division();
        double res =d.division1(10, 0);
        System.out.println(res);;                  //Exception in thread "main" java.lang.ArithmeticException: / by zero
                                                   // at net.lecnam.ussi2a.tp6.Division.division1(Division.java:7)
                                                   //  at net.lecnam.ussi2a.tp6.Main.main(Main.java:9)
    }
    public static void exercice2(){
        Division d = new Division();
        double res =d.division2(10, 0);
        System.out.println(res);
    }

    public static void exercice3() throws IOException {
        Division d = new Division();
        double res =d.division3(10, 0);
        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {

        //exercice3();
        Factorielle f = new Factorielle();

        try {
            f.calcul(null);
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }

        Scanner sc = new Scanner(System.in);

        boolean ok = false;

        while(!ok) {
            String entree = sc.next();

            try{
                double resultat = f.calcul(entree);
                System.out.println(resultat);
            }catch {
                
            }
        }

    }
}
