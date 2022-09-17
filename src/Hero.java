public class Hero {

    private int health;
    private int hit;
    private String superpower;

    public Hero(int health, int hit, String superpower) {
        this.health = health;
        this.hit = hit;
        this.superpower = superpower;
    }

    public Hero(int health, int hit) {
        this.health = health;
        this.hit = hit;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
}

