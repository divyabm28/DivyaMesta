class Calculator {
public static void main(String [] args)
{
double result;
Scanner scan=new Scanner(System.in);
System.out.println("print first number");
double a=scan.nextDouble();
System.out.println("print second number");
double b=scan.nextDouble();
System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division");
int choice=scan.nextInt();

switch(choice)
{
case 1: 
 result= a + b;
 System.out.println(result);
break;
case 2:
 result = a - b;
 System.out.println(result);
break;
case 3:
 result = a * b;
 System.out.println(result);
break;
case 4:
 result = a/b;
 System.out.println(result);
break; 
default: 
 System.out.println("Invalid input");
}
}
}
