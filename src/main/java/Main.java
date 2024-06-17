public class Main {
    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();
        textEditor.append("bomva");
        textEditor.toStringText();
        textEditor.append("vdrdfc");
        textEditor.undo();
        textEditor.toStringText();
        textEditor.append("ergdrg");
        textEditor.undo();
        textEditor.toStringText();
        textEditor.append("g");
        textEditor.undo();
        textEditor.toStringText();

    }
}
