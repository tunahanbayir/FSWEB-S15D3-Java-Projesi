import entity.Empoloyee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List< Empoloyee> employees = new LinkedList<>();
        employees.add(new Empoloyee(1, "emrah", "kızıltan"));
        employees.add(new Empoloyee(1, "emrah", "kızıltan"));
        employees.add(new Empoloyee(2, "ahmet", "yılmaz"));
        employees.add(new Empoloyee(2, "anıl", "başol"));
        employees.add(new Empoloyee(3, "ayşe", "duymaz"));
        employees.add(new Empoloyee(3, "yusuf", "korkmaz"));
        employees.add(new Empoloyee(4, "mehmet", "sönmez"));
        employees.add(new Empoloyee(4, "mehmet", "sönmez"));
        employees.add(new Empoloyee(5, "tunahan", "bayır"));

        Map<Integer,Empoloyee> empoloyeeMap = new HashMap<>();
        List<Empoloyee> removedEmployees = new ArrayList<>();

        Iterator<Empoloyee> iterator = employees.iterator();
        while (iterator.hasNext()){
           Empoloyee empoloyee = iterator.next();
           if(empoloyee == null){
               System.out.println("null data buldum");
               continue;
           }
           if(empoloyeeMap.containsKey(empoloyee.getId())){
               removedEmployees.add(empoloyee);
               iterator.remove();
           }
           else {
               empoloyeeMap.put(empoloyee.getId(),empoloyee);
           }
        }


    }
}