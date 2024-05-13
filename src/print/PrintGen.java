package print;

import edit.Persons;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;


public class PrintGen {
    
    
    public static void printName(String[] name) {
        System.out.println(name[0] + '\t' + name[1]);
    }
    

    public static void printPersona(Persons contakt){
        System.out.print("("+contakt.getUid()+") "+contakt.getNameLast()+" "+contakt.getNameFirst()+"\t");
       
    }
    

    public static void printAllPhoneBook(HashMap<Persons, String> book){
        System.out.println();
        System.out.println();
        System.out.println("Печатаем книгу в которой все номера храняться в базе как уникальные записи");
        System.out.println("--------------------------------------------------------------------------");
        for(Map.Entry<Persons,String> entry : book.entrySet()) {
            Persons key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key.toString()+"\tНомер телефона:"+value);
        }
        System.out.println();
    }
    public static void printMergePhoneBook(HashMap<Persons, TreeSet<String>> book){
        System.out.println("Печатаем сгрупированные номера по фамилиям");
        System.out.println("------------------------------------------");
        for(Map.Entry<Persons,TreeSet<String>> entry : book.entrySet()) {
            Persons key = entry.getKey();
            TreeSet<String> value = entry.getValue();
            System.out.print(key);
            System.out.println(value);
        }
        System.out.println();
    }
    public static void printSortBook(List<String> book){
        System.out.println("Печатаем список отсортированый по убыванию числа телефонов");
        System.out.println("------------------------------------------");
        for(String kontakt : book){
            System.out.println(kontakt);
        }
        System.out.println();
    }       
   
  

}


        
    
