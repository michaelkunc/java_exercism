import java.util.*;

public class School {

    public Map<Integer, List<String>> school = new HashMap<Integer, List<String>>();

    public Map<Integer, List<String>> db(){
        return school;
    }

    public void add(String studentName, Integer grade){
        if (school.containsKey(grade)) {
            List<String> studentGrade = school.get(grade);
            studentGrade.add(studentName);
            school.put(grade, studentGrade);
        } else {
            List<String> newGrade =
        }
        List<String> record = grade(grade);
        record.add(studentName);
        school.put(grade, record);
    }

//    public List<String> grade(Integer grade){
//        if(school.containsKey(grade)){
//            return school.get(grade);
//        }
//        return new ArrayList<String>();
//    }

    public Map<Integer, List<String>> sort() {
        for (Integer i : school.keySet()){
            List<String> names = school.get(i);
            Collections.sort(names);
        }
        return school;
    }


}

