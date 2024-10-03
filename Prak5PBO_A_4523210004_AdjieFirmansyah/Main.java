public class Main {
    public static void main(String[] args) {
    
        spider spider = new spider();
        spider.eat();
        spider.walk();

    
        Dog musky = new Dog();
        musky.setName("musky");
        System.out.println("Name dog: " + musky.getName());
        musky.play();
        musky.eat();
        musky.walk();

        // Buat objek garfill dan set namanya
        Cat garong = new Cat("Garong");
        System.out.println("Name cat: " + garong.getName());
        garong.play();
        garong.eat();
        garong.walk();
    }
}