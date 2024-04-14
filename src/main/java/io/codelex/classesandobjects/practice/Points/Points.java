package src.main.java.io.codelex.classesandobjects.practice.Points;

class Points {
    private int x;
    private int y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void swapPoints(Points otherPoint) {
        int tempX = this.x;
        int tempY = this.y;
        this.x = otherPoint.x;
        this.y = otherPoint.y;
        otherPoint.x = tempX;
        otherPoint.y = tempY;
    }
}