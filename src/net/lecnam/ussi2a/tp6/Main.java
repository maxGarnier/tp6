package net.lecnam.ussi2a.tp6;

public class Main {

    public static void exercice1(){
        Division d = new Division();
        System.out.println(d.division1(10, 0)); //Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at net.lecnam.ussi2a.tp6.Division.division1(Division.java:7)
        //  at net.lecnam.ussi2a.tp6.Main.main(Main.java:9)
    }
    public static void exercice2(){
        Division d = new Division();
        System.out.println(d.division2(10, 0)); //Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at net.lecnam.ussi2a.tp6.Division.division1(Division.java:7)
        //  at net.lecnam.ussi2a.tp6.Main.main(Main.java:9)
    }

    public static void main(String[] args) {

        exercice2();

    }
}
