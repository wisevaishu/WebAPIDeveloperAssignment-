package WebAPIDeveloperAssignment.example.WebAPIDeveloperAssignment.model;

import java.util.HashMap;
import java.util.Map;

public class Reward {
    private Map<String, Integer> monthlyPoints;
    private int totalPoints;

    public Reward() {
        this.monthlyPoints =new HashMap<>();
        this.totalPoints = 0;
    }

    public Map<String, Integer> getMonthlyPoints() {
        return monthlyPoints;
    }

    public void setMonthlyPoints(Map<String, Integer> monthlyPoints) {
        this.monthlyPoints = monthlyPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void addPoints(String month, int points) {
        this.monthlyPoints.put(month, this.monthlyPoints.getOrDefault(month, 0)+points);
        this.totalPoints += points;
    }

    @Override
    public String toString() {
        return "RewardSummary { " +
                "monthlypoints = " + monthlyPoints +
                "totalpoints = " + totalPoints +
                " } " ;
    }

}
