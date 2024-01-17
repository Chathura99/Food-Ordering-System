
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String status;
    private final List<OrderObserver> observers = new ArrayList<>();
    private boolean isPlaced;

    public void placeOrder() {
        this.isPlaced = true;
        System.out.println("Order has been placed.");
    }

    public void setStatus(String status) {
        this.status = status;
        notifyAllObservers();
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }
}

interface OrderObserver {
    void update(Order order);
}

class UserInterface implements OrderObserver {
    @Override
    public void update(Order order) {
        // Update the user interface based on order status
    }
}
