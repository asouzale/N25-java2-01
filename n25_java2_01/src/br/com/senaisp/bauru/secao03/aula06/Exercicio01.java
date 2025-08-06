package br.com.senaisp.bauru.secao03.aula06;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		int resposta = JOptionPane.showConfirmDialog(
                null,
                "Olá, participante, e bem-vindo ao programa de namoro favorito da America!",
                "Bem-Vindo, participante!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if (resposta == JOptionPane.YES_OPTION) {
            String Questão1 = (String) JOptionPane.showInputDialog(
                    null,
                    "Qual é seu nome?",
                    "Questão 1",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    null,
                    "Escreva aqui");

            String[] acceptableValues = {"São Paulo", "Santos", "Flamengo", "Palmeiras", "Bota Fogo"};
            String Questão2 = (String) JOptionPane.showInputDialog(
                    null,
                    "Qual seu time favorito?",
                    "Questão 2",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    acceptableValues,
                    acceptableValues[1]);

            System.out.println("Nome: " + Questão1);
            System.out.println("Time: " + Questão2);

        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Obrigado por sua visita!", "Até logo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}