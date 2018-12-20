import java.util.*;

public class Main {

    public static void main(String[] args) {
        String info = "Лабораторная работа №5\n" +
                "Студента группы ПЭ-171 - Семёнова Евгения Александровича\n" +
                "Задания: \n" +
                "1) Создать список из 10 случайных чисел (от 1 до 10)," +
                "затем отсортировать и вывести его по возрастанию.\n" +
                "2) Создать коллекцию Map с числовыми ключами и строковыми значениями," +
                "затем вывести их через ключ по порядку.\n" +
                "3) Создать коллекцию из объектов и сортировать их по Id\n";
        System.out.println(info);
//        Первое задание
        List<Integer> randInts = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            randInts.add( (int)(Math.random() * 10) );
        }
        for(int i = 0; i < randInts.size(); i++) {
            System.out.println(randInts.get(i));
        }
        Collections.sort(randInts);
        System.out.println("Сортированные значения:");
        for(int i = 0; i < randInts.size(); i++) {
            System.out.println(randInts.get(i));
        }
        //Второе задание
        String[] names = {"Влад", "Петя", "Маша","Даша", "Света"};
        Map<Integer, String> map = new HashMap<Integer, String>();
        for(int i = 0; i< 10; i++){
            String name = names[(int)(Math.random() * names.length)];
            map.put(i,name);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet() ) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
        //Третье задание
        List<MyObj> myObjLists = new ArrayList<MyObj>();

        for(int i = 0; i < 10; i++) {
            myObjLists.add( new MyObj() );
        }
        for(int i = 0; i < 10; i++) {
            myObjLists.get(i).setId((int)(Math.random() * 10));
        }
        for(MyObj o: myObjLists){
            System.out.println(o.getId());
        }
        System.out.println("После сортировки");
        Collections.sort(myObjLists);
        for(MyObj o: myObjLists){
            System.out.println(o.getId());
        }
    }
}
