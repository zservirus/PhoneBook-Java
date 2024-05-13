package generate;
import edit.*;
import java.util.HashMap;
import java.util.Random;


/**
 * GenerateBook
 */
public class GenerateBook {
    private static final HashMap<Persons, String> generatephoneBook = new HashMap<>();
    
    public static Persons genPerson(int c) {
        Persons newpersona = new Persons();
        String[] lastName = {"Петров","Сидоров","Смирнов","Михеев", "Иванов","Семенов","Баширов" };
        String[] firstName = {"Павел","Максим","Денис","Михаил", "Александр","Роман","Николай" };
        Random rand = new Random();
        newpersona.setNameLast(lastName[rand.nextInt(0,3)]);
        newpersona.setNameFirst(firstName[rand.nextInt(0,3)]);
        newpersona.setUid(c);
        
        return newpersona;
    }
    public static String genPhone() {
        String[] number1 = {"8999","8923","8945","8914", "8917","8964","8345" };
        Random rand = new Random();
        return number1[rand.nextInt(7)] + Integer.toString(rand.nextInt(1000000,9999999));
    }

    public static HashMap<Persons, String> genPhoneBook(int count) {
        
        
        for (int i = 1; i < count; i++) {
            generatephoneBook.put(genPerson(i),genPhone());
            
        }
        // for(Map.Entry<Persons,String> entry : generatephoneBook1.entrySet()) {
        //     
        //     Persons key = entry.getKey();
        //     String value = entry.getValue();
        //     listPhone.add(value);
        //     generatephoneBook.put(key,listPhone);
            
        
        // } 
        // System.out.println(generatephoneBook);  
        return generatephoneBook;
    }


}