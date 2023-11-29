package Practice5;

public class MovableRectangle implements Movable{
    protected MovablePoint topLeft;
    protected MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean isCheck(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
    public void setSpeed(int xSpeed, int ySpeed){
        topLeft.ySpeed = ySpeed;
        topLeft.xSpeed = xSpeed;
    }
    @Override
    public String toString() {
        return "topLeft: x=" + topLeft.x + ", y=" + topLeft.y + ", \n bottomRight: x=" + bottomRight.x + ", y="
                + bottomRight.y + ", xSpeed = " + topLeft.xSpeed + ", ySpeed=" + topLeft.ySpeed + "\n";
    }
    @Override
    public void moveUp() {
        if(isCheck()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else {
            System.err.println("Скорости точек прямоугольника не совпадают \n");
        }
    }
    @Override
    public void moveDown() {
        if(isCheck()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else {
            System.err.println("Скорости точек прямоугольника не совпадают \n");
        }
    }
    @Override
    public void moveLeft() {
        if(isCheck()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else {
            System.err.println("Скорости точек прямоугольника не совпадают \n");
        }
    }
    @Override
    public void moveRight() {
        if(isCheck()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else {
            System.err.println("Скорости точек прямоугольника не совпадают \n");
        }
    }

}
