
interface OrderState {
    void next(Order order);
    void previous(Order order);
    void printStatus();
}

class NewOrderState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new PreparingOrderState());
    }

    @Override
    public void previous(Order order) {
        System.out.println("The order is in its initial state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order placed, not prepared yet.");
    }
}

class PreparingOrderState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new ReadyForPickupState());
    }

    @Override
    public void previous(Order order) {
        order.setState(new NewOrderState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order is being prepared.");
    }
}

class ReadyForPickupState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new OrderCompletedState());
    }

    @Override
    public void previous(Order order) {
        order.setState(new PreparingOrderState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order is ready for pickup.");
    }
}

class OrderCompletedState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order is already completed.");
    }

    @Override
    public void previous(Order order) {
        System.out.println("Order is already completed.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been completed.");
    }
}

class Order {
    private OrderState state = new NewOrderState();

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void previousState() {
        state.previous(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
