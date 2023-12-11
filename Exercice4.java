import java.util.Scanner;
public class Exercice4
{
 public static void main(String[] args)
 {
   Scanner scanner = new Scanner (System.in);
   System.out.println ("Veuillez saisir votre age :");
    int age = scanner.nextInt();
    float prix = 375000f ;
   if ( age < 25 ) {
      prix = 375000 - (375000 * 20)/100 ;
     System.out.println ("Le prix de votre billet est de " +prix+ " F CFA ");
     }
   else if ( age > 65 ) {
      prix = 375000 - (375000 * 15)/100;
     System.out.println ("Le prix de votre billet est de " +prix+ " F CFA ");
     }
   else {
     System.out.println ("Le prix de votre billet est de " +prix+ " F CFA ");
     }
 }
}
   
