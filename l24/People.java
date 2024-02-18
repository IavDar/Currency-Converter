package l24;

import java.util.Objects;

public class People {
    protected String gender;
    protected String name;
    int age;

    public People(String gender, String name, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    // переопределила метод equals() для класса People:

    public boolean equals(People people) {
        if (this == people) return true;
        if (people == null) return false;
        if (this.getClass() != people.getClass()) return false;


        if (this.age ==  people.age && Objects.equals(this.gender, people.gender) && Objects.equals(this.name, people.name))
            return true;
        else
            return false;

    }

    // переопределила метод hashCode():
    @Override
    public int hashCode()
    {
        int result1 = gender != null ? gender.hashCode() : 0;
        int result2 = name != null ? name.hashCode() : 0;
        return result1 + result2 + age;

    }

    public void applySkill () {
        System.out.println("Умеют говорить");
    }

    public String toString () {
            return gender + " | " + this.name + " | " + age;
        }

}

