import org.sql2o.Connection;
import org.sql2o.Sql2o;
import spark.resource.ExternalResource;

public class DatabaseRule extends ExternalResource {
@Override
    protected void before(){
    DB.sql2o = new Sql2o("jdbc:postgresql:/wildlife_tracker/localhost:5432/",null,null);
}

}
