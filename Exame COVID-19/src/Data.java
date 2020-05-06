public class Data {
	
	private int dia, mes;
	
	public Data(Data data) {
		this.dia = data.dia;
		this.mes = data.mes;
	}
	
	public Data(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}
	
	public void setData(Data data) {
		this.dia = data.dia;
		this.mes = data.mes;
	}
	
	public void setData(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public String toString() {
		return dia+"/"+mes+"\n";
	}
}
