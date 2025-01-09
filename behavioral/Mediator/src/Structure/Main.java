package Structure;

public class Main {
    public static void main(String[] args) throws Exception{
        ConcreteMediator med = new ConcreteMediator();

        ComponentA myA = new ComponentA(med);
        ComponentB myB = new ComponentB(med);
        ComponentC myC = new ComponentC(med);
        ComponentD myD = new ComponentD(med);

        myA.operationA();
        med.notify(myA);

        myB.operationB();
        myC.operationC();
        med.notify(myB);

        myD.operationD();
    }
}
