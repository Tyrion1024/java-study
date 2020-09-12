package DemoPackage2;


public class MyEnum {

    public MyEnum() {
        for (Color color : Color.values()) {
            color.setColor();
        }
    }

    public enum Color {
        RED("red color", 0),
        GREEN("green color", 1),
        BLUE("blue color", 2),
        YELLOW("yellow color", 3);

        Color(String name, int id) {
            _name = name;
            _id = id;
        }

        private String _name;
        private int _id;

        public String getName() {
            return _name;
        }

        public int getId() {
            return _id;
        }

        public void setColor() {
            System.out.println("Current paint color: " + _name);
        }
    }

}
