package Practice22.Ex2;

//Реализовать класс Абстрактная фабрика для различных типов стульев:
//Викторианский стул, Многофункциональный стул, Магический стул, а также
//интерфейс Стул, от которого наследуются все классы стульев, и класс Клиент,
//который использует интерфейс стул в своем методе Sit (Chair chair).
public class Test {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Chair functionalChair = factory.createFunctionalChair();
        Chair magicChair = factory.createMagicianChair();
        Chair victorianChair = factory.createVictorianChair();
        ((MagicChair)magicChair).doMagic();
        System.out.println(((FunctionalChair)functionalChair).sum(3,2));
        System.out.println(((VictorianChair)victorianChair).getAge());
        Client client = new Client();
        client.setChair(magicChair);
        client.sit();
    }
}
