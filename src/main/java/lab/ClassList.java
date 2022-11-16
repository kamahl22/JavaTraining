package lab;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassList {
    public static void main(String[] args) {
//    ArrayList courses = new ArrayList();
        // <xxx> is "generics"
//    ArrayList<String> courses = new ArrayList<String>(Arrays.asList(99, "Biology"));
        ArrayList<String> courses = new ArrayList<>(Arrays.asList(/*99, */"Biology"));
//    names.banana(99); // NOPE :)
        System.out.println("element zero is " + courses.get(0));
        courses.add("Sign Language");
        courses.add("Finance");
        System.out.println(courses);
        System.out.println(courses.size());
        courses.add("Math");
        courses.set(1, "Engineering");
        courses.remove(0);
        System.out.println(courses);
        System.out.println(courses.size());

        // autoboxing... (see also auto-un-boxing)
//    names.add(99); // this is identical in effect to the below
//    names.add(Integer.valueOf(99));

        // NOPE, it's 99!!! which is an Integer, not a String
        // (xxx) is called a "cast"
        // if it's not a string, it will throw a ClassCastException
        // during execution
//    String s = (String)names.get(0);
        String s = courses.get(0);
    }
}
