package main.custom_equal;
import java.lang.reflect.Member;
import java.util.Objects;
public class Employee {
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /***Part 1️⃣ id == user.id
     id == user.id

     What it does

     id is a primitive int

     == compares actual values for primitives

     Example
     int a = 10;
     int b = 10;

     a == b  // true


     So:

     If both users have the same id → true

     If not → false

     ✔ Correct and recommended for primitives

     Part 2️⃣ Objects.equals(email, user.email)
     Objects.equals(email, user.email)

     What it does

     Safely compares two objects (String)

     Handles null values without throwing exception

     Internally, it works like this:
     (email == user.email) ||
     (email != null && email.equals(user.email))*/
}
