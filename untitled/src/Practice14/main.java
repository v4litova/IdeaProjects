package Practice14;

public class main {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new BoundedWaitList<Integer>(2);
        waitList.add(3);
        waitList.add(7);
        waitList.add(6);
        System.out.println(waitList);

        UnfairWaitList<Integer> unfairwaitList = new UnfairWaitList<Integer>();
        unfairwaitList.add(3);
        unfairwaitList.add(7);
        unfairwaitList.add(6);
        unfairwaitList.moveToBack(3);//элемент 3 в конец списка
        System.out.println(unfairwaitList);
    }
}
