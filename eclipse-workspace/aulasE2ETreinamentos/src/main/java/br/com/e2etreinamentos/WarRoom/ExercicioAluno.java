package br.com.e2etreinamentos.WarRoom;

import java.util.Scanner;

public class ExercicioAluno {

	private static Scanner ent;

	public static void main(String[] args) {
		
		// Guardar a nota do aluno, se ele tirar 7 ou mais passou de ano, Entre 5 e 6.9 ficou de recuperação, abaixo de 5 reprovado. 
		
		ent = new Scanner(System.in);
		System.out.println("Digite sua nota: ");
		int nota = ent.nextInt();
		
		if (nota >= 7) {
			System.out.println("Parabens! Você passou de ano!");
		} else if ((nota >= 5) && (nota < 6.9)) {
			System.out.println("Você ficou de recuperação");
		} else if (nota <5) {
			System.out.println("Infelizmente voce foi reprovado");
		}

	}

}
