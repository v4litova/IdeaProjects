package Practice18.Ex4;

public class Calculator {
    public static <T extends Number> T sum(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
    }

    public static <T extends Number> T multiply(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        }
    }

    public static <T extends Number> T divide(T a, T b) {
        if (b.doubleValue() == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() / b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        }
    }

    public static <T extends Number> T subtract(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() - b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        }
    }

    public static void main(String[] args) {
        // Пример использования методов калькулятора
        System.out.println("Sum: " + Calculator.sum(5, 3));
        System.out.println("Multiply: " + Calculator.multiply(4.5, 2));
        System.out.println("Divide: " + Calculator.divide(10, 2));
        System.out.println("Subtract: " + Calculator.subtract(8, 3));
    }
}
