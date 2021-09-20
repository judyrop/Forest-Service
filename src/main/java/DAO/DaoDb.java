package DAO;

import Animals.Animals;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DaoDb implements Dao {
    @Override
    public void add(Animals animals) {
        Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "judy", "1234");
        try {
//            Class.forName("org.h2.Driver");
            String sql = "INSERT INTO animals (name) VALUES (:name)";
            Connection con = sql2o.open();
            int id= (int) con.createQuery(sql, true)
                    .bind(animals)
                    .executeUpdate()
                    .getKey();
        } catch (Exception ex){
            System.out.println("Invalid request");
            ex.printStackTrace();
        }
    }

    @Override
    public void find() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
