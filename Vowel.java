import java.util.*;

class Vowel{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Single Alphabetical Character");

char c = sc.nextChar().charAt(0);

if( c == 2 ){
System.out.println("Enter only Single Alphabetical Character");
}else{

switch(c){

case 'A':
case 'a':
System.out.println(c+" is VOWEL ");
break;


}

}

}

}