public class Rectangle {
    /*
    Problem 1: Rectangle Class
        Create a Rectangle class with:
        Private fields: length and width
        Constructor to initialize both
        Methods: getArea(), getPerimeter()
        Getters and setters with validation (positive values only)
    */
   private double length;
   private double width;

   public Rectangle(double length, double width) {
       setLength(length);
       setWidth(width);
   }

   public void setLength(double length) {
       if (length > 0) {
           this.length = length;
       } else {
           System.out.println("Length must be positive.");
       }
   }

   public void setWidth(double width) {
       if (width > 0) {
           this.width = width;
       } else {
           System.out.println("Width must be positive.");
       }
   }

   public double getLength() {
       return length;
   }

   public double getWidth() {
       return width;
   }

   public double getArea(){
        return length*width;
   }

   public double getPerimeter(){
        return 2*(length+width);
   }
}
