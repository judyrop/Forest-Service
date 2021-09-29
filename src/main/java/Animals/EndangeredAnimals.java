package Animals;

import java.util.ArrayList;

public class EndangeredAnimals extends Wildlife{
    private String health;
    private String age;
    private static ArrayList<EndangeredAnimals> instances = new ArrayList<>();
    public EndangeredAnimals(String name,String health,String age,String location,String rangerName){
        this.name = name;
        this.health = health;
        this.age = age;
        this.location = location;
        this.rangerName = rangerName;
        this.instances.add(this);
    }

    public EndangeredAnimals() {

    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id =id;
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
    public String getRangerName(){
        return rangerName;
    }
    public String getLocation(){
        return location;
    }
    public static ArrayList<EndangeredAnimals> getAll(){
        return instances;
    }
}
