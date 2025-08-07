import java.util.Random;

public class GameAthlete {
    private String name;
    private int energy;
    private int skillPower;
    private int maxEnergy;
    private boolean isActive;
    private static int totalAthletes = 0;
    public GameAthlete() {
        this.name = "Player";
        this.energy = 100;
        this.skillPower = 10;
        this.maxEnergy = 100;
        this.isActive = true;
        totalAthletes++;
    }

    public GameAthlete(String name, int energy, int skillPower, int maxEnergy) {
        this.name = name;
        this.energy = energy;
        this.skillPower = skillPower;
        this.maxEnergy = maxEnergy;
        this.isActive = energy > 0;
        totalAthletes++;
    }

    public void compete(GameAthlete opponent) {
        if (!this.isActive || !opponent.isActive) {
            System.out.println("One of the athletes is inactive. Match not possible.");
            return;
        }
        System.out.println(this.name + " competes with " + opponent.name + "!");
        opponent.energy -= this.skillPower;
        if (opponent.energy <= 0) {
            opponent.energy = 0;
            opponent.isActive = false;
            System.out.println(opponent.name + " is now inactive.");
        }
    }

    public void rest(int amount) {
        if (!isActive) {
            System.out.println(name + " is inactive and cannot rest.");
            return;
        }
        energy += amount;
        if (energy > maxEnergy) {
            energy = maxEnergy;
        }
        System.out.println(name + " rested and gained " + amount + " energy.");
    }

    public void train() {
        if (!isActive) {
            System.out.println(name + " is inactive and cannot train.");
            return;
        }
        Random random = new Random();
        int gain = random.nextInt(11); // 0 to 10
        skillPower += gain;
        System.out.println(name + " trained and gained " + gain + " skill power.");
    }

    public void displayStats() {
        System.out.println("----- Athlete Stats -----");
        System.out.println("Name: " + name);
        System.out.println("Energy: " + energy + "/" + maxEnergy);
        System.out.println("Skill Power: " + skillPower);
        System.out.println("Active: " + isActive);
        System.out.println("-------------------------");
    }

    public static int getTotalAthletes() {
        return totalAthletes;
    }

    public static void main(String[] args) {
        System.out.println("2024503543 Risah Ruth R");
        GameAthlete a1 = new GameAthlete("Alice", 90, 12, 100);
        GameAthlete a2 = new GameAthlete("Bob", 85, 14, 100);
        GameAthlete a3 = new GameAthlete();
        a1.displayStats();
        a2.displayStats();
        a3.displayStats();
        a1.compete(a2);
        a2.compete(a3);
        a3.compete(a1);
        a1.rest(10);
        a2.rest(20);
        a3.rest(5);
        a1.train();
        a2.train();
        a3.train();
        a1.displayStats();
        a2.displayStats();
        a3.displayStats();
        System.out.println("Total Athletes Created: " + GameAthlete.getTotalAthletes());
    }
}
