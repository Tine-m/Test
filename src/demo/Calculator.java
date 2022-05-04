package demo;

public class Calculator {

  public int sum(int num1, int num2) {
    if (num1 > 1000 || num2 > 1000) {
      throw new IllegalArgumentException();
    }
    return num1 + num2;
  }

  public double sum(double dec1, double dec2) {
    return dec1 + dec2;
  }
}
