
public class Rectangle {
   
    private double length;
    private double breadth;

   
    public Rectangle(double length, double breadth) {
        // Using 'this' to differentiate instance variables from local variables
        this.length = length;
        this.breadth = breadth;
    }

    
    public double calculateArea() {
        return this.length * this.breadth;
    }

    
    public void displayInfo() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
        System.out.println("Area: " + calculateArea());
    }

   
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.5, 5.2);
        rect.displayInfo();
    }
}
