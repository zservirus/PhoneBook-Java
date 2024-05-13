package edit;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class convertBook {
    private static final HashMap<Persons,TreeSet<String>> bookTZ = new HashMap<>();
    
    public static List<String>  sortPhoneBook(HashMap<Persons, TreeSet<String>> book){
        List<String> sortBook1 = new ArrayList<>();
        for(Map.Entry<Persons,TreeSet<String>> entry : book.entrySet()) {
            Persons key = entry.getKey();
            TreeSet<String> value = entry.getValue();
            sortBook1.add( key.getNameLast()+" "+key.getNameFirst() +": "+ value);
        }
        sortBook1.sort((second, first) -> Integer.compare(first.length(), second.length()));
        
        return sortBook1;
    }
    
    
    
    public static HashMap<Persons, TreeSet<String>> mergeTZPhoneBook(HashMap<Persons, String> book){
        for(Map.Entry<Persons, String> entry : book.entrySet()) {
            TreeSet<String> listPhone = new TreeSet<String>();
            Persons key = entry.getKey();
            String value = entry.getValue();
            listPhone.add(value);
            if (bookTZ.isEmpty() == true) {
                bookTZ.put(key, listPhone);
            }
            boolean findRecord = false;
            for(Map.Entry<Persons, TreeSet<String>> entryTZ : bookTZ.entrySet()) {
                Persons keyTZ = entryTZ.getKey();
                TreeSet<String> valueTZ = entryTZ.getValue();
                if (keyTZ.equals(key) == false) {
                    findRecord = false;
                }
                else {
                    findRecord = true;
                    listPhone.addAll(valueTZ);
                    key.setUid(keyTZ.getUid());
                }
            }
            if (findRecord == true){
                bookTZ.replace(key, listPhone);
            }
            else {
                bookTZ.put(key, listPhone);
            }    
        }    
    return  bookTZ;
    }
}