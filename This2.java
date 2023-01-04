class A{

void m(){
System.out.println("Show m");
}

void n(){
System.out.println("Show n");
}

}
class This2{
public static void main(String []args){
A a = new A();
a.n();
}
}
