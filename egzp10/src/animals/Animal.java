package animals;

public class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}

class Dog extends Animal
{
    private String name;

    public Dog(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString()+"Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog(10,"Reksio");
        Dog d2 = new Dog(13,"NoName");
        Animal a1 = new Animal(15);
        System.out.println(isSameSpecies(d1,a1));
        System.out.println(isSameSpecies(d1,d2));
    }
    public static <T extends Animal> boolean isSameSpecies(Animal animal1, Animal animal2)
    {
        if(animal1.getClass().equals(animal2.getClass()))
        {
            return true;
        }
        return false;
    }
}