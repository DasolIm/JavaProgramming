package Practice5_1;

class ColorTV extends TV {
    private int colorSize = 0;

    public ColorTV(int size, int colorSize) {
        super(size);
        this.colorSize = colorSize;
    }

    public void printProperty() {
        System.out.println(getSize() + "인치 " + colorSize +"컬러");
    }
}