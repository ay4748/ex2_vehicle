public class ElectricCar extends Car{
    @Override
    public void accelerate()
    {
        System.out.println("very fast accelerate to 100km");
    }

    @Override
    public void start(){
        System.out.println("staring electric engine");
    }

    @Override
    public void stop()
    {
        System.out.println("stopping electric engine");
    }
}
