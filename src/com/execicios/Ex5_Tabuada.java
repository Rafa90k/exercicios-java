package com.execicios;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Digite um numero: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada do: " + tabuada);

        for ( int i = 1; i <= 10 ; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

    }
}
