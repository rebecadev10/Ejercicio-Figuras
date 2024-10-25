package figuras;

public class Triangulo extends Figura {
	double lado1;
	double lado2;
	double lado3;
	
	
	

	public Triangulo(tipoForma forma, double lado1, double lado2, double lado3) {
		super(forma);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public String determinarTipoTriangulo() {
		if (getLado1()==getLado2()&& getLado2()==getLado3()&&getLado3()==getLado1()) {
			System.out.println("El triangulo es equilatero");
			return "Equilatero";
			
		}else if(getLado1()==getLado2() || getLado2()==getLado3()||getLado3()==getLado1()) {
			return "Isoceles";
		}else {
			return "Escaleno";
		}
		
	}
//	el perimetro de un triangulo es igual a la suma de todos sus lados
	public double calcularPerimetro() {
		
		return getLado1()+getLado2()+getLado3();
		
	}
//	 aplicar la fórmula de Herón para hallar el area del triangulo ya que sabemos la longitud de los lados
	
	public double calcularArea() {
		 double s = calcularPerimetro() / 2; // semiperímetro
	        return Math.sqrt(s * (s - getLado1()) * (s - getLado2()) * (s - getLado3()));
	}
	
	
	
	
	
	

}
