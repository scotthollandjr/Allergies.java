import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AllergiesTest {

  @Test
  public void runAllergies_shouldReturnCats_ArrayList() {
    Allergies allergyTest = new Allergies();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("cats");
    assertEquals(expected, allergyTest.runAllergies(128));
  };

  @Test
  public void runAllergies_shouldReturnCatsPollen_ArrayList() {
    Allergies allergyTest = new Allergies();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("cats");
    expected.add("pollen");
    assertEquals(expected, allergyTest.runAllergies(192));
  };

  @Test
  public void runAllergies_shouldReturnTomatoesShellfish_ArrayList() {
    Allergies allergyTest = new Allergies();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("tomatoes");
    expected.add("shellfish");
    assertEquals(expected, allergyTest.runAllergies(20));
  };

  @Test
  public void runAllergies_shouldReturnFiveList_ArrayList() {
    Allergies allergyTest = new Allergies();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("pollen");
    expected.add("strawberries");
    expected.add("shellfish");
    expected.add("peanuts");
    expected.add("eggs");
    assertEquals(expected, allergyTest.runAllergies(79));
  };
}
