package com.codewithmosh.memento;

// "Memento" - state
public class EditorState {
    // final - cannot accidentally change after initialization
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

}
