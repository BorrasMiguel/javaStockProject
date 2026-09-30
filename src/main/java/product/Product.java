package product;

public class Product {

    private String ref;
    private String name;
    private int stock;

    public Product() {}

    public Product(String ref, String name, int stock) {

        this.ref = ref;
        this.name = name;
        this.stock = stock;
    }

    public String getRef() {
        return ref;
    }

    public String getName() {
        return name;
    }


    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount < 0 ) {
            System.out.println("Error: Amount is negative");
        } else {
            this.stock = this.stock + amount;
        }
    }


    public void removeStock(int amount) {
        if (amount < 0 || amount > this.stock) {
            System.out.println("Error: Amount is invalid");
        } else {
            this.stock = this.stock - amount;
        }
    }

    @Override
    public String toString() {
        return "Product [ref=" + ref + ", name=" + name + ", stock=" + stock + "]";
    }
}








