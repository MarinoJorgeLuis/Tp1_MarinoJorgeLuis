package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("El numero es par: "+num*3);
		}else {
			System.out.println("El numero es impar: "+num*2);
		}
		sc.close();
	}
}
