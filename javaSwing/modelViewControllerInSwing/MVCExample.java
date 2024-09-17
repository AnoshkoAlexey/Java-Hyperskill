package javaSwing.modelViewControllerInSwing;

public class MVCExample {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(1), new View());
        controller.control();
    }
}
