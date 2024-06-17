public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.append("bomva");
        textEditor.append("vdrdfc");
        textEditor.append("ergdrg");
        textEditor.append("g");
        textEditor.undo();
        System.out.println( textEditor);
        textEditor.undo();
        System.out.println( textEditor);
        textEditor.undo();
        System.out.println( textEditor);
        textEditor.undo();
        System.out.println( textEditor);

    }

    }

