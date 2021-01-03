package com.design_patterns.builder;

public interface IRobotBuilder {
    public void buildRobotHead();
    public void buildRobotTors();
    public void buildRobotArms();
    public void buildRobotLegs();
    public Robot getRobot();

}
