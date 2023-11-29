package Practice16;

public class Ex1 {
        /*public static void main(String[] args) {
            System.out.println( 2 / 0 );
        }*/ //Ошибка: ArithmeticException: / by zero
    /*public static void main(String[] args) {
        System.out.println( 2,0 / 0,0 );
    }*/ //Ошибка: java: no suitable method found for println(int,int,int)
        public static void main(String[] args) {
            try{
                System.out.println( 2/0 );
            } catch ( ArithmeticException e ) {
                System.out.println("Attempted division by zero");
            }
        }
}
