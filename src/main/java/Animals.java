import org.sql2o.Connection;

import java.util.List;

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
            return this.getName().equals(newAnimal.getName());
        }
    }
    public void save(){
        try(Connection con = DB.sql2o.open()){
            String sql = "INSERT INTO animals(id,name) VALUES (:id,:name)";
            con.createQuery(sql)
                    .addParameter("name",this.name)
                    .executeUpdate();
        }
    }
    public static List<Animals>all(){
        String sql = "SELECT * FROM animals";
        try(Connection con = DB.sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Animals.class);
        }
    }
}
