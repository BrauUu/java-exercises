public class CartaoDiaDosNamorados extends CartaoWeb {

	public CartaoDiaDosNamorados(String dest) {
		super(dest);
	}
	
	public String showMessage() {
		return "Feliz dia dos Namorados, " + this.getDestinatario();
	}
}
