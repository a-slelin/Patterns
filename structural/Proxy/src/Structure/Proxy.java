package Structure;

public class Proxy implements Service {
    private RealService realService;

    Proxy(RealService realService){
        this.realService = realService;
    }

    private boolean Access(){
        //...
        return false;
    }

    @Override
    public void operation() {
        if(Access()){
            realService.operation();
        } else {
            System.out.println("I do not have any access to Service. First, get it.");
        }
    }
}
