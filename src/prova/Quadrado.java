package prova;

import domain.Figura;
import domain.IComum;

public class Quadrado extends Figura implements IComum{
  private double lado1;

  public double getLado1() {
    return lado1;
  }
  public void setLado1(double lado1) {
    this.lado1 = lado1;
  }

  public Quadrado(String cor, double lado1) {
    super(cor);
    this.lado1 = lado1;
  }
  public Quadrado() {
    super();
  }

  @Override
  public double getArea() {
    return lado1 * lado1;
  }
  @Override
  public String toString() {
    return "Quadrado [lado1=" + lado1 + ", cor=" + cor + "]";
  }

  

  
  
}
