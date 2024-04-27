import java.util.*;

public class Shop implements Subject {

    ArrayList<Observer> obsList= new ArrayList<>();
    public void registerObserver(Observer o)
    {
        obsList.add(o);
    }

    public void removeObserver(Observer o)
    {
        if (obsList.contains(o))
            obsList.remove(o);  
    }

    public void notifyObservers(String string,int number, Map <String, Integer> price,Map<String, Integer> quantity)
    {
        for (Observer o:obsList)
            o.update(string,number,price,quantity);        
    }}
