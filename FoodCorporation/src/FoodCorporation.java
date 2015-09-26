import java.util.Scanner;

public class FoodCorporation {

	public static void main(String[] args) {

double basepay;
double time;
double pay;
double pay2;
	System.out.println("What is your basepay?");
		Scanner user_input = new Scanner(System.in);	
		
		basepay = user_input.nextDouble();
		
	System.out.println("How many hours worked?");
	
		time = user_input.nextDouble();
		pay = time*basepay;
		
if (time <= 40){
	System.out.println(pay);

}
else if (time >= 60) {
	System.out.println("Error");
}else{
	pay2 = 40*basepay + (time-40)*1.5; 
	System.out.println(pay2);
}

		
		}
	}


