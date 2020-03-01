package domain.sprint;

public class Finished extends Stadia {

    public void nextState() {
        if(context.runPipeline()){
            Released t = new Released();
            context.setState(t);
        }
        else{
            Failed t = new Failed();
            context.setState(t);
        }
    }
    public void finish() {
        Finished t = new Finished();
        context.setState(t);
    }
}
