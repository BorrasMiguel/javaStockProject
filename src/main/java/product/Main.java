package product;

public class Main {
    public static void main(String[] args) {
        Product prueba = new Product("X2B", "Poste", 20);
        System.out.println(prueba);
        prueba.addStock(10);
        System.out.println(prueba);
        prueba.removeStock(22);
        System.out.println(prueba);
        prueba.removeStock(8);
        System.out.println(prueba);
        prueba.removeStock(10);
        System.out.println(prueba);
        prueba.addStock(10);
        prueba.addStock(-5);

    }

}
