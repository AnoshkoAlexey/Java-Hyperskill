package codeOrganization.DesignPatterns.BehavioralPatterns.Memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EditorHistory history = new EditorHistory(editor)

        history.save();
        editor.setText("Hello, world!");

        history.save();
        editor.setTextSize(24);

        history.save();
        editor.setTextColor(0x00FF00);

        System.out.println(editor);
    }
    
}
