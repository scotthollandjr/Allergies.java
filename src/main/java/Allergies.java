import java.util.ArrayList;

public class Allergies {

  public static ArrayList<String> runAllergies (Integer score) {
    ArrayList<String> allergyArray = new ArrayList<String>();

      while (score >= 128) {
        allergyArray.add("cats");
        score -= 128;
      }
      while (score >= 64) {
        allergyArray.add("pollen");
        score -= 64;
      }
      while (score >= 32) {
        allergyArray.add("chocolate");
        score -= 32;
      }
      while (score >= 16) {
        allergyArray.add("tomatoes");
        score -= 16;
      }
      while (score >= 8) {
        allergyArray.add("strawberries");
        score -= 8;
      }
      while (score >= 4) {
        allergyArray.add("shellfish");
        score -= 4;
      }
      while (score >= 2) {
        allergyArray.add("peanuts");
        score -= 2;
      }
      while (score >= 1) {
        allergyArray.add("eggs");
        score -= 1;
      }
      return allergyArray;
  }
}
