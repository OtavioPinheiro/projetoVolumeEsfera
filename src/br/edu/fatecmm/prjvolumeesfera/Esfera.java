package br.edu.fatecmm.prjvolumeesfera;

import java.util.Scanner;

public class Esfera {
  private double raio = 0.0;
  private double PI = Math.PI;

  public double getRaio() {
    return this.raio;
  }

  public void informeRaio() {
    Scanner scanner = new Scanner(System.in);
    boolean ok;
    do {
      System.out.println("Por favor informe um valor positivo para o raio: ");
      try {
        this.raio = Double.parseDouble(String.join(".", scanner.nextLine().split(",")));
        if (this.raio < 0.0) {
          ok = false;
          throw new Exception();
        }
        else {
          ok = true;
        }
      } catch (Exception e) {
        ok = false;
        System.out.println("Informe um valor válido!");
      }
    } while (ok == false);
  }

  public double calculaVolume() {
    return (4/3) * this.PI * Math.pow(this.raio, 3);
  }

  public boolean calculaDenovo() {
    Scanner scanner= new Scanner(System.in);
    String resp;
    boolean ok = false;

    System.out.println("Deseja calcular o volume de novo?(S/N)");
    try {
      resp = scanner.nextLine().toLowerCase();
      if (resp.length() > 1 || !resp.equals("s") && !resp.equals("n")) {
        throw new Exception();
      }
      if (resp.equals("s")) {
        ok = true;
      }
      else {
        ok = false;
        System.out.println("Encerrando...");
      }
    } catch (Exception e) {
      System.out.println("Informe apenas S para sim e N para não.");
    }

    return ok;
  }
}
