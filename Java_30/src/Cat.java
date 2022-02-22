public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("Dog eating fish");
    }
    
    @Override 
    public void makeSound(){
        System.out.println("Meow meow meow meow meow meow");
    }
}
