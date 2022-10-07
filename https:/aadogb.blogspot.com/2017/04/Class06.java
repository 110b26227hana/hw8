class CCircle
{
  double pi=3.14;
   double radius;

  void show_periphery()
 {
   System.out.println("periphery="+2*pi*this.radius);
   //this 是物件cirl1 因為不能cirl.show...() 無法直接拿到類別來
 }
}
public class eel
{

 public static void main(String args[])
 {
 CCircle cirl1=new CCircle();
 cirl1.radius=3.0;
 cirl1.show_periphery();
 
 }

}
