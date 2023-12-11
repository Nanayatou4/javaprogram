import java.awt.*;
public class Robot2 {
  String nom ;
  private Point position;
  int vitese;
  int niveau;
 public Robot2(String unRobot) {
   nom = unRobot;
   position = new Point(0,0);
   vitesse = 0;
   niveau = 0;
   }
 public Robot2(String unRobot , int x , int y , int vitesse) {
    nom = unRobot;
   Point position = new Point(x,y);
    this.vitesse = vitesse;
    niveau = 0;
  }
  
  public void allerALEst() {
    position.translate(vitesse,0);
    }
    
  public void allerALOuest() {
    position.translate(-vitesse,0);
    }
    
  public void allerAuNord() {
    position.translate(0,vitesse);
    }
    
  public void allerAuSud() {
    position.translate(0,-vitesse);
    }  
    
  public void accelerer() {
      if(vitesse < 10) {
       vitesse++;
       }
    }
    
  public void decelerer() {
      do{
        vitesse--;
        }while(vitesse > 0);
      vitesse = 0;
    }
    
  public void stop() {
      vitesse = 0 ;
    }
  public void getPosition() {
    return position;
    }
   
  public void setPosition() {
    System.out.println("Nom "+nom+" position "+position);
  }
 public void setNiveau(int n ) {
   niveau = n;
   if(n < 100){
     n++;
    }
  }
 public void getNiveau() {
   if(niveau == 0) {
    stop();
    } 
   return niveau;
  }
  
 public void sePromener() {
  niveau = 0+((int)Math.random()*100);
  return niveau*2;
}
}
