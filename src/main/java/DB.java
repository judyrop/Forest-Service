import org.sql2o.Sql2o;

public class DB {

    public static Sql2o sql2o = new Sql2o("jdbc:postgresql:/wildlife_tracker/localhost:5432/",null,null);
}
