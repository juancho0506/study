package com.in28minutes.exercises.newreleases.java16.records;

public class JavaRecordsRunner {

    record Person (String name, String email, String phoneNumber){}

    record Person2 (String name, String email, String phoneNumber){
        //With custom constructor:
        /*Person2(String name, String email, String phoneNumber){
            if (name == null)
                throw new IllegalArgumentException("Name is not valid.");
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }*/

        //With Compact constructor:
        Person2{
            if (name == null)
                throw new IllegalArgumentException("Name is not valid.");
        }
        //This is allowed:
        public String name(){
            System.out.println("Additional logic to getName() or name() method.");
            return name;
        }
        //This is not allowed:
        //int name2;
        //This is allowed:
        static int name2;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Juan", "juane@gmail.com", "123-456-7890");
        Person person2 = new Person("Juan2", "juane2@gmail.com", "123-456-7890");
        Person person3 = new Person("Juan3", "juane3@gmail.com", "123-456-7890");
        System.out.printf("""
                Person1: %s
                Person2: %s
                Person3: %s
                %n""", person1, person2, person3);
        System.out.println(person1.equals(person2));
        System.out.println(person3.name());
        Person2 person2nd = new Person2("Juan3", "juane3@gmail.com", "123-456-7890");
        System.out.println(person2nd);
        var name2 = Person2.name2;
    }
}
