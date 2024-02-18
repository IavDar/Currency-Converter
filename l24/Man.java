package l24;


public class Man extends People {

    protected String militaryRank;

    public Man(String name, int age, String militaryRank) {
        super("Man", name, age);

        this.militaryRank = militaryRank;

    }

    public void applySkill () {
        System.out.println("Бреет бороду");

    }

    public boolean equals(Man man) {

        return (super.equals(man)
            && this.militaryRank.equals(man.militaryRank));
    }

}
