package Task;

public class Customer extends Person {
    private final int customerId;
    private final int discount;

    Customer(String name, int age, int customerId, int discount) {
        super(name, age);
        this.customerId = customerId;
        this.discount = discount;
    }

    int getDiscountPric(int price) {
        int dis = price - (price * discount / 100);
        return dis;

    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Customer ID:" + customerId + "," + "discount:" + discount + "%");
    }


}
