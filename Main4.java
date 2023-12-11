public class Main4 {
 int modelYear ;
 String modelName;
 public Main4(int year , String name) {
   modelYear = year ;
   modelName = name;
 }
public static void main(String[] args){
 Main4 myCar = new Main4(1969, "Mustang");
 System.out.println(myCar.modelYear+ " " +myCar.modelName);
 }
}
