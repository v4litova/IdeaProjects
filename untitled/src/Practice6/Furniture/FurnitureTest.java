package Practice6.Furniture;

public class FurnitureTest {
    public static void main(String[] args) {

        Furniture chair = new Chair("Стул", "Дерево", 5000.0 );
        Furniture table = new Table("Стол", "Стекло", 12000.0);

        Furniture[] inventory = { chair, table };
        FurnitureShop shop = new FurnitureShop(inventory);

        shop.listInventory();
    }
}
