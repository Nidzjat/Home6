import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Phonebook{
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = " ";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ваня", 4275, bookPhone);
        addNumber("Владимир", 89234, bookPhone);
        addNumber("Петя", 82453, bookPhone);
        addNumber("Петя", 8975, bookPhone);
        addNumber("Владимир", 8956, bookPhone);
        addNumber("Ваня", 8932, bookPhone);
        addNumber("Владимир", 82145, bookPhone);
        addNumber("Петя", 7878, bookPhone);
        addNumber("Владимир", 82145, bookPhone);
        printBook(bookPhone);
    }
}