public class SimulRobot2 {
  public static void main(String[] args) {
     Robot leRobot = new Robot("Garfield 2.0");
     leRobot.sepresenter();
     leRobot.accelerer();
     leRobot.allerALOuest();
     leRobot.sepresenter();
     leRobot.decelerer();
     leRobot.allerAuSud();
    do{
      leRobot.sePromener();
     }while(leRobot.niveau > 0);
  }
