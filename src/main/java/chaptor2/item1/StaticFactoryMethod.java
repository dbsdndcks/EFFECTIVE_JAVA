package chaptor2.item1;

public class StaticFactoryMethod {
    String name;
    int age;

    private  StaticFactoryMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static StaticFactoryMethod createAdult(String name) {
        return new StaticFactoryMethod(name, 18);
    }
    public static StaticFactoryMethod createChild(String name) {
        return new StaticFactoryMethod(name, 10);
    }
    public static StaticFactoryMethod of(String name, int age) {
        return new StaticFactoryMethod(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
