package com.codewithmosh.memento;

// "Originator"
public class Editor {
    private String content;

    // create state inside EditorState object and return it
    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
