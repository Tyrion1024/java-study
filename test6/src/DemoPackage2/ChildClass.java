package DemoPackage2;

public class ChildClass extends AbstractClass implements TestInterface2 {

    public ChildClass (String str) {
        super(str);
    }

    @Override
    protected void showMsg() {
        System.out.println("I am an " + this.el);
    }

    public String abstractFunc () {
        return "ok,I'm an abstractFunc";
    }
    public String abstractFunc2 () {
        return "ok,I'm an abstractFunc2";
    }
}
