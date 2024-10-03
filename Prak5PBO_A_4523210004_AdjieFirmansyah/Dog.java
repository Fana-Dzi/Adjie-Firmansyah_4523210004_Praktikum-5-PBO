public class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Bermain dengan anak-anak");
    }

    @Override
    public void eat() {
        System.out.println("Makan daging ayam");
    }

    @Override
    public void walk() {
        System.out.println("Jalan dengan temannya");
    }
}