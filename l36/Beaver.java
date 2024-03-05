package l36;

import java.util.Objects;

public class Beaver implements Comparable <Beaver> {
    private String name;
    private int age;
    private int relativesCount;

    public Beaver(String name, int age, int relativesCount) {
        this.name = name;
        this.age = age;
        this.relativesCount = relativesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Beaver)) return false;
        Beaver beaver = (Beaver) o;
        return getAge() == beaver.getAge() && getRelativesCount() == beaver.getRelativesCount() && Objects.equals(getName(), beaver.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getRelativesCount());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRelativesCount() {
        return relativesCount;
    }

    public void setRelativesCount(int relativesCount) {
        this.relativesCount = relativesCount;
    }

    @Override
    public int compareTo(Beaver o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return name + ": " + age + " года, " + "количество родственников: " + relativesCount;
    }
}
