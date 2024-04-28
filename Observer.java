import java.util.Map;

public interface Observer {
    void update(String string,Map <String, Integer> price,Map<String, Integer> quantity);
}
