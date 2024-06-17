public class Main {
    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();

        textEditor.setText("bomva");
        textEditor.saveStateMemento();
        textEditor.toStringText();
        textEditor.setText("vdrdfc");
        textEditor.saveStateMemento();
        textEditor.undo();
        textEditor.toStringText();
        textEditor.setText("ergdrg");
        textEditor.saveStateMemento();
        textEditor.undo();
        textEditor.toStringText();
        textEditor.setText("g");
        textEditor.undo();
        textEditor.toStringText();


    }
}
