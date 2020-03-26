
public class Paciente {

		String nome;
		byte   idade;
		float percentual;
		
		public Paciente() {
			this.percentual = 0;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setIdade(byte idade) {
			this.idade = idade;
		}
		
		public void avaliaPaciente(String resposta) {
			if (resposta.equals("SIM")) {
				if(this.percentual > 0)
					this.percentual += 15;
				else
					this.percentual += 10;
			}
			else if(resposta.equals("NÃO")) {
				
			}
				
			else 
				System.out.println("Resposta inválida");
			
			
		}
		
		public void avaliaPaciente(String resposta, String respLocal) {
			if(resposta.equals("SIM")) {
				if(respLocal.equals("SIM") ) {
					this.percentual += 50;
				}
				else
					this.percentual += 15;
				
			}
			else if(resposta.equals("NÃO")) {
				
			}
				
			else
				System.out.println("Resposta inválida");
		}
		
		public String resultado() {
			if(this.percentual > 50 && this.percentual < 70)
				return "É recomendado para você que fique em quarentena.";
			else if (this.percentual > 70 ) {
				if(this.idade > 50)
					return "Procure o hospital mais próximo para internação imediata.";
				else
					return "Procure o hospital mais próximo imediatamente.";
			}
			else { 
				return "Você aparentemente está bem, porém mantenha "
						+ "a higienização e os cuidados necessários";
			}
		}
		
			
		
	
}
