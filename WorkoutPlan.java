public class WorkoutPlan {
    private String planName;
    private int duration;
    private String difficulty;

    public WorkoutPlan(String planName, int duration, String difficulty){
        this.planName=planName;
        this.duration=duration;
        this.difficulty=difficulty;
    }
    public String getPlanName(){
        return planName;
    }
    public void setPlanName(String planName) {
        this.planName = planName;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public void displayPlan(){
        System.out.println("Workout: " + planName + ", Duration: " + duration + "min,Difficulty: " + difficulty);
    }
}
