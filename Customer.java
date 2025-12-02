package Task;

public class Customer extends Person {
    private final int customerId;
    private final int discount;

    public Customer(String name, int age, int customerId, int discount) {
        super(name, age);
        this.customerId = customerId;
        this.discount = discount;
    }

    public int getCustomerId() {
        return customerId;
    }
    public int getDiscount() {
        return discount;
    }

    public int getDiscountPrice(int price) {
        return price - (price * discount / 100);
    }


    public void showDetails() {
        super.showDetails();
        System.out.println("Customer ID: " + customerId + ", Discount: " + discount + "%");
    }
}
