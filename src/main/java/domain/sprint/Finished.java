package domain.sprint;

public class Finished extends Stadia {

    public void nextState() {
        //not yet implemented
    };
    public void finish() {
        Finished t = new Finished();
        context.setState(t);
    };
}
