import java.util.*;

class getdata{


int Rollno ,s1 = 0 ,s2 = 0 ,s3 = 0;
String studName;
int tot = 0 ;
double per = 0;

void studData(){

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

class Cal extends getdata{

void total(){

tot = s1 + s2 + s3;


}

void perc(){

per = tot / 3;


}

}

class show extends Cal{
void display(){
System.out.println("Student Name : "+studName);
System.out.println("Roll Number : "+Rollno);
System.out.println("Subject 1 : "+s1);
System.out.println("Subject 2 : "+s2);
System.out.println("Subject 3 : "+s3);
System.out.println("Total marks : "+tot);
System.out.println("Percentage : "+per);
}
}
class StudMulti{

public static void main(String []args){

show ss = new show();

ss.studData();
ss.total();
ss.perc();
ss.display();
}

}