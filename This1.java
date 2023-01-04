import java.util.*;
class This1{
int rollno;
String name;

This1(int r , String n){

this.rollno = r;
this.name = n;

}

void display(){
System.out.println(rollno+"  "+name+"  ");
}

public static void main(String []args){
This1 t1 = new This1(101,"ABC");
This1 t2 = new This1(102,"QWE");
t1.display();
t2.display();
}

}