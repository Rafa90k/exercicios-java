package com.execicios;

import java.util.Scanner;

public class Ex3_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int superior = 0;
        int count = 0;
        int soma = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            soma = soma + numero;


            if (numero > superior) superior = numero;

            count = count + 1;

        }while (count < 5);
        System.out.println("O numero maior é o: " + superior);
        System.out.println("A media dos numeros digitados é : " + (soma / 5));
        }
}



