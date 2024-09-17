package javaSwing.modelViewControllerInSwing;

import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;
    private ActionListener actionListener;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setText(String.valueOf(model.getNumber()));
    }

    public void control() {
        actionListener = actionEvent -> {
            model.increment();
            view.setText(Integer.toString(model.getNumber()));
        };
        view.getButton().addActionListener(actionListener);
    }
}
