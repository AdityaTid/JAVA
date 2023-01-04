
import java.util.*;
class Remark{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Roll NO. of the student");
int rollno = sc.nextInt();

System.out.println("Enter Student name");
String studname = sc.next();

System.out.println("Enter Student the Subject Marks ");
System.out.println("English = ");
int eng = sc.nextInt();


System.out.println("Java = ");
int jav = sc.nextInt();

System.out.println("HTML = ");
int htm = sc.nextInt();

int totalmarks = eng + jav + htm ;

double per = totalmarks / 3;

System.out.println("Student Roll Number = "+rollno);
System.out.println("Student Student Name = "+studname);
System.out.println("Student English marks = "+eng);
System.out.println("Student Java marks = "+jav);
System.out.println("Student HTML marks = "+htm);
System.out.println("Student Total marks = "+totalmarks);
System.out.println("Student Percentage marks = "+per);

if(per > 70){
System.out.println("DIS");
}else if(per > 60 && per < 70 ){
System.out.println(" First class");
}else if(per > 50 && per < 60 ){
System.out.println("second class");
}else if(per > 40 && per < 50){
System.out.println("pass class");
}else {
System.out.println("Failed");
}

}


}