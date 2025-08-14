package br.com.senaisp.bauru.secao04.aula10;

import java.util.Scanner;

public class CalculoBaskaraTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculoBaskara ca = new CalculoBaskara();
		System.out.println("Digite o lado A: ");
		ca.setLadoA(sc.nextDouble());
		
		System.out.println("Digite o lado B: ");
		ca.setLadoB(sc.nextDouble());
		
		System.out.println("Digite o lado C: ");
		ca.setLadoC(sc.nextDouble());
		
		//calculardelta
		ca.calcularDelta();
		//mostrando x1 e x2
		System.out.println("O valor de X1 = " + ca.getX1());
		System.out.println("O valor de X2 = " + ca.getX2());
		//fechando scanner
		sc.close();

	}

}
