package Practice22.Ex1;
public class ConcreteFactory implements ComplexAbstractFactory {
    public Complex createComplex() {
        return new Complex();
    }
    public Complex createComplex(int real, int image) {
        return new Complex();
    }
}