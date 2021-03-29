package br.edu.fatecmm.prjvolumeesfera;

public class Main {

    public static void main(String[] args) {
        Esfera esfera = new Esfera();
        double volume;
        boolean denovo;

        do {
            esfera.informeRaio();
            volume = esfera.calculaVolume();
            System.out.printf("\nO volume da esfera com raio %.2f é de: %.2f\n", esfera.getRaio(), volume);
            denovo = esfera.calculaDenovo();
        } while (denovo);
    }
}
