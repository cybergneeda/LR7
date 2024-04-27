import java.util.Map;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String string,int number, Map <String, Integer> price,Map<String, Integer> quantity);

}
