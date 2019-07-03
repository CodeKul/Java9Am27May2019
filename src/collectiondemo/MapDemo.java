package collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,Object> map=new HashMap<>();
        Student student=new Student();
        student.setName("Anjusha");
        student.setAddress("Indore");
        student.setAge(21);
        map.put("student",student);

        Student student1= (Student) map.get("student");
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
        System.out.println(student1.getAge());

    }

}
