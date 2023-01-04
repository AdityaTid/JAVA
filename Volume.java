import java.util.*;

class Volume{
void vol(double r){
double pi = 3.14;
double v = 1.33 * 3.14 * r * r * r;
System.out.println("Volume of sphere = "+v);
}
void vol(int s){

double v = s * s * s ;
System.out.println("Volume of Cube = "+v);

}

public static void main(String []args){
Scanner sc = new Scanner(System.in);
Volume vl = new Volume();
System.out.println("Enter the radius of Sphere");
double r = sc.nextDouble();
vl.vol(r);
System.out.println("Enter the Side of Cude");
int s = sc.nextInt();
vl.vol(s);

}
}