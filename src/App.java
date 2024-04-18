import prova.Circulo;
import prova.Quadrado;
import prova.Retangulo;
import prova.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado("Roxo", 4);
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);

        System.out.println("Base Quadrado: " + quadrado.getArea());
        System.out.println("Base Triangulo: " + triangulo.getArea());
        System.out.println("Base Circulo: " + circulo.getArea());
        System.out.println("Base Retangulo: " + retangulo.getArea());

    }
}
