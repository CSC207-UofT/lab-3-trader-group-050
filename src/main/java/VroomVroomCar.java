/* Class created which will be in the vehicle category
 */
public class VroomVroomCar implements Tradable, Drivable {
    private int maxSpeed;

    // constructor
    public VroomVroomCar(){
        this.maxSpeed = 10;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
