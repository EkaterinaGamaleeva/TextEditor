import java.util.ArrayList;

public class History {
    private ArrayList<Memento> mementos=new ArrayList<>();

    public void saveHistoryMamento(Memento memento){
        mementos.add(memento);
    }
    public String getMementoSaveNewMomento() {
        String string="";
        if (mementos.size()<=1){
            new ArrayList<>();
            string="";
        }else {
            string = mementos.get(mementos.size() - 2).getText();
            mementos.remove(mementos.get(mementos.size() - 1));
        }
       return string;
    }

}
