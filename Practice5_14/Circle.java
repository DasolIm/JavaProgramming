package Practice5_14;

class Circle implements Shape {
    private int size=0;
    public Circle(int size) { this.size = size; }
    
    @Override
    public void draw() {
        System.out.println("반지름이 " + size + "인 원입니다.");
    }
 
    @Override
    public double getArea() {
        double cal = size * size * PI;
        return cal;
    }
}