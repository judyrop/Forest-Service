import Animals.Animals;
import DAO.DaoDb;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
      DaoDb dao = new DaoDb();
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "animals-form.hbs");
        }, new HandlebarsTemplateEngine());
        post("/animals-success", (request,response)->{
            Map<String, Object> model= new HashMap<>();
            String name = request.queryParams("name");
            model.put("name",name);
            Animals animals = new Animals(name);
            dao.add(animals);
            return new ModelAndView(model,"animals-success.hbs");
        }, new HandlebarsTemplateEngine());
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "EndangeredAnimals-form.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
