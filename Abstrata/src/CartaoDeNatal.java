public class CartaoDeNatal extends CartaoWeb {
	
	public CartaoDeNatal(String dest) {
		super(dest);
	}
	
	public String showMessage() {
		return  this.getDestinatario() + ", Feliz Natal!";
	}

}
