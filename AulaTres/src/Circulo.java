public class Circulo extends Figura {
  private double raio;

  public Circulo() {
  }

  public Circulo(double raio) {
    this.raio = raio;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }
  
  public double area() {
    return Math.PI * Math.pow(this.raio, 2);
  }
  
  public double perimetro() {
    return 2 * Math.PI * this.raio;
  }
}