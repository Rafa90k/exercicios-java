package com.execicios;

import java.util.Scanner;

public class Ex4_ParImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;

        int numero;

        int quantPares = 0, quantImpares =0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();
        int count = 0;

        do {
            System.out.println("Numeros: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count ++;
        }while (count < quantNumeros);

        System.out.println("Quantidade pares: " + quantPares);
        System.out.println("Quantidade impares : " + quantImpares);
    }
}
