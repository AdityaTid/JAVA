import java.util.*;

class Swapping{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter two Number to Swap");
int a = sc.nextInt();
int b = sc.nextInt();
int temp = 0;
System.out.println(a+" Number entered "+b);
temp = a;
a = b;
b = temp;
System.out.println(a+" Number Swapped "+b);
}

}