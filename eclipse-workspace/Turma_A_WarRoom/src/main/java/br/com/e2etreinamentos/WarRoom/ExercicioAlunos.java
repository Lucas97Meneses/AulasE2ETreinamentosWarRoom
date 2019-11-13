package br.com.roomscrool.aulas;

import java.util.Scanner;

public class ExercicioAlunos {

	public static void main(String[] args) {
		// Guardar a nota de 3 alunos, E mostrar o aluno com a maior nota e o aluno com a menor nota //
		Scanner ent = new Scanner(System.in);
		
            // Nota aluno 1
            System.out.println("Aluno 1, digite sua nota: ");
            int aluno1 = ent.nextInt();
            int notaAluno1;
            
            
            if ((aluno1 >= 0) && (aluno1 <4)) {
    			System.out.println("Terceiro lugar, infelizmente");
    		} else if ((aluno1 >= 5) && (aluno1 < 7)) {
    			System.out.println("Segundo lugar.");
    		} else if (aluno1 <= 10) {
    			System.out.println("primeiro lugar, parabens!");
    		}
            
            // Nota aluno 2
            System.out.println("Aluno 2, digite sua nota: ");
            int aluno2 = ent.nextInt();
            int notaAluno2;
            if ((aluno2 >= 0) && (aluno2 <4)) {
    			System.out.println("Terceiro lugar, infelizmente");
    		} else if ((aluno2 >= 5) && (aluno2 < 7)) {
    			System.out.println("Segundo lugar.");
    		} else if (aluno2 <= 10) {
    			System.out.println("primeiro lugar, parabens!");
    		}
            
            // Nota aluno 3
            System.out.println("Aluno 3, digite sua nota: ");
            int aluno3 = ent.nextInt();
            int notaAluno3;
            
    			System.out.println("Terceiro lugar, infelizmente");
    		} else if ((aluno3 >= 5) && (aluno3 < 7)) {
    			System.out.println("Segundo lugar.");
    		} else if (aluno3 <= 10) {
    			System.out.println("primeiro lugar, parabens!");
    		}
	}
}

