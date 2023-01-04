class ClassAddition{

public int add(int a , int b){

int c = a + b;

return c;

}

public static void main(String args[]){

ClassAddition ca = new ClassAddition();

int sum = ca.add(10,20);

 
System.out.println(sum);


}

}