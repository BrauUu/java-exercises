
public class Voluntario extends Pessoa{

	public String cargo;
	private char tmCamisa;
	
	public Voluntario() {
		this.tmCamisa = 'G';
	}
	
	public void setTmCamisa(char tm) {
		if(tm == 'P' || tm == 'G' || tm == 'M') this.tmCamisa = tm;
	}
	
	public char getTmCamisa() {
		return this.tmCamisa;
	}
	
}
