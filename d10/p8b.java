abstract class Restaurant {

    double foodPrice;

    Restaurant(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    double calculateTotalBill() {
        double tax = foodPrice * 0.10;
        return foodPrice + tax;
    }

    int estimateDeliveryTime() {
        return 40;
    }
}

class FastFoodRestaurant extends Restaurant {

    FastFoodRestaurant(double foodPrice) {
        super(foodPrice);
    }

    @Override
    double calculateTotalBill() {
        double tax = foodPrice * 0.15;
        return foodPrice + tax;
    }

    @Override
    int estimateDeliveryTime() {
        return 20;
    }
}
class FineDiningRestaurant extends Restaurant {

    FineDiningRestaurant(double foodPrice) {
        super(foodPrice);
    }


    @Override
    int estimateDeliveryTime() {
        return 60;
    }
}
public class p8b {
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant(1000) {}; 
        Restaurant r2 = new FastFoodRestaurant(1000);
        Restaurant r3 = new FineDiningRestaurant(1000);

        System.out.println("Regular Restaurant:");
        System.out.println("Bill: " + r1.calculateTotalBill());
        System.out.println("Delivery Time: " + r1.estimateDeliveryTime());

        System.out.println("\nFast Food Restaurant:");
        System.out.println("Bill: " + r2.calculateTotalBill());
        System.out.println("Delivery Time: " + r2.estimateDeliveryTime());

        System.out.println("\nFine Dining Restaurant:");
        System.out.println("Bill: " + r3.calculateTotalBill());
        System.out.println("Delivery Time: " + r3.estimateDeliveryTime());
    }
}