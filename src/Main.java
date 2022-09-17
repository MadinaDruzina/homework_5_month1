public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealthBoss(500);
        boss.setHitBoss(50);
        boss.setTypeOfDef("physical");
        System.out.println("Данные о Боссе. Здоровье: " + boss.getHealthBoss() + " Урон: " + boss.getHitBoss() + " Суперспособность: " + boss.getTypeOfDef());


        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Данные о героях. Здоровье: " +createHeroes()[i].getHealth()+ " Урон: " + createHeroes()[i].getHit() +" Суперспособность: "+ createHeroes()[i].getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(250, 25, "Physical");
        Hero hero2 = new Hero(250, 25, "Magical");
        Hero hero3 = new Hero(250, 25);

        Hero[] Boec = {hero1, hero2, hero3};


        return Boec;
    }
}
