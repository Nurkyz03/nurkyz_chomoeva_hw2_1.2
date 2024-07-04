public class Main {
    public static void main(String[] args) {
        Printable obj2 = createObject("Apple");
        Printable obj3 = createObject("Samsung");
        Printable obj4 = createObject("Xiaomi");

        Printable[] printables = new Printable[] { obj2, obj3, obj4 };

        for (Printable printable : printables) {
            printable.print();
            System.out.println();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Apple":
                return new Apple("Apple", "iPhone 15 Pro Max", "Blue", 1100);
            case "Samsung":
                return new Samsung("Samsung", "Samsung Galaxy S24", "Yellow", 1600);
            case "Xiaomi":
                return new Xiaomi("Xiaomi", "Xiaomi 14 Pro", "Green", 850);
            default:
                throw new IllegalArgumentException("Invalid className: " + className);
        }
    }
}