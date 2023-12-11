import java.util.Scanner;
public class NombreAmi{
 public static void main (String[] args) {
  Scanner scanner = new Scanner(System.in);
 System.out.println ("Veuillez saisir un nombre :");
  int a = scanner.nextInt();
 System.out.println ("Saisissez un autre nombre :");
  int b = scanner.nextInt();
int somA = 0;
 for(int i=1 ; i<a ; i++){
   if( a % i == 0){
    somA += i ;
   }
  }
  System.out.println ("la somme des diviseurs de " +a+ " = " +somA );
  
int somB = 0;
 for(int i=1 ; i<b ; i++){
  if( b % i == 0){
   somB += i;
  }
 }
  System.out.println ("la somme des diviseurs de " +b+ " = " +somB );
  
if((somA == b) && (somB == a)){
 System.out.println ( a+ " et " +b+ " sont des nombres amis " );
 }
else{
 System.out.println ( a+ " et " +b+ " ne sont pas des nombres amis " );
 }
}
}
