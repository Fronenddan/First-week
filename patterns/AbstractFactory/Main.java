
interface AbstractProductA {
    String display();
}

// Concrete Product A1
class ConcreteProductA1 implements AbstractProductA {
    @Override
    public String display() {
        return "Concrete Product A1";
    }
}

// Concrete Product A2
class ConcreteProductA2 implements AbstractProductA {
    @Override
    public String display() {
        return "Concrete Product A2";
    }
}


interface AbstractProductB {
    String show();
}

// Concrete Product B1
class ConcreteProductB1 implements AbstractProductB {
    @Override
    public String show() {
        return "Concrete Product B1";
    }
}

// Concrete Product B2
class ConcreteProductB2 implements AbstractProductB {
    @Override
    public String show() {
        return "Concrete Product B2";
    }
}

// Abstract Factory 1
interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}

// Concrete Factory 1
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}

// Concrete Factory 2
class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}

// Client Code
class Client {
    void run(AbstractFactory factory) {
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();

        System.out.println(productA.display());
        System.out.println(productB.show());
    }
}

// the main
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client();
        client1.run(factory1);

        System.out.println("----------");

        AbstractFactory factory2 = new ConcreteFactory2();
        Client client2 = new Client();
        client2.run(factory2);
    }
}
