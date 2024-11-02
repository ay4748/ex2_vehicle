public class Motorcycle extends Vehicle{
    @Override
    public void accelerate()
    {
        System.out.println("accelerate to 100km in 6 seconds");
    }

    @Override
    public void start(){
        System.out.println("staring small engine");
    }

    @Override
    public void stop()
    {
        System.out.println("stopping small engine");
    }
}
