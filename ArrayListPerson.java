import java.util.ArrayList;

public class ArrayListPerson
{  
  public static void main(String[] args)
  { 

    ArrayList<Person> people = new ArrayList<Person>();
    people.add(new Person("Mike",18, 750.00));
    people.add(new Person("Sue", 25, 820.00));
    people.add(new Person("Bob", 30, 600.00));


    //list.add("My cousin")


    for (Person p : people) {
      System.out.println(p.getName());
  
    }
  }
}