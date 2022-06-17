package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private int age;
    private String name;
    private String country;

    Person(int age, String name, String country){
        this.age = age;
        this.name = name;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(3,"Ram", "India"),
                new Person(23,"John", "USA"),
                new Person(13,"Anthony", "Germany"),
                new Person(35,"Jim", "USA"),
                new Person(15,"Sam", "UK"),
                new Person(25,"Peter", "UAE")
        );


        /*
        * Average age of people
        * */

        double ageValue = personList.stream().collect(Collectors.averagingInt(Person::getAge));

        System.out.println("ageValue "+ ageValue);

        /* List of person who are either greater than 20 or contain a vowel in their name*/
        List<String> vowelList = Arrays.asList("a","e","i","o","u");

        List<Person> personList1 = personList.stream().filter(person -> person.age > 20
                || vowelList.contains(person.getName())).collect(Collectors.toList());

        personList1.forEach(p-> System.out.println(p.getName()));

        /* Create list of people sorted in ascending order on the basis of age,
            if age is the same then sort in descending order of name
        */

    }


}
