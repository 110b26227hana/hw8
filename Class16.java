class CSphere
{
   private int x;   //圓心的x座標
   private int y;   //圓心的y座標
   private int z;   //圓心的z座標
   private int radius;   //圓心的半徑

    void setLocation(int i, int j, int k)
   {
    x=i;                // int x=i 等於在宣告一個x變數 底下印出來的數字是預設值0 故不能有int  (int x是引數勿忘)
    y=j;
    z = k;
   }
   void setRadius(int r)
   {
    radius=r;
   }
   double surfaceArea()
   {
    return (double)4*3.1416*radius*radius; 
   }
   double volume()
   {
    return ((double)3.1416*radius*radius);
   
   }
   void showCenter()
   {
    System.out.println("Circle center"+"x="+x+" "+"y="+y+" "+"z="+z+" "+"radius="+radius);
   }
}
 
 
  public class eel
  {
   public static void main(String args[])
   {
   CSphere cs=new CSphere();
   cs.setLocation(3,4,5);
   cs.setRadius(1);
   System.out.println("surface area="+cs.surfaceArea());
   cs.showCenter();
   //印不出radius 因為private r也是
   }
  }

印出
surface area=12.5664
Circle centerx=3 y=4 z=5 radius=1
