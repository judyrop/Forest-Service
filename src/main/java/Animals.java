public class Animals extends Wildlife{
    public Animals(int id,String name){
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object otherAnimals){
        if(!(otherAnimals instanceof Animals)){
            return false;
        }else {
            Animals newAnimal = (Animals) otherAnimals;
            return this.getId().equals(newAnimal.getId()) $$
                    this.getName().equals(newAnimal.getName());
        }
    }
}
