public class Main {
  static class Phone {
  	int year = 2024;
  	String brand = "Samsung";
  	String password = "qwertu";
  }
  public static void main(String[] args) {
    Phone myObj = new Phone();
    System.out.println("Year: " + myObj.year);
    System.out.println("Brand: " + myObj.brand);
    if (myObj.password == "qwertu"){
    	System.out.println("Correct");
    }
    else{
    	System.out.println("Incorrect");
    }
  }
}