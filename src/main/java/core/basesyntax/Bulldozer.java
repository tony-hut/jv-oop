package core.basesyntax;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        String simpleName = this.getClass().getSimpleName();
        System.out.println(simpleName + " start working");
    }

    @Override
    public void stopWork() {
        String simpleName = this.getClass().getSimpleName();
        System.out.println(simpleName + " stop working");
    }
}
