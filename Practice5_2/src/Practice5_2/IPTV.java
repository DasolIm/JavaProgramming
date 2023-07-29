package Practice5_2;

public class IPTV extends ColorTV {
    private String address = null;
    
    public IPTV(String address, int size, int colorSize) {
        super(size, colorSize);
        this.address = address; //super가 먼저 입력
    }

    public void printProperty() {
        System.out.println("나의 IPTV는 " + address + "주소의 ");
        super.printProperty();
    }
}
