// TASK CODEWARS
// https://www.codewars.com/kata/57d5e850bfcdc545870000b7/train/java
package pl.jakubmarjankowski.codewars.DeadAnts;

public class Dinglemouse {
    public static int deadAntCount(final String ants){
  if(ants == null) return 0;
    String copyAnts = ants;
    int numberA, numberT, numberN;
    copyAnts = copyAnts.replaceAll("ant", "");
    numberA = copyAnts.length() - copyAnts.replaceAll("a","").length();
    numberT = copyAnts.length() - copyAnts.replaceAll("t","").length();
    numberN = copyAnts.length() - copyAnts.replaceAll("n","").length();
  return Math.max(Math.max(numberA, numberT), numberN);
}
}
