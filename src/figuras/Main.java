package figuras;

import figuras.Figura.tipoForma;

public class Main {

    public static void main(String[] args) {
        // Creación de un objeto de la clase Circulo
        Figura circulo = new Circulo(tipoForma.circulo,5); 
        Figura cuadrado = new Cuadrado(tipoForma.cuadrado,6);
        Figura rectangulo = new Rectangulo(tipoForma.rectangulo,2.5,4);
        Figura triangulo = new Triangulo(tipoForma.triangulo,3,3,3);
        
        
        circulo.imprimirInformacionFiguras();
        cuadrado.imprimirInformacionFiguras();
        rectangulo.imprimirInformacionFiguras();
        triangulo.imprimirInformacionFiguras();
    }
}
