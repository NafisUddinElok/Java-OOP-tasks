class productfilter{
    void filter(String category) {
        System.out.println("Filtering products by category: " + category);
    }
    void filter(double minprice, double maxprice){
        System.out.println("Filtering products by price range: " + minprice + " to " + maxprice);
    }
    void filter(String brand, boolean ifbrand){
        System.out.println("Filtering products by brand: " + brand);
    }

    void filter(String category, double minprice, double maxprice, String brand){
        System.out.println("Filtering products by category: " + category + ", price range: " + minprice + " to " + maxprice + ", brand: " + brand);
    }
}

public class p4a{
    public static void main(String[] args){
        productfilter pf = new productfilter();
        pf.filter("Electronics");
        pf.filter(100.0, 500.0);
        pf.filter("Samsung", true);
        pf.filter("Electronics", 100.0, 500.0, "Samsung");
    }
}