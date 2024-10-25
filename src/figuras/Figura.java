package figuras;

public abstract class Figura {
	
	enum tipoForma{circulo,cuadrado,rectangulo,triangulo};
	tipoForma forma;
	
	public Figura(tipoForma forma) {
		super();
		this.forma = forma;
	}

		public tipoForma getForma() {
		return forma;
	}




	public void setForma(tipoForma forma) {
		this.forma = forma;
	}




	 // Método para imprimir la información de la figura
    public void imprimirInformacionFiguras() {
        if (this.forma == tipoForma.circulo) {
            Circulo c = (Circulo) this;
            System.out.println("Tipo de Figura: Círculo");
            System.out.println("Radio: " + c.getRadio());
            System.out.println("Área del círculo: " + c.calculoAreaCirculo());
            System.out.println("Perímetro del círculo: " + c.calculoPerimetroCirculo());
        } else if (this.forma == tipoForma.cuadrado) {
            Cuadrado c = (Cuadrado) this;
            System.out.println("Tipo de Figura: Cuadrado");
            System.out.println("Lado: " + c.getLargoLado());
            System.out.println("Área del cuadrado: " + c.calculoAreaCuadrado());
            System.out.println("Perímetro del cuadrado: " + c.calculoperimetroCuadrado());
        } else if (this.forma == tipoForma.rectangulo) {
            Rectangulo r = (Rectangulo) this;
            System.out.println("Tipo de Figura: Rectángulo");
            System.out.println("Base: " + r.getBase() + ", Altura: " + r.getAltura());
            System.out.println("Área del rectángulo: " + r.calculoAreaRectangulo());
            System.out.println("Perímetro del rectángulo: " + r.calculoPerimetroRectangulo());
        } 
        else if (this.forma == tipoForma.triangulo) {
            Triangulo t = (Triangulo) this;
            System.out.println("Tipo de Figura: Triángulo");
            System.out.println("Lado1: " +t.getLado1() +"  Lado 2: "+ t.getLado2()+"  Lado 3: "+ t.getLado3());
            System.out.println("De acuerdo a sus lados el triangulo es: "+ t.determinarTipoTriangulo());
            System.out.println("Área del triángulo: " + t.calcularArea());
            System.out.println("Perímetro del triángulo: " + t.calcularPerimetro());
        }
    }
}

	
	
	
	




