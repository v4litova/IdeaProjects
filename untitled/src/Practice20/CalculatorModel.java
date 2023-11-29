package Practice20;

import java.util.Stack;

public class CalculatorModel {
    private Stack<Number> numberStack;
    public CalculatorModel() {
        numberStack = new Stack<>();
    }
    //добавляет число в стек
    public <T extends Number> void eventTick(T t) {
        numberStack.add(t);
    }
    public void eventTick(char c) {
        Number a;
        Number b;
        if (numberStack.size() < 2)
            return;
        switch (c) {
            case '*':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(Calculator.multiply(b,a));
                break;
            case '/':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(Calculator.divide(b,a));
                break;
            case '+':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(Calculator.sum(b,a));
                break;
            case '-':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(Calculator.subtraction(b,a));
                break;
            default:
                throw new RuntimeException("Incorrect symbol detected");
        }
    }
    public void clearStack() {
        numberStack.clear();
    }

    @Override
    public String toString() {
        String result = "";
        int count = numberStack.size();
        for (Number number : numberStack) {
            result += number;
            if (count > 1) {
                result += " ";
            }
            count--;
        }
        return result;
    }
}