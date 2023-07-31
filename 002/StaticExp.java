public class StaticExp {

  // static
  // 1- v
  // 2 - m
  // 3 - code
  // 4- i
  
  public static int counter;
  public String typeProduct;
  
  public StaticExp(){
	counter ++;
	System.out.println(counter);
  }
  
 
  public static void main(String[] arg){
	  StaticExp obj1 = new StaticExp();
	  obj1.typeProduct = "mobile";
	  
	  StaticExp obj2 = new StaticExp();
	  obj2.typeProduct = "mobile2";
 	  
	  StaticExp obj3 = new StaticExp();
	  obj3.typeProduct = "mobile3";

  }
}