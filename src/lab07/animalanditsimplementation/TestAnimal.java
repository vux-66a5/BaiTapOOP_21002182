package lab07.animalanditsimplementation;

public class TestAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat("Meo");
        cat.greets();
        System.out.println();

        Animal dog1 = new Dog("Cho1");
        dog1.greets();
        Dog dog2 = new Dog("Cho2");
        ((Dog)dog1).greets(dog2);
        System.out.println();

        Animal bigdog1 = new BigDog("ChoTo1");
        bigdog1.greets();

        ((BigDog)bigdog1).greets(dog2);

        BigDog bigdog2 = new BigDog("ChoTo2");
        ((BigDog)bigdog1).greets(bigdog2);
    }
}
