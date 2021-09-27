public class Camel implements Drivable, Domesticatable, Tradable{

    private int maxSpeed;

    public Camel() {
        this.maxSpeed = 5;
    }

    /**
     * Return the sound made by this creature.
     *
     * @return The sound made by this creature.
     **/
    @Override
    public String sound() {
        return "Grunt!";
    }

    /**
     * Increase the maximum speed of this Animal.
     **/
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 5;
    }

    /**
     * Decrease the maximum speed of this Animal.
     **/
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 5;
    }

    /**
     * Return the maximum speed of this Animal.
     *
     * @return The current maximum speed of this Vehicle.
     **/
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Return the price of the Animal.
     *
     * @return The price of this Animal.
     **/
    @Override
    public int getPrice() {
        return 200;
    }
}
