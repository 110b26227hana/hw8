class CBox
{
  int length;
  int width;
  int height;
}
public class hw8_4
{
   public static void main(String arge[])
   {
      CBox box;
      box=new CBox();
    
      box.length=15;
      box.width=10;
      box.heigh=25;
    
      System.out.println("length= "+box.length);
      System.out.println("width= "+box.width);
      System.out.println("height="+ box.heigh);
  }
}
