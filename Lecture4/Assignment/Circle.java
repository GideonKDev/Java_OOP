package Java_OOP.Lecture4.Assignment;
class Circle extends Polygon {
    private double radius;

    @Override
    public double area(){
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter(){
        return Math.PI*radius*2;
    }
}
