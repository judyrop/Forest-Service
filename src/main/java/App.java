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
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/animals-form", (request, response) -> {
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
        get("/EndangeredAnimals-form", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "EndangeredAnimals-form.hbs");
        }, new HandlebarsTemplateEngine());
        post("/EndangeredAnimals-success", (request,response)->{
            Map<String, Object> model= new HashMap<>();
            String name = request.queryParams("name");
            model.put("name",name);
            Animals animals = new Animals(name);
            dao.add(animals);
            return new ModelAndView(model,"EndangeredAnimals-success.hbs");
        }, new HandlebarsTemplateEngine());
        get("/sighting-form", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "sighting-form.hbs");
        }, new HandlebarsTemplateEngine());
        post("/sighting-success/new", (request,response)->{
            Map<String, Object> model= new HashMap<>();
            String name = request.queryParams("name");
            model.put("name",name);
            Animals animals = new Animals(name);
            dao.add(animals);
            return new ModelAndView(model,"sighting-success.hbs");

        }, new HandlebarsTemplateEngine());
    }
}

