package Practice5_14;

public class Rect implements Shape {
    private int sizeA = 0, sizeB = 0;

    public Rect(int sizeA, int sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    @Override
    public void draw() {
        System.out.println(sizeA + 'x' + sizeB + "크기의 사각형입니다.");
    }

    @Override
    public double getArea() {
        double cal = sizeA * sizeB;
        return cal;
    }
}