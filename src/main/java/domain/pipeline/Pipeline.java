package domain.pipeline;

import domain.reporting.BuildResult;

import java.util.List;

public class Pipeline {
    private SourceStrategy source;
    private AnalyseStrategy analyse;
    private PackageStrategy packages;
    private BuildStrategy build;
    private TestStrategy test;
    private DeployStrategy deploy;
    private UtilityStrategy utillity;

    private List<BuildResult> builds;

    public void setPipelineSettings(SourceStrategy s,AnalyseStrategy a,PackageStrategy p,BuildStrategy b,TestStrategy t,DeployStrategy d,UtilityStrategy u){
        this.analyse=a;
        this.build=b;
        this.deploy=d;
        this.packages=p;
        this.source=s;
        this.test=t;
        this.utillity=u;
    }

    public final BuildResult runPipeline(){
        runsources();
        runAnalyses();
        runPackages();
        runBuild();
        runTest();
        deploy();
        runUtils();
        return new BuildResult();
    }
    public void runsources(){}
    public void runAnalyses(){}
    public void runPackages(){}
    public void runBuild(){}
    public void runTest(){}
    public void deploy(){}
    public void runUtils(){}
}
