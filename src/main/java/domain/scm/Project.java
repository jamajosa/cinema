package domain.scm;

import java.util.List;

import domain.pipeline.Pipeline;
import domain.user.User;

public class Project {

    private String title;
    private String description;
    private Board board;
    private List<Pipeline> pipelines;
    private List<User> team;

    // Pipeline.
    public void addPipeline(Pipeline newPipeline){
        this.pipelines.add(newPipeline);
    }
    public void removePipeline(Pipeline newPipeline){
        this.pipelines.remove(newPipeline);
    }

    // Team
    public void addTeamMember(User newUser){
        this.team.add(newUser);
    }
    public void removeTeamMember(User newUser){
        this.team.remove(newUser);
    }
}
