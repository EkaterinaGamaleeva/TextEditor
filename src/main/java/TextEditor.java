import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private History history;
    private String text;
    private List<String> texts;

    {
        history= new History();
        texts=new ArrayList<>();
    }

    public void  toStringText(){
        System.out.print( '\n' +"TextEditor " +
                    "text='" + text + '\'' +
                    ", texts="
    + "\n");
        texts.stream().forEach(System.out::println);
    }

    public List<String> getText() {
        return texts.stream().toList();
    }

    public void append(String text) {
         texts.add(text);
         this.text=text;
         saveStateMemento();
    }
    private Memento saveStateMemento(){
        Memento memento =new Memento(text);
        history.saveHistoryMamento(memento);
        return memento;
    }
    public void undo(){
        text = history.getMementoSaveNewMomento().getText();
    }




    public void deleteText()
    {
        texts=new ArrayList<>();
    }

    public void deleteTextByIndex(int index){
        texts.remove(index);
    }
    public void deleteTextByObject(String string){
        texts.remove(string);
    }
    public void updateTextByIndex(int index,String s){
        texts.add(index,s);
    }
    public int lastIndexOf(String str){
        int index=0;
        return index=lastIndexOf(str);
    }

    public int indexOf(String str)
    {
        int index=0;
        index=str.indexOf(str);
        return index;
    }
    public List<String> reverse(){
       ArrayList<String> texts2=new ArrayList<>();
            for (int i = texts.size() - 1; i >= 0; i--) {
                texts2.add(texts.get(i));
        }
        return texts2;
    }
}
