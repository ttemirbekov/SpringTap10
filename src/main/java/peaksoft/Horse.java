package peaksoft;

public class Horse implements Animal {
    private String name;
    private String color;
    private int age;

    public Horse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void animalPlus() {
        System.out.println("We can ride it");
    }

    @Override
    public void animalMinus() {
        System.out.println("He can kick you");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
