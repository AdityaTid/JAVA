import java.util.*;
class Base{  
	void b(){
	System.out.println("BASE");
}  
}  
class Child extends Base{  
void c(){
System.out.println("CHILD");
}  
}  


class Inheritance{
public static void main(String []args){
Child c1 = new Child();
c1.c();
c1.b();
}
}
