public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
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
        System.out.println("Main pasir");
    }

    @Override
    public void eat() {
        System.out.println("Makan ikan asin");
    }

    @Override
    public void walk() {
        System.out.println("Jalan di atas genteng");
    }
}