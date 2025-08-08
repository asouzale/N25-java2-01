package br.com.senaisp.bauru.secao03.aula08;

import java.util.Scanner;

public class NameMaker {

	public static void main(String[] args) {
		//Solicitar o nome, nome do meio e sobrenome separadamente
		//Mostrar o nome completo ao termino nome + nome do meio + sobrenome 
		Scanner scanner = new Scanner(System.in);
		
        String nome, nomeDoMeio, sobrenome;
        
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu nome do meio: ");
        nomeDoMeio = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();
        String nomeCompleto = nome + " " + nomeDoMeio + " " + sobrenome;
        System.out.println("Seu nome completo é: " + nomeCompleto);
        scanner.close();
	}

}
