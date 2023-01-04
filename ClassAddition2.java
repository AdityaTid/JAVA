import java.util.*;
class ClassAddition2{

public void add(int a , int b){

int c = a + b;
System.out.println(c);

}

public static void main(String args[]){

ClassAddition2 ca = new ClassAddition2();
Scanner sc = new Scanner(System.in);

int x = sc.nextInt();
int y = sc.nextInt();
ca.add(x,y);
	
}

}