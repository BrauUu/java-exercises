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

	public String getData() {
		if(dia < 10 && mes > 9)
			return "0" + this.dia + "/" + this.mes;
		else if(dia < 10 && mes < 10)
			return "0" + this.dia + "/" + "0" + this.mes;
		else if (dia > 9 && mes < 10)
			return this.dia + "/" + "0" + this.mes;
		else
			return this.dia + "/" + this.mes;
	}
}
