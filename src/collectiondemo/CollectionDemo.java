package collectiondemo;

import java.util.*;

public class CollectionDemo {
    List<Integer> list1 = new ArrayList<>();
    int a = 10;

    private List<Integer> getArrayList() {
        list1.add(3);
        list1.add(10);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(0, 2);
        list.addAll(list1);

        System.out.println("value at 2 : " + list.get(2));
        return list;
    }

    private List<String> getStringList() {

        List<String> nameList = new ArrayList<>();
        nameList.add("Krati");
        nameList.add("sakshi");
        nameList.add("codekul");
        nameList.add(String.valueOf(a));
        return nameList;
    }
    Set<String> set = new TreeSet<>();

    private Set<String> getSet() {
        set.clear();
        set.add("krati");
        set.add("sakshi");
        set.add("codekul");
        set.add("gaytri");
        set.add("anujusha");
        set.add("unnati");
        set.add("sujit");

        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String s : set) {
            System.out.println(s);
        }

        return set;
    }

    public static void main(String[] args) {

        CollectionDemo demo = new CollectionDemo();
        demo.getSet();

    }

}
