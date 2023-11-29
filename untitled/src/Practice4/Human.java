package Practice4;

class Head {
    private String eyeColor;
    private String hairColor;

    public Head(String eyeColor, String hairColor) {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }
}

class Leg {
    private int lengthInCm;

    public Leg(int lengthInCm) {
        this.lengthInCm = lengthInCm;
    }

    public int getLengthInCm() {
        return lengthInCm;
    }
}

class Hand {
    private int lengthOfHandInCm;

    public Hand(int lengthOfHandInCm) {
        this.lengthOfHandInCm = lengthOfHandInCm;
    }

    public int getLengthOfHandInCm() {
        return lengthOfHandInCm;
    }
}

class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void showInfo() {
        System.out.println("Информация о человеке:");
        System.out.println("Цвет глаз: " + head.getEyeColor());
        System.out.println("Цвет волос: " + head.getHairColor());
        System.out.println("Длина левой ноги: " + leftLeg.getLengthInCm() + " см");
        System.out.println("Длина правой ноги: " + rightLeg.getLengthInCm() + " см");
        System.out.println("Длина левой руки: " + leftHand.getLengthOfHandInCm() + " см");
        System.out.println("Длина правой руки: " + rightHand.getLengthOfHandInCm() + " см");
    }
}
