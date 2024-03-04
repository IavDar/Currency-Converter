package l35;

public class Beaver implements Comparable <Beaver> {
    private String name;
    private int age;
    private int relativesCount;

    public Beaver(String name, int age, int relativesCount) {
        this.name = name;
        this.age = age;
        this.relativesCount = relativesCount;
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
