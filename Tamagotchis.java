public class Tamagotchis ()
{
  int age;
  int dureeDeVie;
  int maxEnergie;
  int energie;
  String name;
  
  public Tamagotchis(String name)
   {
    age = 0;
    dureeDeVie = 9+((int)Math.random()*14);
    maxEnergie = 5+((int) Math.random()*9) ;
    energie = 3+(int)Math.random()*maxEnergie);
    this.name = name;
    
      }
 public void parler(String name , int energie) 
 {
  System.out.println("Quel nom pour le Tamagotchis :");
   String name = new scanner.next.charAt();
   if(energie > 5) {
    System.out.println(nom+ " Heureux ");
    }
   else {
     System.out.println(nom+ " Affame ");
    }
  }
 public void manger () 
  {
   if(energie == maxEnergie){
    System.out.println(nom+ " Je n'ai pas faim Aargh!!!");
    }
   else if(energie < maxEnergie){
     energie = energie + 1 +((int)Math.random()*3);
      if(energie > maxEnergie){
        energie = maxEnergie;
        }
   }
 }
 public boolean ageLimite()
  {
    if(age == ageLimite){
      return true;
      }
     return false;
 }
 public boolean vivre()
  {
    if(energie <= 0){
     System.out.println(" Je meurs");
     return false;
     }
     else if(energie>0){
       age++;
       energie--;
      if(age == ageLimite){
       System.out.println(" Je vais bien");
       }
       }
       else{
        parler();
        return true;
       } 
  }
  

