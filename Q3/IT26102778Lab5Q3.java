import java.util.Scanner;
public class IT26102778Lab5Q3{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
final double R_Charge=48000;
final double D_Rate3to4=0.9;
final double D_Rate5more=0.8;
System.out.print("Enter the start date: ");
int S_Date= input.nextInt();
System.out.print("Enter the end date: ");
int E_Date= input.nextInt();
if(S_Date<1||S_Date>31||E_Date<1||E_Date>31){
System.out.println("Error: Days must be between 1 and 31");
return;
}


if(S_Date>E_Date){
    System.out.println("Error: Start Date must be less than End Date");
	return;
}

int noOfDays= E_Date-S_Date;
System.out.println("Room Charge per Day: "+R_Charge);
System.out.println("Number of days Reserved: "+noOfDays);
if(noOfDays<3){
    System.out.println("Total Amount to be paid: "+R_Charge*noOfDays);
}
else if(3<=noOfDays|| noOfDays<=4){
    System.out.println("Total Amount to be paid: "+R_Charge*noOfDays*D_Rate3to4);
}
else{
    System.out.println("Total Amount to be paid: "+R_Charge*noOfDays*D_Rate5more);
}

}
}