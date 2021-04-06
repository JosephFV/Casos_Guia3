package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nr = 0, edad = 0, num_aptos = 0;
		String nombre = "", estado = "", continuar = "S";
		
		while (continuar.equals("S") || continuar.equals("s")){
			nr++;
			System.out.println("-----------------------------");
			System.out.println(">>>> R E G I S T R O " +  "["+nr+"]" + " <<<<");
			System.out.println("-----------------------------");
			
			System.out.print("Nombre del participante");
			System.out.print("\n>>> ");
			nombre = sc.nextLine();
			
			System.out.print("Edad del participante");
			System.out.print("\n>>> ");
			edad = sc.nextInt();
			
			if (edad >= 18) {
				estado = "Apto para votar";
				num_aptos++;
			}
			else
				estado = "Menor de edad";
			
			System.out.println("Estado: " + estado);
			
			
			sc.nextLine();
			
			System.out.print("\n¿Desea registrar otro participante <S/N>?");
			System.out.print("\n>>> ");
			continuar = sc.nextLine();
		}
		
		System.out.println("\n-----------------------");
		System.out.println(">>>> R E S Ú M E N <<<<");
		System.out.println("-----------------------");
		System.out.println("Cantidad de participantes: " + nr);
		System.out.println("Participantes aptos para votar: " + num_aptos);
		

	}

}
