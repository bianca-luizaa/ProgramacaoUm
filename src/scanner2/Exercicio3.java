package scanner2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distancia = 420;
        double litros = 35;

        double consumoMedio = distancia / litros;
        double litrosPara100Km = 100 / consumoMedio;

        System.out.println("Consumo médio: " + consumoMedio + " km/l");
        System.out.println("Litros para 100 km: " + litrosPara100Km);

        sc.close();
    }
}