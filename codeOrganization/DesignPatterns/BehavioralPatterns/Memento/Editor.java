package codeOrganization.DesignPatterns.BehavioralPatterns.Memento;

public class Editor {
    private String text = "";
    private int textSize = 12;
    private int textColor = 0x000000;

    public void setText(String text) {
        this.text = text;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    @Override
    public String toString() {
        return "Editor{" +
            "text='" + text '\'' +
            ", textSize=" + textSize +
            ", textColor=" + String.format("0x%06X", textColor) +
            '}';
    }

    public EditorState getState() {
        return new EditorState(text, textSize, textColor);
    }

    public void setState(EditorState state) {
        this.text = state.text;
        this.textSize = state.textSize;
        this.textColor = state.textColor;
    }

    static class EditorState {
        private final String text;
        private final int textSize;
        private final int textColor;

        private EditorState(String text, int textSize, int textColor) {
            this.text = text;
            this.textSize = textSize;
            this.textColor = textColor;
        }
    }
}
