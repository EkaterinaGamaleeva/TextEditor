import java.util.ArrayList;

public class History {
    private Memento memento;
private ArrayList<Memento> mementos;

    {
        mementos=new ArrayList<>();
    }
    public ArrayList<Memento> getMementos() {
        return mementos;
    }

    public void saveHistoryMamento(Memento memento){
        mementos.add(memento);
    }
    public Memento getMementoSaveNewMomento() {
        return mementos.get(mementos.size()-2);
    }

}
