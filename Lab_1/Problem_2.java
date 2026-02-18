package Lab_1;

import java.util.Objects; //проверка на null

public class Problem_2 {

    enum Status { //фиксированные
        CREATED, PAID, SHIPPED, CANCELLED
    }

    private static int ordersCreated = 0;

    private static final double MAX_DISCOUNT = 0.30; //30%

    private final int id;
    private final String customerName;

    private Status status;
    private double total;

    {
        this.status = Status.CREATED; 
        ordersCreated++;             
    }

    public Problem_2(int id, String customerName) {
        this(id, customerName, 0.0); 
    }

    public Problem_2(int id, String customerName, double initialTotal) {
        this.id = id;
        this.customerName = Objects.requireNonNull(customerName);
        this.total = Math.max(0.0, initialTotal);
    }

    public int getId() { return id; }
    public String getCustomerName() { return customerName; }
    public Status getStatus() { return status; }
    public double getTotal() { return total; }

    public void addItem(double price) {
        addItem(price, 1); 
    }

    public void addItem(double price, int quantity) {
        if (status != Status.CREATED) {
            System.out.println("You cannot add items after payment/shipping/cancel.");
            return;
        }
        if (price < 0 || quantity <= 0) {
            System.out.println("Invalid price or quantity.");
            return;
        }
        total += price * quantity;
    }

    public void applyDiscount(double percent) {
        applyDiscount(percent, "General discount");
    }

    public void applyDiscount(double percent, String reason) {
        if (status != Status.CREATED) {
            System.out.println("Discount can be applied only before payment.");
            return;
        }
        if (percent < 0 || percent > MAX_DISCOUNT) {
            System.out.println("Discount must be between 0 and " + (MAX_DISCOUNT * 100) + "%.");
            return;
        }
        double discountAmount = total * percent;
        total -= discountAmount;
        System.out.println("Discount applied (" + reason + "): -" + discountAmount);
    }

    public void pay() {
        if (status != Status.CREATED) {
            System.out.println("Order cannot be paid in status: " + status);
            return;
        }
        if (total <= 0) {
            System.out.println("Total must be > 0 to pay.");
            return;
        }
        status = Status.PAID;
    }

    public void ship() {
        if (status != Status.PAID) {
            System.out.println("Order must be PAID before shipping.");
            return;
        }
        status = Status.SHIPPED;
    }

    public void cancel() {
        if (status == Status.SHIPPED) {
            System.out.println("Shipped order cannot be cancelled.");
            return;
        }
        status = Status.CANCELLED;
    }

    public static int getOrdersCreated() {
        return ordersCreated;
    }

    @Override
    public String toString() {
        return "Order{id=" + id +
                ", customer='" + customerName + '\'' +
                ", status=" + status +
                ", total=" + total +
                '}';
    }

    public static void main(String[] args) {
        Problem_2 order = new Problem_2(101, "Alan");
        order.addItem(5000); 
        order.addItem(1200, 2);
        order.applyDiscount(0.10); 
        order.pay();
        order.ship();

        System.out.println(order);
        System.out.println("Orders created: " + Problem_2.getOrdersCreated());
    }
}
