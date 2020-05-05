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
	
	public Data(String data) {
		String[] dataAr = data.split(" /");
		this.dia = Integer.parseInt(dataAr[0]);
		this.mes = Integer.parseInt(dataAr[1]);
	}
	
	public void setData(Data data) {
		this.dia = data.dia;
		this.mes = data.mes;
	}
	
	public void setData(String data) {
		String[] dataAr = data.split(" /");
		this.dia = Integer.parseInt(dataAr[0]);
		this.mes = Integer.parseInt(dataAr[1]);
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
}
