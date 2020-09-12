package DemoPackage2;

public interface TestInterface1 {
    String name = "TestInterface1";

    default void saySomething () {
        System.out.println("I 'm " + this.name);
    }

    abstract String abstractFunc();

}
