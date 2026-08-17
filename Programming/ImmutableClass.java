import java.util.List;
import java.util.ArrayList;
//Immutable class when there are mutable fields
public class ImmutableClass{
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("SQL");
        ImmutableStudent IS = new ImmutableStudent(list);
        list.add("Python");
        System.out.println(list);
        System.out.println(IS.getList());

    }
}
//Make class as final
final class ImmutableStudent{

    //Fields as private so no other classes can modify
    //Final to  not reassign 
    private final List<String> list;

    ImmutableStudent(List<String> subjects){
        //while refering to mutable class make a copy for this class separately
        this.list = new ArrayList<>(subjects);
    }

    //While returning a mutable class return a copy
    public List<String> getList(){
        return List.copyOf(list);
    }
}   