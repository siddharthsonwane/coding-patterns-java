package main.practice_interview;

class Person {
    String firstName;
    String lastName;
    int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{firstName:'" + firstName + "', lastName:'" + lastName + "', age:" + age + "}";
    }
}
