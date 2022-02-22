import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Students students1 = new Students("canh", "pt", 26);
        Students students2 = new Students("n.anh", "pt", 25);
        Students students3 = new Students("q.anh", "pt", 24);
        Map<Integer, Students> studentsMap = new HashMap<Integer, Students>();
        studentsMap.put(1, students1);
        studentsMap.put(2, students2);
        studentsMap.put(3, students3);
        studentsMap.put(4, students1);

        for(Map.Entry<Integer, Students> student : studentsMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println(". . . . .. ..  Set");
        Set<Students> students = new HashSet<Students>();
        students.add(students1);
        students.add(students2);
        students.add(students3);
        students.add(students1);

        for(Students student : students){
            System.out.println(student.toString());
        }
    }
}
