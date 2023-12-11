import java.util.Scanner;
public class Exercice3
{
 public static void main(String[] args)
 {
   Scanner scanner = new Scanner (System.in);
   System.out.println ("Veuillez saisir la valeur de a:");
    float a = scanner.nextFloat();
   System.out.println ("Veuillez saisir la valeur de b:");
    float b = scanner.nextFloat();
    if( a != 0){
       if(b != 0){
       float S = (-b/a);
        System.out.println ("La solution est " +S);
     }
      else {
       System.out.println ("La solution est R ");
       }
      }
    else {
      System.out.println ("il n'y a pas de solution");
     }
 }
} 
