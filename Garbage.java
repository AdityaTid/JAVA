
public class Garbage{

public static void main(String []args) throws Exception{

Garbage g1 = new Garbage();
Garbage g2 = new Garbage();

g1 = null;
System.gc();

g2 = null;
Runtime.getRuntime().gc();
}
@Override

protected void finalize() throws Throwable{
System.out.println("Garabag Collection Called");
System.out.println("Object garbage collection: "+this);
}
}