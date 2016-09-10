// McNellis, Bonnie 100%
// Shevchenko, Julianna 100% 
// Tauber, Kristen 100%

import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many years do you plan to work? ");
		double yearsToWork = input.nextDouble()*12; //convert to months
		
		System.out.println("What is your current annual return? ");
		double anReturn = input.nextDouble();
		while (anReturn < 0 || anReturn > 20) {  //checks for a valid input
			System.out.print("Please enter a percent from 0 to 20: ");
			anReturn = input.nextDouble();
		}
		double annualReturn = anReturn/100/12;// change to percentage and change to monthly
		
		System.out.println("How many years will you be retired? ");
		double yearsRetired = input.nextDouble()*12; // converts to months
		
		System.out.println("What do you want your annual draw return to be? " );
		double dReturn = input.nextDouble();
		while(dReturn <0 || dReturn > 3) { //checks for a valid input 
			System.out.print("Please enter a percent from 0 to 3: ");
			dReturn = input.nextDouble();
		}
		double drawReturn = dReturn/100/12; // converts to months and percentage
		
		System.out.println("What is your required monthly income while retired? ");
		double reqIncome = input.nextDouble();
		
		System.out.println("What is your expected monthly Social Security payment? ");
		double ssi = input.nextDouble();
         
		double accumulatedValue = (reqIncome - ssi)*(1-(1/Math.pow((1+drawReturn), yearsRetired)))/drawReturn;
		// calculates how much money is needed when starting retirement
		double monthlyDep = accumulatedValue * annualReturn/(Math.pow((1+annualReturn), yearsToWork)-1);
		// calculates savings needed to reach AV
		
		System.out.printf("%.2f", monthlyDep);
	}

}
