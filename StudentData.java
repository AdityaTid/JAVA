import java.util.*;

class StudentData{

public void StudInsert(){
 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Student name ");
String studname = sc.next();

System.out.println("Enter the Student Roll no. ");
int studRollno = sc.nextInt();

System.out.println("Enter the Student Subject 1 marks ");
int studSub1 = sc.nextInt();

System.out.println("Enter the Student Subject 2 marks ");
int studSub2 = sc.nextInt();

System.out.println("Enter the Student Subject 3 marks ");
int studSub3 = sc.nextInt();

}

public static void main(String []args){

StudInsert stud = new StudInsert();



}
}