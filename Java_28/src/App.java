public class App {
    public static void main(String[] args) throws Exception {
       Dog dog = new Dog("Husky");
    //    dog.bark();
    //    dog.eat();

       BabyDog bbD = new BabyDog("Pitbull");
       bbD.bark();
       bbD.weep();

       Cat c = new Cat("Cat");
       c.eat();

    }
}
