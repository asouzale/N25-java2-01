package br.com.senaisp.bauru.secao04.aula10;

public class CalculoBaskara {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	private double X1;
	private double X2;
	//CNSTRUCTOR 
	public CalculoBaskara() {
		ladoA = 0;
		ladoB = 0;
		ladoC = 0;
		X1 = 0;
		X2 = 0;
		
	}
	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public double getX1() {
		return X1;
	}

	public double getX2() {
		return X2;
	}

	public void calcularDelta() {
		//b elevado 2
		double delta = Math.pow(ladoB,  2) -4 * ladoA * ladoC;
		if (delta<0) {
			X1 = 0;
			X2 = 0;
			System.out.println("Não foi possível calcular Delta!");
		} else {
			X1 = ( -ladoB + Math.sqrt(delta)) / (2*ladoA);
			X2 = (-ladoB + Math.sqrt(delta)) / (2 * ladoA);
		}
		
	}
	
		
	}
	


