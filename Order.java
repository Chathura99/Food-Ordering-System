
public class Order {
    private NewIceCreamCombination combination;
    private int quantity;
    private String orderType;

    public Order() {
    }

    public NewIceCreamCombination getCombination() {
        return combination;
    }

    public void setCombination(NewIceCreamCombination combination) {
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
