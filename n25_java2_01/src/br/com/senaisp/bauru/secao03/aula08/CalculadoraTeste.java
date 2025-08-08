package br.com.senaisp.bauru.secao03.aula08;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		//calculando cada pessoa
		calc.calcularTotal("Pessoa 1", 10);
		calc.calcularTotal("Pessoa 2", 12);
		calc.calcularTotal("Pessoa 3", 9);
		calc.calcularTotal("Pessoa 4", 8);
		calc.calcularTotal("Pessoa 5", 7);
		calc.calcularTotal("Pessoa 6", 15);
		calc.calcularTotal("Pessoa 7", 11);
		calc.calcularTotal("Pessoa 8", 30);
		//mostrando o total da mesa
		System.out.println("Total da mesa: " + calc.getGrandeTotal());
		//div a conta entre os 6
		System.out.println("A divisão para 6 pagantes ficou em: " + calc.dividirValor(6));
		

	}

}
