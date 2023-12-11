import java.util.Scanner;
public class Exercice7
{
 public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
  System.out.print("Veuillez saisir un entier n :");
  int n = scanner.nextInt();
// avec la boucle for
/* for(int i=n;i<n-1;i++)
  {
   System.out.println(i);
  }
 }
}*/

// avec la boucle while
int i=1;
while(i<=n-1) 
 {
   System.out.println(i);
   i++;
  }
 }
}
