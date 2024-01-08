package main;

import herencia.circuloAt;
import herencia.logica;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = dato.nextDouble();

        circuloAt circulo = new circuloAt(radio);

        System.out.println(circulo);

        logica calculadora =new logica();

        System.out.println("Area del circulo: "+ calculadora.calcArea(radio));
        System.out.println("Perímetro del círculo: " + calculadora.calcPerimetro(radio));
    }
}
