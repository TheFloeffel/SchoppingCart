import java.util.ArrayList;

public class Shoppingcart {

    public int number;
    public ArrayList<iBuyable> content = new ArrayList<iBuyable>();

    public void sum() {
        double total = 0;

        for (iBuyable item : content) {
            total += item.price();
        }

        System.out.println("The total price of the shoppingcart content is $" + total);
    }

}
