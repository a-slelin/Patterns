package Structure;

public class Abstraction {
    private Implementation imp;

    Abstraction(Implementation imp){
        this.imp = imp;
    }

    public String feature1(double value){
        return imp.method3(value, imp.method1());
    }

    public boolean feature2(String str){
        double tmp = imp.method2(str);
        if(tmp > 0){
            return true;
        }
        return false;
    }
}
