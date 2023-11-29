package Practice4;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("голубой", "русый");
        Leg leftLeg = new Leg(120);
        Leg rightLeg = new Leg(119);
        Hand leftHand = new Hand(57);
        Hand rightHand = new Hand(58);

        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        person.showInfo();

    }
}
