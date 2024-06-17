public class Main {
    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();

        textEditor.setText("bomva");

        textEditor.toStringText();
        textEditor.setText("vdrdfc");

        textEditor.undo();
        textEditor.toStringText();
        textEditor.setText("ergdrg");

        textEditor.undo();
        textEditor.toStringText();
        textEditor.setText("g");
        textEditor.undo();
        textEditor.toStringText();

    }
}
