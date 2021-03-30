interface Hero {
    void heroInfo();
}

class Warrior implements Hero{
    @Override
    public void heroInfo() {
        System.out.println("You have chosen a warrior! Lets chop them into pieces!");
    }
}

class Rogue implements Hero{
    @Override
    public void heroInfo() {
        System.out.println("You have chosen a rogue! Shadow is your friend!");
    }
}

class Mage implements Hero{
    @Override
    public void heroInfo() {
        System.out.println("You have chosen a mage! Be careful with magic...");
    }
}

class HeroFactory {
    public Hero createHero(String type) {
        if (type == null || type.isEmpty()) return null;
        switch (type) {
            case "WARRIOR":
                return new Warrior();
            case "ROGUE":
                return new Rogue();
            case "MAGE":
                return new Mage();
        }
        return null;
    }
}

public class HeroApp {
    public static void main(String[] args)
    {
        HeroFactory hf = new HeroFactory();
        Hero hero = hf.createHero("WARRIOR");
        hero.heroInfo();
    }
}