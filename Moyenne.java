import java.util.Scanner ;
public class Moyenne {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
 System.out.println("Combien de nombre souhaitez vous saisir ?");
  int nbr = scanner.nextInt();
  float som = 0;
 for(int i=0; i<nbr; i++) {
  System.out.println("Saisissez le nombre numero " +(i+1)); 
   float nombre = scanner.nextFloat();
   som = som + nombre;
  }
  float moy;
  moy = som / nbr;
 System.out.println("La moyenne est egale a " +moy);
 }
}
