package Practice6.Furniture;

public class FurnitureShop {
    private Furniture[] inventory;
    public FurnitureShop(Furniture[] inventory) {
        this.inventory = inventory;
    }
    public void listInventory() {
        System.out.println("Инвентарь магазина мебели:");
        for (Furniture item : inventory) {
            item.displayInfo();
            item.form();
            System.out.println();
        }
    }
}
