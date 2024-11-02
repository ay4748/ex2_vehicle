public class Car extends Vehicle{
    @Override
    public void accelerate()
    {
        System.out.println("accelerate to 100km in 10 seconds");
    }

    @Override
    public void start(){
        System.out.println("staring big engine");
    }

    @Override
    public void stop()
    {
        System.out.println("stopping big engine");
    }
}
