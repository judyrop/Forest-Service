package Animals;

public class Animals extends Wildlife {
    public Animals(String name){
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setId(int id){
        this.id =id;
    }
//    @Override
//    public boolean equals(Object otherAnimals){
//        if(!(otherAnimals instanceof Animals)){
//            return false;
//        }else {
//            Animals newAnimal = (Animals) otherAnimals;
//            return this.getName().equals(newAnimal.getName());
//        }
//    }
//    public void save(){
//        try(Connection con = DB.sql2o.open()){
//            String sql = "INSERT INTO animals(id,name) VALUES (:id,:name)";
//            con.createQuery(sql)
//                    .addParameter("name",this.name)
//                    .executeUpdate();
//        }
//    }
//    public static List<Animals>all(){
//        String sql = "SELECT * FROM animals";
//        try(Connection con = DB.sql2o.open()){
//            return con.createQuery(sql).executeAndFetch(Animals.class);
//        }
//    }
//    public static Animals find(int id) {
//        try(Connection con = DB.sql2o.open()) {
//            String sql = "SELECT * FROM animals where id=:id";
//          Animals animal = con.createQuery(sql)
//                    .addParameter("id", id)
//                    .executeAndFetchFirst(Animals.class);
//            return animal;
//        }
//    }
//    public void update(){
//        try(Connection con = DB.sql2o.open()){
//            String sql = "UPDATE FROM animals(id,name) VALUES (:id,:name)";
//            con.createQuery(sql)
//                    .addParameter("name",this.name)
//                    .executeUpdate();
//        }
//    }
}
