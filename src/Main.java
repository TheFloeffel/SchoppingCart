public class Main {

    public static void main(String[] args) {

        Apple a1 = new Apple();
        Pencil p1 = new Pencil();
        Pencil p2 = new Pencil();
        Washingmachine w1 = new Washingmachine();

        Shoppingcart s1 = new Shoppingcart();

        s1.content.add(a1);
        s1.content.add(p1);
        s1.content.add(p2);
        s1.content.add(w1);

        s1.sum();

    }

}
