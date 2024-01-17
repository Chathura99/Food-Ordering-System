
public class Order {
    private IceCreamCombination combination;
    private int quantity;
    private String orderType;

    public Order() {
    }

    public IceCreamCombination getCombination() {
        return combination;
    }

    public void setCombination(IceCreamCombination combination) {
        this.combination = combination;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
