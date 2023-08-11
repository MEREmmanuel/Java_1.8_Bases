
public class DiscountCalculator {

    public double calculateDiscount(double price, double discountPercentage) {
        if (discountPercentage <= 0) {
            return price;
        }
        if (discountPercentage >= 100) {
            return 0;
        }
        double discountAmount = (price * discountPercentage) / 100;
        return price - discountAmount;
    }
}
