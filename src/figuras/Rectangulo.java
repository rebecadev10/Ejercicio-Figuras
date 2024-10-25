package figuras;

public class Rectangulo extends Figura {

	double altura;
	double base;
	

	
	
	
	public Rectangulo(tipoForma forma, double altura, double base) {
		super(forma);
		this.altura = altura;
		this.base = base;
	}
	
	
	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double calculoAreaRectangulo() {
		return base*altura;
		
	}
	public double calculoPerimetroRectangulo() {
		return 2*(base+altura);
		
	}
}
