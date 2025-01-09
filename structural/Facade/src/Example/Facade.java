package Example;

public class Facade {
    private LibraryA libA = new LibraryA();
    private LibraryB libB = new LibraryB();
    private LibraryC libC = new LibraryC();

    public void Do() {
        libA.doSomethingA();
        libB.doSomethingB();
        libC.doSomethingC();
    }
}
