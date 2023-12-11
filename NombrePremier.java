import java.util.Scanner;
public class NombrePremier
{
 public static void main(String[] args)
{
  Scanner scanner = new Scanner(System.in);
  System.out.println ("Veuillez saisir un nombre");
   int nombre = scanner.nextInt();
   int nbr = 0;
 for(int i=1; i<10; i++)
 {
   if(nombre % i == 0){
    nbr += 1;
   }
 }
if(nbr == 2){
 System.out.println ( nombre+ " est un nombre premier ");
 }
else{
 System.out.println ( nombre+ " n'est pas un nombre premier ");
 }
}
}
