import prova.Circulo;
import prova.Retangulo;
import prova.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);

        System.out.println("Base Triangulo: " + triangulo.getArea());
        System.out.println("Base Circulo: " + circulo.getArea());
        System.out.println("Base Retangulo: " + retangulo.getArea());

    }
}
