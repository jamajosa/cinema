package domain.sprint;

import java.time.LocalDateTime;

public class Active extends Stadia {

    public void nextState() {
        if(LocalDateTime.now() == context.getStop()) {
            Finished t = new Finished();
            context.setState(t);
        }
        else{
            System.out.println("sprint is not finished");
        }
    };
}
