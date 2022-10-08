class CCircle
{
 double area;
 double area(double r)
 {
  area=r*r*3.14;
  return (double)area;
 }
 float area(float r)
 {
  area=r*r*3.14;
  return (float) area;
 }
 int area(int r)
 {
  area=r*r*3.14;
  return (int) area;
 }
 public void show()
 {
  System.out.println("area="+area);
 }

}

   public class eel
{
      public static void main (String args[])
      {
         CCircle a=new CCircle();
         a.area(2);
         a.show();//必須將show逐行插入才能三列印，無法一次列印
         a.area(2.2f);
         a.show();
         a.area(2.2);
         a.show();
      }
}
