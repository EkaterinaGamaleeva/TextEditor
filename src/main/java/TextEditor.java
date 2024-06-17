import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private History history;
    private String text;

    {
        history= new History();

    }


    public String getText() {
        return text ;
    }

    public void append(String text) {
         this.text=text;
         saveStateMemento();
    }
    public Memento saveStateMemento(){
        Memento memento =new Memento(text);
        history.saveHistoryMamento(memento);
        return memento;
    }
    public void undo(){

        text = history.getMementoSaveNewMomento();
    }
    @Override
    public String toString() {
        return "TextEditor{" +
                "text='" + text + '\'' +
                '}';
    }
}
