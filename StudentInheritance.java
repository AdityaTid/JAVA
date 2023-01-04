import java.util.*;


class data{
int Rollno ,s1 = 0 ,s2 = 0 ,s3 = 0;
String studName;

void indata(){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Student Name : ");
studName = sc.next();
System.out.println("Enter Roll Number : ");
Rollno = sc.nextInt();
System.out.println("Enter Subject 1 marks : ");
s1 = sc.nextInt();
System.out.println("Enter Subject 2 marks : ");
s2 = sc.nextInt();
System.out.println("Enter Subject 3 : marks ");
s3 = sc.nextInt();

}
}

class showdata extends data{
void show(){
System.out.println("Student Name : "+studName);
System.out.println("Roll Number : "+Rollno);
System.out.println("Subject 1 : "+s1);
System.out.println("Subject 2 : "+s2);
System.out.println("Subject 3 : "+s3);

}
}
class StudentInheritance{

public static void main(String []args){

showdata s = new showdata();
s.indata();
s.show();


}

}

 