package aula04;

public class Chickens01 {

	public static void main(String[] args) {
		int totalEggs = 0;
		int eggsPerChicken = 4 /*5*/, chickenCount = 8 /*3*/;
		//1 dia
		totalEggs += eggsPerChicken * chickenCount; // 15
		//2 dia
		//uma outra opção é ++chickenCount; - ganhou uma galinha
		totalEggs += eggsPerChicken * ++chickenCount; // 15+20
		//3 dia
		chickenCount/=2; //animal come metyad edas galinhas
		totalEggs += eggsPerChicken * chickenCount; // 15+20+10
		//imprimir o total
		//pega o texto qu ele fala coloca o comentario e poe o texto
		System.out.println(totalEggs); //45
		

	}

}
