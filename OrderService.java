
public class OrderService {
    public Order createOrder(IceCreamCombination combination, int quantity, String orderType) {
        Order order = new Order();
        order.setCombination(combination);
        order.setQuantity(quantity);
        order.setOrderType(orderType);
        return order;
    }
}
