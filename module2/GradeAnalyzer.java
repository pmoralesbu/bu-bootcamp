
import java.io.*;
import java.util.ArrayList;

public class GradeAnalyzer {

  public static void main(String[] args) {
    
    String filename = "scores.txt";
    ArrayList<Integer> scoresOffTxtDoc = readScores(filename);

    System.out.println("\n");

    scoresOffTxtDoc.add(99);
    scoresOffTxtDoc.add(65);
    scoresOffTxtDoc.add(25);
    scoresOffTxtDoc.add(35);
    scoresOffTxtDoc.add(93);

    int low_value = Integer.MAX_VALUE;
    int high_value = Integer.MIN_VALUE;
    System.out.println("\n");

    for (int x : scoresOffTxtDoc) {
      if (x > high_value) {
        high_value = x;
      }

      if (x < low_value) {
        low_value = x;
      }

    }

    int scoresOffTxtDoc_counterA = 0;
    int scoresOffTxtDoc_counterB = 0;
    int scoresOffTxtDoc_counterC = 0;
    int scoresOffTxtDoc_counterD = 0;
    int scoresOffTxtDoc_counterF = 0;

    double avg = calculateAverage(scoresOffTxtDoc);

    System.out.printf("%s%n", "Average Scores:  " + avg);
    System.out.printf("%s%n", "Lowest Score: " + low_value);
    System.out.printf("%s%n", "Highest Score: " + high_value);

    int scoreNumber = 0;
    while (scoreNumber < scoresOffTxtDoc.size()) {
      int grade = scoresOffTxtDoc.get(scoreNumber);

      if (grade >= 90) {
        scoresOffTxtDoc_counterA = scoresOffTxtDoc_counterA + 1;

      } else if (grade >= 80 && grade <= 89) {
        scoresOffTxtDoc_counterB = scoresOffTxtDoc_counterB + 1;

      } else if (grade >= 70 && grade <= 79) {
        scoresOffTxtDoc_counterC = scoresOffTxtDoc_counterC + 1;

      } else if (grade >= 60 && grade <= 69) {
        scoresOffTxtDoc_counterD = scoresOffTxtDoc_counterD + 1;

      } else if (grade <= 60) {
        scoresOffTxtDoc_counterF = scoresOffTxtDoc_counterF + 1;

      }
      scoreNumber = scoreNumber + 1;

      String outputFile = "report.txt";

      writeReport(scoresOffTxtDoc, avg, high_value, low_value, scoresOffTxtDoc_counterA, scoresOffTxtDoc_counterB,
          scoresOffTxtDoc_counterC, scoresOffTxtDoc_counterD, scoresOffTxtDoc_counterF, outputFile);
    }

    System.out.println("\n");
    System.out.println("Grade Distribution:");
    System.out.printf("%s%n", "A (90 - 100): " + scoresOffTxtDoc_counterA);
    System.out.printf("%s%n", "B (80 - 89): " + scoresOffTxtDoc_counterB);
    System.out.printf("%s%n", "C (70 - 79): " + scoresOffTxtDoc_counterC);
    System.out.printf("%s%n", "D (60 - 69): " + scoresOffTxtDoc_counterD);
    System.out.printf("%s%n", "F (below 60): " + scoresOffTxtDoc_counterF);

  }

  public static ArrayList<Integer> readScores(String filename) {

    ArrayList<Integer> scoreX = new ArrayList<Integer>();

    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
      String line;
      int badlines = 0;
      while ((line = reader.readLine()) != null) {
        line = line.trim();

        try {
          if (line.isEmpty() == false) {
            int numberValueScore = Integer.parseInt(line);
            scoreX.add(numberValueScore);

          }

        } catch (NumberFormatException e) {
          badlines = badlines + 1;
          System.out.println(" ################################################################## ");
          System.out.println(" ********** Number format error on parse for int: ********" + e.getMessage());
          System.out.println(" ################################################################## ");
          System.out.println("\n\n");
          continue;

        }
      }
      System.out.println("=== Grade Analysis Report ===");
      int scoresOffTxtDocProcessed = scoreX.size();
      System.out.printf("%s%n", "Total scores processed: " + scoresOffTxtDocProcessed);
      System.out.printf("%s%n", "Invalid lines skipped: " + badlines);

    } catch (IOException e) {
      System.out.println(" ################################################################## ");
      System.out.println(" #  Code blows on the buffered reader: # " + e.getMessage());
      System.out.println(" ################################################################## ");
    }
    return scoreX;
  }

  public static double calculateAverage(ArrayList<Integer> scores) {

    if (scores.isEmpty()) {
      return 0.0;
    }

    int total = 0;

    for (int score : scores) {
      total = total + score;
    }
    double avg = (double) total / scores.size();
    return avg;
  }

  public static void writeReport(ArrayList<Integer> scores, double avg, int high, int low, int counterA,
      int counterB,
      int counterC,
      int counterD,
      int counterF,
      String outputFile) {

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

      writer.write("Highest score: " + high);
      writer.write("Lowest score: " + low);

      writer.write("Grade Distribution:");
      writer.write("A (90 - 100): " + counterA);
      writer.write("B (80 - 89): " + counterB);
      writer.write("C (70 - 79): " + counterC);
      writer.write("D (60 - 69): " + counterD);
      writer.write("F (below 60): " + counterF);
    } catch (IOException e) {
      System.out.println("Error writing report: " + e.getMessage());
    }

  }
}
