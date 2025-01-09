package Structure;

public class HandlerA extends BaseHandler{
    @Override
    public void handle(String request) {
        if (request.equals("simple")){
            //...
        }else{
            super.handle(request);
        }
    }
}
