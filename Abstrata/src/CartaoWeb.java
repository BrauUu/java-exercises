abstract public class CartaoWeb {
	
	private String destinatario;
	
	public CartaoWeb(String dest) {
		this.destinatario = dest;
	}
	
	abstract public String showMessage();
	
	public String getDestinatario() {
		return this.destinatario;
	}

}
