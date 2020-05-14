
public class CartaoDiaDasMaes extends CartaoWeb {
	
	public CartaoDiaDasMaes(String dest) {
		super(dest);
	}
	
	public String showMessage() {
		return "Feliz dia das Mães, " + this.getDestinatario();
	}

}
