import java.util.*;

class Dmart{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Coustomer ID");
long cust_Id =  sc.nextLong();

System.out.println("Enter Product Id");
long prod_Id =  sc.nextLong();

System.out.println("Enter Customer Name");
String prod_name =  sc.next();

System.out.println("Enter Product Qty");
double prod_qty =  sc.nextDouble();

System.out.println("Enter Product Rate");
double prod_rate =  sc.nextDouble();

double total = prod_qty * prod_rate ;

if(total >5000){

double dis = total * 0.2 ;
System.out.println("Total Amt = "+ total);
System.out.println("Discounted price 20% =  "+dis);
double payable = total - dis;
System.out.println("Finall amt = "+payable );
}
else if(total > 3000 && total < 5000){
double dis = total * 0.15 ;
System.out.println("Total Amt = "+ total);
System.out.println("Discounted price 15% =  "+dis);
double payable = total - dis;
System.out.println("Finall amt = "+payable );

}
else if(total > 1000 && total < 3000){
double dis = total * 0.01 ;
System.out.println("Total Amt = "+ total);
System.out.println("Discounted price 10% =  "+dis);
double payable = total - dis;
System.out.println("Finall amt = "+payable );
}
  
}
}