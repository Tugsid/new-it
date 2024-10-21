public class Main {
  
  static class Phone {
    int width = 10;
    int height = 20;
    
    public Phone(int w, int h){
    	width = w;
        height = h;
    }

    public int area() {
      return width * height;
    }
  
    public int perimeter() {
      return (width + height) * 2;
    }  
    
    public double diameter() {
        return Math.sqrt(width * width + height * height);
    }
  
    public void printInfo() {
      System.out.println("Width: " + width);
      System.out.println("Height: " + height);
      System.out.println("Area: " + area());
      System.out.println("Perimeter: " + perimeter());
      System.out.println("Diameter: " + diameter());
    }
  }

  public static void main(String[] args) {
    Phone myPhone = new Phone(4, 3);  
    myPhone.printInfo();
    System.out.println("");
    
    Phone myPhone2 = new Phone(5, 6);  
    myPhone2.printInfo();
    System.out.println("");
    
    Phone myPhone3 = new Phone(17, 25);  
    myPhone3.printInfo();
    System.out.println("");
  }
}