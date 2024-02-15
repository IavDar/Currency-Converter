package l23;

public class People {
    protected String gender;
    protected String name;
    protected int age;

    public People(String gender, String name, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public void applySkill () {
        System.out.println("Умеют говорить");
    }

    public String toString () {
            return gender + " | " + this.name + " | " + age;
        }

}

