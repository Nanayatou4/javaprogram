public class Main3
{
  static int x  = 5;
 public static void main(String[] args)
 {
   Main3 myObj1 = new Main3() ;
    myObj1.x = 40;
   Main3 myObj2 = new Main3();
   System.out.println(x);
   System.out.println(myObj2.x);
  }
}
