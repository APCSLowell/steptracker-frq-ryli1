import java.util.ArrayList;
public class StepTracker
{
 private int activeDays, numDays, totalSteps, minSteps;
 public StepTracker(int minSteps) {
  this.minSteps = minSteps;
  activeDays = 0;
  numDays = 0;
  totalSteps = 0;
 }
 public void addDailySteps(int steps) {
  totalSteps += steps;
  numDays++;
  if(steps >= minSteps) {
   activeDays++;
  }
 }
 public int activeDays() {
  return activeDays;
 }
 public double averageSteps() {
  if(totalSteps == 0) { 
   return 0;
  }
  return (double)totalSteps/numDays;
 }
} 
