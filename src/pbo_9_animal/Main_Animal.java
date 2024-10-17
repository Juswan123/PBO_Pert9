package pbo_9_animal;
public class Main_Animal {
    public static void main(String[] args) {
        Spider spider = new Spider();
        Cat cat = new Cat();
        Fish fish = new Fish();
        spider.eat();
        fish.setName("Nemo");
        cat.setName("Nyaa");
        cat.play();
        cat.eat();
        fish.walk();
        fish.play();
        fish.eat();
    }
    
}
