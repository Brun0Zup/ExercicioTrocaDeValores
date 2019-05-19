package com.br.inverter.dois.valores;

import java.util.Scanner;

public class AppValoresTrocados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Me diga o valor A");
		a = entrada.nextInt();
		
		System.out.println("Me diga o valor B");
		b = entrada.nextInt();
		 
		int troca = a;
		a = b;
		b = troca;
		
		System.out.println("O valor de A é " + a);
		System.out.println("O valor de B é " + b);
	}

}
