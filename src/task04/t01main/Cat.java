package task04.t01main;

public class Cat {
    private String name = "Котык";
    private int age = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if (age == 1 || age == 21){
            return "Котыка зовут " + name + ", ему 1 год";}
        else if ((age > 1) && (age < 5) || (age > 21) && (age < 25)){
            return "Котыка зовут " + name + ", ему " + age + " года";}
        else {
            return "Котыка зовут " + name + ", ему " + age + " лет";}
    }
}
