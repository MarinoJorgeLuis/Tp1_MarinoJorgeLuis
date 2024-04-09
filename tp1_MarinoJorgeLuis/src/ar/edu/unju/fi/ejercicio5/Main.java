package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Ingrese un numero entre [1-9]: ");
			num=sc.nextInt();
		}while(num<1 || num >9);
		
		for(i=0;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}
		sc.close();
	}

}
