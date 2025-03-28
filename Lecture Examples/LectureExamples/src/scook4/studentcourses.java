package scook4;
import java.util.*;

public class studentcourses {
    public static void main(String[] args) {
        HashMap<String, List<String>> studentInfo = new HashMap<>(); 
        
        studentInfo.put("Alice", Arrays.asList("history", "science", "english"));  
        studentInfo.put("Jenny", Arrays.asList("science", "arts")); 
        studentInfo.put("Kevin", Arrays.asList("maths", "english")); 

        printStudentInfo(studentInfo);

        String courseName = "science"; 
        List<String> enrolledStudents = getStudentsByCourse(studentInfo, courseName); 
        System.out.println("Students taking science: " + enrolledStudents);
    }
    
    static void printStudentInfo(HashMap<String, List<String>> map) { 
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " is enrolled in " + entry.getValue());
        }
    }

    public static List<String> getStudentsByCourse(HashMap<String, List<String>> map, String courseName) { 
        // Create a list to store the student names
        List<String> studentNames = new ArrayList<>(); 
        for (Map.Entry<String, List<String>> entry : map.entrySet()) { 
            if (entry.getValue().contains(courseName)) { 
                studentNames.add(entry.getKey());
            }
        }
        return studentNames;  
    }
}

    
    
    
    
    
    
    
