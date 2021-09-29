package DAO;

import Animals.EndangeredAnimals;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class EndangeredDao implements EDao {

    Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "judy", "1234");

    @Override
    public void add(EndangeredAnimals endangeredAnimals) {
        String sql = "INSERT INTO endangered_animals (name,health,age,location,ranger_name) VALUES (:name,:health,:age,:location,:rangerName)";
        try( Connection con = sql2o.open()){
            int id= (int) con.createQuery(sql, true)
                    .bind(endangeredAnimals)
                    .executeUpdate()
                    .getKey();
            endangeredAnimals.setId(id);
        } catch (Exception ex){
            System.out.println("Invalid request");
            ex.printStackTrace();
        }
    }
    @Override
    public List<EndangeredAnimals> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM endangered_animals")
                    .executeAndFetch(EndangeredAnimals.class); //fetch a list
        }
    }
}
