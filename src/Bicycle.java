public class Bicycle extends Vehicle
{
    @Override
    public void accelerate()
    {
        System.out.println("accelerate to 100km never");
    }

    @Override
    public void start(){
        System.out.println("start pedaling");
    }

    @Override
    public void stop()
    {
        System.out.println("stop pedaling");
    }
}
