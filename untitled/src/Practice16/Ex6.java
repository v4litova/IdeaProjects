package Practice16;

public class Ex6 {
    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message );
    }
    /*public static String getDetails(String key) {
        if (key == null) {
                throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }*/ //Ввод null: NullPointerException: null key in getDetails
    public static String getDetails(String key) {
        if (key == null) {
            try {
                throw new NullPointerException("null key in getDetails");
            } catch (NullPointerException e) {
                key = "null";
            }
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        printMessage(null);
    }
}
