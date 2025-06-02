package _31_Generic.Product;

public class ProductController {
    public static void main(String[] args) {
        Product<String> product1 = new Product<>("LapTop","Intel i7");
        Product<Double>product2 = new Product<>("SmartPhone",799.99);
        Product<Boolean>product3 = new Product<>("Available",true);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
