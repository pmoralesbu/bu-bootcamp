import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;




public class GradeAnalyzerTest {

  @Test 
  void calculateAverage_returnsZero_whenListIsEmpty(){
    ArrayList<Integer> scores = new ArrayList<>();
    assertEquals(0.0, GradeAnalyzer.calculateAverage(scores));
  }
   @Test
   void calucateAverge_returnsCorrectAverage_forTypicalScores(){
    ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(80, 90, 100));
    assertEquals(90.0, GradeAnalyzer.calculateAverage(scores));

   }

   @Test
   void calculateAverage_returnSingleValue_whenListHasOneItem() {
    ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(75));
    assertEquals(75.0, GradeAnalyzer.calculateAverage(scores));
   }

   @Test
   void calculateAverage_returnDouble_notInteger() {
    ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(1, 2));
    assertEquals(1.5, GradeAnalyzer.calculateAverage(scores));
   }

   @Test 
   void calculateAverage_handlesAllSameValues() {
    ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(88, 88, 88));
    assertEquals(88.0, GradeAnalyzer.calculateAverage(scores));
   }

   @Test
   void calculateAverage_getTotalAverageOfScores(){
    ArrayList<Integer> scores = new ArrayList<>();
    scores.add(100);
    scores.add(80);
    scores.add(90);
    scores.add(70);
    scores.add(65);
    scores.add(54);
    scores.add(20);
    scores.add(56);
    scores.add(10);
    scores.add(87);

    double x = GradeAnalyzer.calculateAverage(scores);
    assertEquals(63.2 , x);

   }

}
