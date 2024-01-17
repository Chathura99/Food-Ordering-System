
public interface OrderCommand {
    void execute();
}

class PlaceOrderCommand implements OrderCommand {
    private Order order;

    public PlaceOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.placeOrder();
    }
}

class CommandInvoker {
    private OrderCommand command;

    public CommandInvoker(OrderCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
