package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int factorial=1;
		int numFactorial;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Ingrese un numero entre [0-10]: ");
			num=sc.nextInt();
		}while(num<0 || num >10);
		numFactorial=num;
		if(num==0) {
			System.out.println("El factorial de "+numFactorial+" es: "+factorial);
		}else {
			while(num!=0){
				factorial=factorial*num;
				num--;
			}
			System.out.println("El factorial de "+numFactorial+" es: "+factorial);
		}
		sc.close();
	}

}
