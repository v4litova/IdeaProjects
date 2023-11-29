package Practice22.Ex2;

public class Client {
    public Chair chair;
    public void sit() {
        System.out.println("Клиент сел");
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
