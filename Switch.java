import java.util.*;

class Switch{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter any number from 1 to 7 to check wheather it contain Day or not ");
int day = sc.nextInt();

switch(day){

case 1:
System.out.println("Monday");
break;

case 2:
System.out.println("Tusday");
break;

case 3:
System.out.println("Wednesday");
break;

case 4:
System.out.println("Thusday");
break;

case 5:
System.out.println("Friday");
break;

case 6:
System.out.println("Saturday");
break;

case 7:
System.out.println("Sunday");
break;

default:
System.out.println("Enter the value Properly");

}


}

}