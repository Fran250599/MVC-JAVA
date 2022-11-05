package model;

public class Actor {

    public Actor() {
    }

    public Actor(String name, String id, int rewardsCant) {
        this.name = name;
        this.id = id;
        this.rewardsCant = rewardsCant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRewardsCant() {
        return rewardsCant;
    }

    public void setRewardsCant(int rewardsCant) {
        this.rewardsCant = rewardsCant;
    }

    private String name;
    private String id;
    private int rewardsCant;
}
