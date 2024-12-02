public class Wheel implements WheelInterface{
    boolean rotating = false;
    boolean flying = false;
    @Override
    public void rotate() {
        rotating = true;
    }

    @Override
    public void flying() {
        flying = true;

    }

}
