public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.append("bomva");
        System.out.println( textEditor);
        textEditor.append("vdrdfc");
        textEditor.undo();
        System.out.println( textEditor);
        textEditor.append("ergdrg");
        textEditor.undo();
        System.out.println( textEditor);
        textEditor.append("g");
        textEditor.undo();
        System.out.println( textEditor);

    }

    }

