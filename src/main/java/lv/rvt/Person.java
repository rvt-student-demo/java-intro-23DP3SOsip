package lv.rvt;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;
    private SimpleDate date;
    private String adress;

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, SimpleDate date , int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.date = date;
    }

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public Person(String name, int age, int height, int weight, String adress) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.adress = adress;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean equals(Object compared) {
    if (this == compared) {
        return true;
    }
    if (!(compared instanceof Person)) {
        return false;
    }
    Person comparedPerson = (Person) compared;
    if (this.name.equals(comparedPerson.name) &&
        this.age == comparedPerson.age &&
        this.weight == comparedPerson.weight &&
        this.height == comparedPerson.height) {
        return true;
    }
    return false;
    }
    
    @Override
    public String toString() {
        return this.name + " \n " + this.adress;
    }
}
