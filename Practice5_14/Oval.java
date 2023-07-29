package Practice5_14;

public class Oval implements Shape {
    private int sizeA = 0, sizeB = 0;
    
    public Oval(int sizeA, int sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    @Override
    public void draw() {
        System.out.println(sizeA + 'x' + sizeB + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        double cal = (sizeA / 2) * (sizeB / 2) * PI;
        return cal;
    }
}