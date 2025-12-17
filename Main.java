public class Main {
    public static void main(String[] args){
        User user1= new User(1, "Alihan", 20, 75);
        User user2 = new User(2,"Arailym", 18, 42);
        User user3= new User(3, "Maksat",26, 86);

        WorkoutPlan plan1=new WorkoutPlan("Cardio", 30, "Medium");
        WorkoutPlan plan2= new WorkoutPlan("Full Body", 45, "Hard");
        WorkoutPlan plan3= new WorkoutPlan("Yoga", 25, "easy");

        FitnessApp app1= new FitnessApp("MyFitnessTracker", user1, plan1);
        FitnessApp app2= new FitnessApp("MyFitnessTracker", user2, plan2);
        FitnessApp app3=new FitnessApp("MyFitnessTracker", user3, plan3);

        app1.showDetails();
        System.out.println("-----------------------------------------");
        app2.showDetails();
        System.out.println("------------------------------------------");
        app3.showDetails();

        User heaviest = user1;
        if (user2.getWeight() > heaviest.getWeight()) {
            heaviest = user2;
        }
        if (user3.getWeight() > heaviest.getWeight()) {
            heaviest = user3;
        }
        System.out.println(heaviest.getName() + " is heavier than others");


    }
}
