package Practice18.Ex3;
import java.io.Serializable;
public class Dog implements Animal, Serializable{
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public String getColor() {
        return "Brown";
    }

    @Override
    public double getWeight() {
        return 25.5;
    }
}
