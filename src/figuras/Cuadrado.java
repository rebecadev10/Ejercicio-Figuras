package figuras;

public class Cuadrado extends Figura {
	double largoLado;
	
	
	
	
	
	public Cuadrado(tipoForma forma, double largoLado) {
		super(forma);
		this.largoLado = largoLado;
	}



	public double getLargoLado() {
		return largoLado;
	}



	public void setLargoLado(double largoLado) {
		this.largoLado = largoLado;
	}


	public double calculoAreaCuadrado() {
		return largoLado*largoLado;
		
		
	}
	public double calculoperimetroCuadrado() {
		return	4*largoLado;
		
		
	}

}
