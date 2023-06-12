import java.security.Key;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class StudentNew {
    public static void main(String[] args) {
        Map<Integer,Students> h=new Hashtable<>();
        Students s1=new Students(1,"Jagdish","Mumbai","Chandra@123");
        Students s2=new Students(2,"Bharat","Thane","b@123");
        Students s3=new Students(3,"xyz","Worli","xyz@123");
        h.put(s1.getId(),s1);
        h.put(s2.getId(),s2);
        h.put(s3.getId(),s3);
        for(Map.Entry<Integer,Students> val:h.entrySet()){
            int stdid=val.getKey();
            Students st=val.getValue();
            System.out.println("Student id "+stdid+" "+"student name "+st.getName()+" "+"Student address "+st.getAddress()+" Email "+st.getEmail());
        }
    }
}
