package DemoPackage2;

public abstract class AbstractClass implements TestInterface1 {
    String el = "";
    public  AbstractClass (String str) {
        this.el = str;
    }
    protected abstract void showMsg();

}
