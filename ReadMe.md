https://dzone.com/articles/gof-design-patterns-using-java-part-1

https://dzone.com/articles/gof-design-patterns-using-java-02

Observer Pattern
------------------
The Observer Pattern, as the name suggests, is used in scenarios when updates need to be done at multiple points (Observers) depending on changes in state at another place (Subject). Each of the Observers has to register themselves with the Subject, individually. The Subject should also provide methods that allow the observers to remove themselves. Registered observers are informed of changes in state through a notify method. Usually.

The provided example is that of a StockBroker application, which involves the maintenance of various types of financial information. The Subject is the interface in the application that provides a template for the Observed class. StockData is the concrete implementation of the Subject and provides the implementation for addObserver(), removeObserver() and notifyObservers(). Additionally, it maintains a list of registered observers. IncomeHandler, InvestmentHandler and

PortfolioHandler includes the various observers used to maintain the income, investments, and portfolio of a specific StockBroker. All these depend on the constantly fluctuating values of stocks. They are specifically interested in the stockSymbol, stockValue, and stockUnits of each individual stock. Each of the Observers implements the interface Observer. The Observer interface provides the update() method, which is implemented by each of these concrete classes.


Decorator Pattern
-------------------
The Decorator Pattern provides an elegant way to use composition for enhancing functionality where the result expected has a direct dependency on the composed and composing class. A chain relation (via composition) or decoration can be finally used to achieve the desired output at runtime. In real-time, when the functionality of one particular product is expected to be built from a base product and various other related sub-products or fixtures, we can rely on the Decorator.

The attached example is that of a Pizza application. Here, the pizzas in the shop are made with various combinations of bases and topping combinations. This is a classic example to use the Decorator Pattern on. Pizza is the abstract base class for each of the pizza bases to implement, and ToppingDecorator is another abstract class that inherits from Pizza for each of the toppings to implement. Hawaiian, Italian, and Mexican are the concrete implementations of Pizza, whereas Mushroom, Onion, and Chicken are the concrete implementations of ToppingDecorator. Each of these toppings encapsulates a Pizza instance. This instance, at runtime, will hold another topping or the pizza base instance. Finally, it is when the cost has to be calculated on the entire pizza that the real value of decorator pattern is seen and just one call suffices to calculate the entire bill value.

Command Pattern
------------------
In scenarios where we need to create a sequence of actions (or operations) and perform them at a specified (later) point in time, we have a candidate for usage of the Command Pattern. Though it very closely resembles the Observer pattern in implementation, the usage is different and the command (actions) is invoked only on a single chosen receiver by an invoker, rather than on all Observers.

We'll look at an example of an auction house where there are various items for auction. The base abstract class of the lots is represented by AuctionItem. The abstract method to be implemented by implementing classes is sell(). AuctionVase, AuctionFurniture, and AuctionJewel are all concrete implementations of AuctionItem. Instances of each of these are created and set (mapped by an itemKey) into the AuctionControl, which can be thought of as a remote control for presenting items in the AuctionStore. Whenever the presentItem() is invoked on the AuctionControl class, passing in an itemKey, the appropriate AuctionItem instance is selected and sell() is invoked on this instance.

