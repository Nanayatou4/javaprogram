import java.util.Scanner ;
public class ChaineInversee {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
 System.out.println("Veuillez saisir un mot :");
  String chaine = scanner.nextLine();
  String inverse = new StringBuilder(chaine).reverse().toString();
  System.out.println("le mot inverse donne: " +inverse);
 }
}
