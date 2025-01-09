package Structure;

public class ConcreteMediator implements Mediator{
    private ComponentA A;
    private ComponentB B;
    private ComponentC C;
    private ComponentD D;

    @Override
    public void notify(Object sender) throws Exception {
        if(sender == null){
            throw new Exception();
        }
        if(sender instanceof ComponentA){
            reactOnA();
            return;
        }
        if(sender instanceof ComponentB || sender instanceof ComponentC){
            reactOnBC();
            return;
        }
        System.out.println("Nothing do");
    }

    private void reactOnA(){}
    private void reactOnBC(){}
}
