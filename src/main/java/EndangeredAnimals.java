public class EndangeredAnimals extends Wildlife {
    private String health;
    private String age;
    public EndangeredAnimals(int id,String name,String health,String age){
        this.id = id;
        this.name = name;
        this.health = health;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }
}
