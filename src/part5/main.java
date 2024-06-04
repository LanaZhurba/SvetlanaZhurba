package part5;

import java.util.*;

public class main {
    public static void main(String[] args) {
        String[] array = {"молоко", "карусель", "сыр", "молоко", "машина", "молокочай", "Машина", "Кресло", "молоко", "Молоко",
                "машина", "сыр", "доска", "кресло", "тетрадь"};

        HashSet<String> set = new HashSet<>();
        ArrayList<String> listUniqueWords = new ArrayList<>();
        for (String ar : array) {
            if (set.add(ar.toLowerCase(Locale.ROOT))) {
                listUniqueWords.add(ar.toLowerCase(Locale.ROOT));
            } else {
                listUniqueWords.remove(ar.toLowerCase(Locale.ROOT));
            }
        }
        System.out.println("Список уникальных слов: " + listUniqueWords + "\n");


        HashMap<String, Integer> listWordAndCount = new HashMap<>();
        for (String a : array) {
            if (!listWordAndCount.containsKey(a.toLowerCase(Locale.ROOT))) {
                listWordAndCount.put(a.toLowerCase(Locale.ROOT), 0);
            }
            listWordAndCount.put(a.toLowerCase(Locale.ROOT), listWordAndCount.get(a.toLowerCase(Locale.ROOT)) + 1);
        }
        System.out.println(listWordAndCount + "\n");

        Phone_Directory directory = new Phone_Directory();
        directory.add("79000000000", "Алексеев");
        directory.add("79010000000", "Буйнов");
        directory.add("79020000000", "Воронин");
        directory.add("79030000000", "Алексеев");
        directory.add("79040000000", "Алексеев");
        directory.add("79050000000", "Грачев");
        directory.add("79060000000", "Дмитриева");
        directory.add("79070000000", "Жуков");
        directory.add("79080000000", "Капустина");
        directory.add("79090000000", "алексеев");
        System.out.println(directory.get("Алексеев"));
    }
}
