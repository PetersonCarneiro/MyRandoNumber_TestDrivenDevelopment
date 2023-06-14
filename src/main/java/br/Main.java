package br;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IntervaloInvalidoException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite intervalo inicial");
        int a = sc.nextInt();

        System.out.println("Digite intervalo final");
        int b = sc.nextInt();

        MyRandomNumber myRandomNumber = new MyRandomNumber();

        for (int i = 0; i<=10;i++) {
            int c = myRandomNumber.nextRandomNumber(a,b);
            System.out.println(c);
        }
    }
}