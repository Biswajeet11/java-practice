package streams;

import java.util.*;
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
                new Person(25,"Peter", "Ukraine"),
                new Person(25,"Peitro", "Russia")
        );


        /*
        * Average age of people
        * */

        double ageValue = personList.stream().collect(Collectors.averagingInt(Person::getAge));

        System.out.println("ageValue "+ ageValue);


        System.out.println("------List of person who are either greater than 20 or contain a vowel in their name-------");
        /* List of person who are either greater than 20 or contain a vowel in their name*/
        List<String> vowelList = Arrays.asList("a","e","i","o","u");

        List<Person> personList1 = personList.stream().filter(person -> person.age > 20
                || vowelList.contains(person.getName())).collect(Collectors.toList());

        personList1.forEach(p-> System.out.println(p.getName()));

        /* Create list of people sorted in ascending order on the basis of age,
            if age is the same then sort in descending order of name
        */

        System.out.println("--------people sorted in ascending order on the basis of age  if age is the same then sort in descending order of name----------");
        personList.sort(Comparator.comparing(Person::getAge).
                thenComparing(Comparator.comparing(Person::getName)).reversed());

        personList.forEach(p->System.out.println(p.getName() + " " + p.getAge()));


        /*  Create a map from this people list where the key is country name and value is count which means
         a map will tell how many people live in a particular country
        */

        System.out.println("--------people list where the key is country name and value is count which means a map will tell how many people live in a particular country----------");

        Map<String,Long> countryMap = personList.stream().collect(
                Collectors.groupingBy(Person::getCountry,Collectors.counting()));

        countryMap.forEach((k,v)-> System.out.println("country"+ " " + k + " "+ "count" + " " + v));

        /** Create a map which stores avg age of people
         *  per country (key should be country and value should be average age i.e, double)
         */

        System.out.println("--------avg age of people per country----------");

        Map<String,Double> avgAgeCountryMap = personList.stream().collect(
                Collectors.groupingBy(Person::getCountry,Collectors.averagingDouble(Person::getAge)));

        avgAgeCountryMap.forEach((k,v)->System.out.println("country"+ " " + k + " "+ "avg" + " " + v));

        /*
        Print the oldest person in every country
        */


        System.out.println("-------oldest person in every country-----------");
        Map<String, Optional<Person>> oldestAgeCountryMap= personList.stream().collect(Collectors.groupingBy(Person::getCountry,
                Collectors.maxBy(Comparator.comparing(Person::getAge))));


        oldestAgeCountryMap.forEach((k,v)-> System.out.println("Country "+ k + " oldest age " +  v.get().getAge()));


        System.out.println("------------------");

       /* Print the country with most people */
        String country = Collections.max(countryMap.entrySet(),Comparator.comparing(Map.Entry::getValue)).getKey();

        System.out.println("country with most people "+country);




    }


}
