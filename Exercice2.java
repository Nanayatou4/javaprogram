import java.util.Scanner;
public class Exercice2
{
 public static void main(String[] args)
 {
  Scanner scanner = new Scanner (System.in);
  System.out.println ("Veuillez saisir un nombre :");
   int x = scanner.nextInt(); 
 System.out.println ("Saisissez un autre nombre :");
   int y = scanner.nextInt(); 
   boolean result = x > y ;
   switch (result) 
   {
     case "true" : System.out.println ( x+ " est le maximum ");
        break;
     case "false": System.out.println ( y+ " est le maximum ");
        break;
     default :  System.out.println ( x+ " et " +y+ " sont egaux ");
    }
  }
}

