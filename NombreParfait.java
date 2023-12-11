import java.util.Scanner;
public class NombreParfait{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
 System.out.println("Veuillez saisir un nombre :");
 int nombre = scanner.nextInt();
 int som = 0;
 for(int i = 1; i < nombre; i++){
  if(nombre % i == 0){
   som += i;
  }
 }
if(som == nombre){
 System.out.println ( nombre+ " est un nombre parfait");
 }
else{
 System.out.println ( nombre+ " n'est pas un nombre parfait");
 }
}

