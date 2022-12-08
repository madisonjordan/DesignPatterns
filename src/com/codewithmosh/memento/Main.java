package com.codewithmosh.memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());  // save state "a"
        System.out.println(editor.getContent());

        editor.setContent("b");
        history.push(editor.createState());  // save state "b"
        System.out.println(editor.getContent());

        editor.setContent("c");
        System.out.println(editor.getContent());

        // undo "c" - restore previous state "b" to editor from history
        editor.restore(history.pop());
        System.out.println(editor.getContent());

        // undo "b" - restore previous state "a"
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}