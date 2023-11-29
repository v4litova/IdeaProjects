package Practice24;

public class Test {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new RestaurantOrder();
        orders[3].add(new Dish(287,"Pizza", "Delicious pizza with various toppings"));
        orders[4].add(new Drink(30,"Tea", "Black tea with a hint of lemon"));
        orders[2].add(new Drink(32,"Coffee", "Freshly brewed coffee"));
        
        orderManager.add(orders[3], 7);
        orderManager.add(orders[4], 6);
        orderManager.add(orders[3], 2);
        orderManager.add("1", orders[4]);
        System.out.println(orderManager.getOrder("1").getItems());
        System.out.println(orderManager.freeTableNumbers());
    }
}
