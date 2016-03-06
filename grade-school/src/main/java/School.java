import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class School {

    public Map<Integer, List<String>> school = new HashMap<Integer, List<String>>();

    public Map<Integer, List<String>> db(){
        return school;
    }

    public void add(String studentName, Integer grade){
        List<String> record = grade(grade);
        record.add(studentName);
        school.put(grade, record);
    }

    public List<String> grade(Integer grade){
        if(school.containsKey(grade)){
            return school.get(grade);
        }
        return new ArrayList<String>();
    }
}

