package Structure;

public class Adapter implements ClientInterace{
    private Service service = new Service();

    @Override
    public void method(MyClass data) {
        String specialData = data.toString();
        service.serviceMethod(specialData);
    }
}
