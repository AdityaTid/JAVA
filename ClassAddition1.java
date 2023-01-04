class ClassAddition1{

public int add(int a , int b){

int c = a + b;

return c;

}

public static void main(String args[]){

ClassAddition1 ca = new ClassAddition1();

int sum = ca.add(10,20);
System.out.println(sum);

int x = 15 ;
int y = 25 ;
sum = ca.add(x,y);
System.out.println(sum);

}

}