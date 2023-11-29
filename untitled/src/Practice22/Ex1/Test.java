package Practice22.Ex1;
//Разработать программную реализацию по UML диаграмме,
//представленной на рисунке 22.1 с использованием изучаемых паттернов

public class Test {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex = factory.createComplex();
        System.out.println(complex);
    }
}
