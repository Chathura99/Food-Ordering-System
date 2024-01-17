### Builder Pattern

eg : IceCreamCustomizer

The Builder Pattern is used to construct a complex object step by step. It is especially useful when an object has several components and creating these objects requires multiple steps.

In the IceCreamCustomizer class, the Builder Pattern is used to create IceCreamCombination objects. Customers can choose flavors, toppings, and syrups step-by-step, and the final combination is built progressively.

This pattern simplifies the creation of IceCreamCombination objects with varying ingredients. It enhances readability and maintainability, especially when dealing with combinations that have numerous optional and required fields.

### Observer Pattern

eg : Order Tracking

The Observer Pattern is used when changes in one object (the subject) need to be reflected in other objects (the observers) without creating a tight coupling between them.

For the order tracking system (OrderTracking class), the Observer Pattern can be applied. The Order class is the subject, and when its status changes (e.g., from 'preparing' to 'ready for pickup'), it notifies all observers (like the user interface or email notification system).

It provides a clean separation of concerns. This pattern allows the order status updates to be sent to customers or displayed on the user interface without tightly coupling these components to the order processing logic.

### Strategy Pattern

eg : Payment

The Strategy Pattern is used to define a family of algorithms, encapsulate each one, and make them interchangeable. The strategy lets the algorithm vary independently from the clients that use it.

In the payment processing system, the Strategy Pattern allows the PaymentProcessor interface to define a common interface for all payment methods (like credit card, digital wallet). Specific payment strategies implement this interface.

It offers the flexibility to interchange different payment methods easily. New payment methods can be added without altering the existing code, adhering to the open/closed principle.

### Command Pattern

eg : Order

The Command Pattern encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.

When placing an order, the Command Pattern can be used to represent the action of placing an order as an OrderCommand object. This command object encapsulates all details of the action like the order details, user info, and the method to execute the order.

This pattern decouples the object that invokes the action from the object that performs the action. It provides flexibility in queueing, tracking, and managing orders.
### State Pattern

eg : Checking Order States

The State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

The Order class can use the State Pattern to change its behavior based on its state as examples

1.New
2.Preparing
3.Ready for Pickup
4.Completed

Different state classes represent these various states of an order.

It localizes the state-specific behavior and partitions behavior for different states. 
This makes it easier to add new states or modify existing ones without changing the class that uses the states.