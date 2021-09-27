public class Car implements Drivable, Tradable{
    private int speed;

    public Car() {
        this.speed = 100;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public void upgradeSpeed() {
        this.speed++;
    }

    @Override
    public void downgradeSpeed() {
        this.speed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    @Override
    public int getPrice() {
        return 10000;
    }
}
