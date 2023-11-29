package Practice23;

public class Test {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new Order();
        
        orders[3].add(new Dish(287, "Spaghetti", "Delicious pasta with sauce"));
        orders[3].add(new Dish(30, "Salad", "Fresh green salad"));
        orders[1].add(new Dish(38, "Steak", "Juicy steak with potatoes"));

        orderManager.add(orders[3], 6);
        orderManager.add(orders[5], 4);
        orderManager.removeOrder(5);
        orderManager.add(orders[1], 3);

        System.out.println("Total cost of all orders: " + orderManager.ordersCostSummary());
        System.out.println("Free table numbers: " + orderManager.freeTableNumbers());
        System.out.println("Free table number for a new order: " + orderManager.freeTableNumber());
    }
}
