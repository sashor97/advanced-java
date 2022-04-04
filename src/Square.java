public class Square {
    int sideLength;

    public int getSideLength() {
        return sideLength;
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
    public int calculateArea(){
        return sideLength*sideLength;
    }
}
