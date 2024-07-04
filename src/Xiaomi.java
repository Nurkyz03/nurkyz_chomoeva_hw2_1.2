public class Xiaomi extends Phone {
    public Xiaomi(String brand, String model, String color, int price) {
        super(brand, model, color, price);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("\uD83D\uDFE2");
    }
}
