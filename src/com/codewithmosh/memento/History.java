package com.codewithmosh.memento;

import java.util.ArrayList;
import java.util.List;

// "Caretaker" - state management.
// Stores 0 or more EditorStates
public class History {
    // List interface - generic interface to build a list of <objects>
    private List<EditorState> states = new ArrayList<>();

    // save state to end of the list
    public void push(EditorState state) {
        states.add(state);
    }

    // undo - remove last state
    public EditorState pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }

}
