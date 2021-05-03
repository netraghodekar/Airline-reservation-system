import java.util.*;
import java.lang.Exception;
class user extends Exception 
{
user(String message)
{
super(message);
}


	
}
		
class city 
{
int opt;
int b;
int person;
String date;
Scanner p=new Scanner(System.in);
void accept1()	
	{
	System.out.println("\nwe provide our services on two cities \n 1. mumbai \n 2. chennai");
	opt=p.nextInt();
	System.out.println("\nEnter the number of persons");
	person=p.nextInt();
	System.out.println("\n enter the boarding date");
	date=p.next();
	switch(opt)
		{
		case 1:
		System.out.println("\n the flights from pune to mumbai are \n 1.11:40-6:30  \n 2. 13:45-14:15\n 3.18:30-19:00 \n 4. 12:30-13:00");
		b=p.nextInt();
		switch(b)
			{
			case 1:System.out.println("\nThe flight boards from PNQ to BOM at 11:45 \n is of duration 6h 30m and takes 1 stop in AMD\n cost=Rs 3400/- ");
			break;
			case 2:System.out.println("The flight boards from PNQ to BOM at 13:45 \n is of duration 30m and is Non-stop\n cost=Rs 3900/-");
			break;
			case 3:System.out.println("The flight boards from PNQ to BOM at 18:30 \n is of duration 30m and is Non-stop\n cost=Rs 3700/- ");
			break;
			case 4: System.out.println("The flight boards from PNQ to BOM at 12:30 \n is of duration 30m and is Non-stop\n cost=Rs 4400/-");
			break;
			}

			break;
		case 2:
		System.out.println("flights from pune to chennai are\n  1.11:40-6:30  \n 2. 13:45-14:15\n 3.18:30-19:00 \n 4. 12:30-13:00");
		b=p.nextInt();	
		switch(b)
			{
			case 1:System.out.println("The flight boards from PNQ to BOM at 11:45 \n is of duration 6h 30m and takes 1 stop in BOM \n cost=Rs 2400/-");
			break;
			case 2:System.out.println("The flight boards from PNQ to MAA at 13:45 \n is of duration 30m and is Non-stop\n cost=Rs 3400/-");
			break;
			case 3:System.out.println("The flight boards from PNQ to BOM at 18:30 \n is of duration 30m and is Non-stop\n cost=Rs 3100/- ");
			break;
			case 4: System.out.println("The flight boards from PNQ to BOM at 12:30 \n is of duration 30m and is Non-stop\n cost=Rs 3800/-");
			break;
			}
			break;
			
		}	
	}	
}
class seat extends city
{
int no;
Scanner p=new Scanner(System.in);
void accept2()
{
System.out.println(" \nThe following seats are available for booking\n12A\t12B\n13A\t13B\t13C\n20D\t20E\t20F");
no=p.nextInt();
switch(no)
	{
	case 1:System.out.println("\n12A");
	break;
	case 2:System.out.println("\n12B");
	break;
	case 3:System.out.println("\n13A");
	break;
	case 4:System.out.println("\n13B");
	break;
	case 5:System.out.println("\n13C");
	break;
	case 6:System.out.println("\n20D");
	break;
	case 7:System.out.println("\n20E");
	break;
	case 8:System.out.println("\n20F");
	}
}
}
	
		

class payment extends seat
{

int pay;
String name;
String valid;
String num;
Scanner p=new Scanner(System.in);
void accept3()
	{
	System.out.println("\nmake a payment using\n 1. debit card \n 2. credit card");
	System.out.println("\nenter your option");
	pay=p.nextInt();
	switch(pay)
		{
		case 1:
		System.out.println("enter  your card number");
		num=p.next();
		System.out.println("\nvalid to");
		valid=p.next();
		System.out.println("\nenter cvv");
		pay=p.nextInt();
		System.out.println("\nenter the card Holder's name ");
		name=p.next();
		System.out.println("\nRS 3400/- have been successfully debited from your account");
		System.out.println("\n Thank you for using our Airline service!");
		
                                     
			
		
		break;
		case 2:
		System.out.println("enter  your card number");
		pay=p.nextInt();
		System.out.println("valid to");
		valid=p.next();
		System.out.println("enter cvv");
		pay=p.nextInt();
		System.out.println("enter the card holders name ");
		name=p.next();
		break;
		}
	}

}
class main2
{
public static void main(String args[])
{
	
	System.out.println("\nenter email id");
	Scanner p1=new Scanner(System.in);
	String emailid=p1.next();

	System.out.println("\nenter password");
	Scanner p=new Scanner(System.in);

	String password=p.next();
	try
	{
	if(!password.equals("nemo123"))
	throw new user("Incorrect password");
	else
	{
	System.out.println("welcome user");
	}
	}
	catch(user e)
	{	
	System.out.println(e.getMessage());
	}

payment p2=new payment();

for(int i=0;i<=10;i++)
{
p2.accept1();
p2.accept2();
p2.accept3();
}
}
}
