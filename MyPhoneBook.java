import edit.*;
import generate.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import print.PrintGen;



public class MyPhoneBook {
    private static HashMap<Persons, String> testPhoneBook1 = new HashMap<>();
    private static HashMap<Persons, TreeSet<String>> testPhoneBook2 = new HashMap<>();
    private static List<String> testPhoneBook3 = new ArrayList<>();
  
      
    public static void main(String[] args) {
      
      testPhoneBook1 = GenerateBook.genPhoneBook(10); //Генерируем Телефоную книку с уникальными записями
      testPhoneBook2 = convertBook.mergeTZPhoneBook(testPhoneBook1); // Объединяем номера телефонов с одинаковым именем и фамилией
      testPhoneBook3 = convertBook.sortPhoneBook(testPhoneBook2); // делаем сортированный список по количеству телефонов на одну фамилию
      PrintGen.printAllPhoneBook(testPhoneBook1); //Печатаем книгу в которой все номера храняться в базе как уникальные записи
      PrintGen.printMergePhoneBook(testPhoneBook2); // печатаем сгрупированные номера по фамилиям
      PrintGen.printSortBook(testPhoneBook3); // Выводим отсортированный список

    }

}
