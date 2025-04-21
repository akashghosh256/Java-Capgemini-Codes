package resturantPack;

public class OrderLimitException extends RuntimeException {
    public OrderLimitException() {
        super("Order limit exceeded! Maximum 5 orders allowed.");
    }
}
