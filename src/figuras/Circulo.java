package figuras;

public  class Circulo extends Figura {
	
	double radio;
	


	
	public Circulo(tipoForma forma, double radio) {
		super(forma);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}

	
	public double calculoAreaCirculo() {
		return   Math.PI*Math.pow(getRadio(), 2);
		
	}
	public double calculoPerimetroCirculo() {
		return 2*Math.PI*getRadio();
		 
	}
	 public void imprimirInformacionFiguras() {
	        System.out.println("Tipo de Figura: Círculo");
	        System.out.println("Radio ingresado: " + radio);
	        System.out.println("Área del círculo: " + calculoAreaCirculo());
	        System.out.println("Perímetro del círculo: " + calculoPerimetroCirculo());
	    }

	
}
