import java.util.Scanner;

/*3– Armazenar o resultado acadêmico dos 10 alunos de uma turma e realizar as seguintes avaliações:
	- número de alunos aprovados;
	- nome dos alunos reprovados, todas as letras devem estar em maiúsculo;
*/

public class Alunos {
	
	private Scanner input = new Scanner(System.in);
	private String alunos[] = new String[10];
	private float nota[] = new float[10];
	private float media;

	public void resultadoAcademico() {
		
		for(int i=0;i<10;i++) {
			
			System.out.print("Qual o nome do aluno?");
			alunos[i] = input.next();
			
			System.out.print("Qual a nota do " + alunos[i] + "?");
			nota[i] = input.nextInt();
		}
		
		System.out.print("Qual é a média?");
		media = input.nextFloat();
		
		System.out.print("O número de alunos aprovados é:" + alunosAprovados() + "\n");
		alunosReprovados();
		
	}
	
	public int alunosAprovados() {
		
		int contador = 0;
		
		for(int i=0;i<10;i++) {
			if(nota[i] >= media) {
				contador++;
			}
		}
		return contador;
	}
	
	public void alunosReprovados() {
		
		String reprovados = new String("\n");
		
		for(int i=0;i<10;i++) {
			if(nota[i] < media) {
				reprovados += alunos[i].toUpperCase() + "\n";
			}
		}
		System.out.print("Os seguintes alunos foram reprovados:" + reprovados);
	}
}
