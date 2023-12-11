public class Main5 {
 int modelYear ;
 String modelName;
 public Main5(int year , String name) {
   modelYear = year ;
   modelName = name;
 }
public static void main(String[] args){
 Main5 myCar = new Main5();
 System.out.println(myCar.modelYear+ " " +myCar.modelName);
 }
}
