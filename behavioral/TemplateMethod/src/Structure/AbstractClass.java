package Structure;

abstract public class AbstractClass {
    final void templateMethod(){
        method1();
        method2();
        method3();
        method4();
    }

    public abstract void method1();
    public abstract void method2();
    public final void method3(){
        //...
    }
    public abstract void method4();
}
