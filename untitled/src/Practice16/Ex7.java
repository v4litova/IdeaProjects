package Practice16;

import java.util.Scanner;

public class Ex7 {
    /*public static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public static void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private static String getDetails(String key) {
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }*/ //Ошибка: unreported exception java.lang.Exception

    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getDetails(String key) throws Exception {
        if (key.compareTo("") == 0) {
            throw new Exception("key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}

