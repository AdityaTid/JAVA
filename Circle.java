import java.util.*;

class Circle{

public static void main(String args[]){
	
Scanner sc = new Scanner(System.in);
double pi = 3.14;
double area = 0;
System.out.println("Enter the radiues value");
double r = sc.nextDouble();
area = pi*r*r;
System.out.println("Area of circle = "+area);
}

}
