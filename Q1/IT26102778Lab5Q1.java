import java.util.Scanner;
public class IT26102778Lab5Q1{
    public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
		int number1= input.nextInt();
		
		System.out.println("Enter the Second integer: ");
		int number2= input.nextInt();
		
		System.out.println("Enter the third integer: ");
		int number3= input.nextInt();
		
		System.out.println("User entered number are: "+number1+ " " +number2+ " " +number3);
		int largest= number1;
		if(largest<number2){
			largest=number2;
			System.out.println("The largest number is: "+largest);
		}
		else if(largest<number3){
			largest=number3;
			System.out.println("The largest number is: "+largest);
			
		}
		else{
			largest=largest;
			System.out.println("The largest number is: "+largest);
		}
			
		int smallest= number2;
		if(smallest>number1){
			smallest=number1;
			System.out.println("The smallest number is: "+smallest);
		}
		else if(smallest>number3){
			smallest=number3;
			System.out.println("The smallest number is: "+smallest);
			
		}
		else{
			smallest=smallest;
			System.out.println("The smallest number is: "+smallest);
		}
	}
}