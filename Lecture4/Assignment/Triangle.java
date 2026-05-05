package Java_OOP.Lecture4.Assignment;
class Triangle extends Rectangle {
       //right angled triangle only for perimeter
    public Triangle(double length, double width){
    super(length,width);
    }
    @Override
    public double area(){
        return length*width*0.5;

    }
    @Override
    public double perimeter(){
        return length + width + Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
}
