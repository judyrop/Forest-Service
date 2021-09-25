package DAO;

import Animals.Animals;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class DaoDb implements Dao {
    Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "judy", "1234");
    @Override
    public void add(Animals animals) {
        String sql = "INSERT INTO animals (name) VALUES (:name)";
        try { Connection con = sql2o.open();
            int id= (int) con.createQuery(sql, true)
                    .bind(animals)
                    .executeUpdate()
                    .getKey();
            animals.setId(id);
        } catch (Exception ex){
            System.out.println("Invalid request");
            ex.printStackTrace();
        }
    }



    @Override
    public List<Animals> getAll() {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM animals") //raw sql
                    .executeAndFetch(Animals.class); //fetch a list
        }
    }
    @Override
    public List<Animals> findById(int id) {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM animals WHERE  id =:id")
                    .addParameter("id", id)
                    .executeAndFetch(Animals.class);
        }

    }

    @Override
    public void update() {
        String sql = "UPDATE animals SET name = :name WHERE id=:id";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("name")
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void delete() {
        String sql = "DELETE from tasks WHERE id=:id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }
}
