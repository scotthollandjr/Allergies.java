import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String givenScore = request.queryParams("userInput");
      Integer score = Integer.parseInt(givenScore);

      Allergies newScore = new Allergies();
      ArrayList<String> resultsArray = newScore.runAllergies(score);

      model.put("givenScore", givenScore);
      model.put("resultsArray", resultsArray);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
