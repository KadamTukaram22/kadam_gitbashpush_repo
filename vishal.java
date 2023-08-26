class vishal{
static{
  System.out.println("static variables");

}
{
  System.out.println("non static block");
 }
vishal(){
System.out.println("default contraction");
}
public void m1(){
System.out.println("m1 method");
}
public static void main(String arg[]){
System.out.println("main method start");
vishal vis= new vishal();
vis.m1();
}
}