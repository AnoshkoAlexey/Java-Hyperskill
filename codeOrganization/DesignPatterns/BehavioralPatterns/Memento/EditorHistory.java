package codeOrganization.DesignPatterns.BehavioralPatterns.Memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorHistory {
    private final Editor editor;
    private final Deque<Editor.EditorState> history = new ArrayDeque<>();

    EditorHistory(Editor editor) {
        this.editor = editor;
    }
    
    public void save() {
        history.push(editor.getState());
    }

    public void undo() {
        if (!history.isEmpty()) {
            editor.setState(history.pop());
        }
    }
}
