import Animals.Animals;
import Animals.EndangeredAnimals;
import DAO.DaoDb;
import DAO.EndangeredDao;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
      DaoDb dao = new DaoDb();
      EndangeredDao endangeredMain = new EndangeredDao();
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/animals-form", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "animals-form.hbs");
        }, new HandlebarsTemplateEngine());
        post("/animals-success", (request,response)->{
            Map<String, Object> model= new HashMap<>();
            String name = request.queryParams("name");
            String rangerName = request.queryParams("ranger_name");
            String location = request.queryParams("location");
            model.put("name",name);
            model.put("rangerName",rangerName);
            model.put("location",location);
            Animals animals = new Animals(name,rangerName,location);
            dao.add(animals);
            return new ModelAndView(model,"animals-success.hbs");
        }, new HandlebarsTemplateEngine());
        get("/EndangeredAnimals-form", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "EndangeredAnimals-form.hbs");
        }, new HandlebarsTemplateEngine());
        post("/EndangeredAnimals-success", (request,response)->{
            Map<String, Object> model= new HashMap<>();
            String name = request.queryParams("name");
            String health = request.queryParams("health");
            String age = request.queryParams("age");
            String rangerName = request.queryParams("rangerName");
            String location = request.queryParams("location");
            model.put("name",name);
            model.put("rangerName",rangerName);
            model.put("location",location);
            Animals animals = new Animals(name,rangerName,location);
            dao.add(animals);
            return new ModelAndView(model,"EndangeredAnimals-success.hbs");
        }, new HandlebarsTemplateEngine());

        post("/animals-view", (request,response) -> {
            Map<String, ArrayList<Animals>> model = new HashMap<String, ArrayList<Animals>>();
            ArrayList animals = Animals.getAll();
            String name = request.queryParams("name");
            String rangerName = request.queryParams("rangerName");
            String location = request.queryParams("location");
            model.put("allAnimals", animals);
            Animals animals1 = new Animals(name,rangerName,location);
            return new ModelAndView(model, "animals-view.hbs");
        }, new HandlebarsTemplateEngine());
        post("/EndangeredAnimals-view", (request,response) -> {
            Map<String, ArrayList<EndangeredAnimals>> model = new HashMap<String, ArrayList<EndangeredAnimals>>();
            ArrayList endangeredAnimals = EndangeredAnimals.getAll();
            String name = request.queryParams("name");
            String health = request.queryParams("health");
            String age = request.queryParams("age");
            String rangerName = request.queryParams("ranger_name");
            String location = request.queryParams("location");
            model.put("allEndangeredAnimals", endangeredAnimals);
            EndangeredAnimals endangeredAnimals1 = new EndangeredAnimals(name,health,age,location,rangerName);
            endangeredMain.add(endangeredAnimals1);
            return new ModelAndView(model, "EndangeredAnimals-view.hbs");
        }, new HandlebarsTemplateEngine());
    }
}

