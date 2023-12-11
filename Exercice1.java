import java.util.Scanner;
public class Exercice1
{
 public static void main(String[] args)
 {
  Scanner scanner = new Scanner (System.in);
 System.out.println ("Veuillez saisir une lettre :");
 char c = scanner.next().charAt(0); 
  if((c >= 65 && c <= 90) || ( c >= 97 && c <= 122)) 
  {
     if( c == 'a' || c == 'A' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'e' || c == 'E' || c == 'u' || c == 'U' || c == 'y' || c == 'Y' ) 
      {
       System.out.println (" C'est une voyelle ");
      }
     else 
      {
       System.out.println (" C'est une consonne ");
      }
  }
  else 
   {
      System.out.println (" Ce n'est pas une lettre ");
   }
 }
} 
