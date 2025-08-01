package aula04;

public class Chickens02 {

	public static void main(String[] args) {
		//Put yout code here
		double dailyAverage = 0, monthlyAverage = 0, monthlyProfit = 0;
		int totalEggs = 0;
		//1 dia
		totalEggs = 100;
		//2 dia
		totalEggs += 121;
				//3dia
		totalEggs += 117;
		//fazendo as contas
		//nao pode ser feito opeção entre inteiros nesse caso, se ocorrer
		//trunca (perde) as casas decimais, por isso dividimos por 3. (3.0)
		dailyAverage = totalEggs / 3.;
		monthlyAverage = dailyAverage * 30;
		monthlyProfit = monthlyAverage * 0.18;
		//-----

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);

	}

}
