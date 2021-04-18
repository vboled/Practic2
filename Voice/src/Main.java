public class Main {

    public static void main(String[] argv) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();

        cat.voice();
        dog.voice();
        cow.voice();
    }
}
