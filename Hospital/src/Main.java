import java.util.*;

public class Main {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		Paciente caso01 = new Paciente();
		String resposta;
		String respLocal;
		byte idade;
		String nome;
		
		System.out.println("Qual a sua idade?");
		idade = input.nextByte();
		
		caso01.setIdade(idade);
		
		System.out.println("Qual é o seu nome?");
		nome = input.next();
		
		caso01.setNome(nome);
		
		System.out.println("Você viajou recentemente? Sim ou Não");
		resposta = input.next().toUpperCase();
		
		if(resposta.equals("SIM")){
			System.out.println("O local para qual você viajou se encontra nesta lista?\n"
					+ "Rio de Janeiro\nSão Paulo\nEspanha\n"
					+ "França\nEUA\nChina\nItália");
			respLocal = input.next().toUpperCase();
			
			caso01.avaliaPaciente(resposta, respLocal);
		}
		else
			caso01.avaliaPaciente(resposta, "");
		
		System.out.println("Está gripado? Sim ou Não");
		resposta = input.next().toUpperCase();
		
		caso01.avaliaPaciente(resposta);
		
		System.out.println("Apresenta dores de cabeça? Sim ou Não");
		resposta = input.next().toUpperCase();
		
		caso01.avaliaPaciente(resposta);
		
		System.out.println("Apresenta dores de corpo? Sim ou Não");
		resposta = input.next().toUpperCase();
		
		caso01.avaliaPaciente(resposta);
		
		System.out.println("Apresenta febre? Sim ou Não");
		resposta = input.next().toUpperCase();
		
		caso01.avaliaPaciente(resposta);
		
		System.out.println(caso01.resultado());
		
	}

}
