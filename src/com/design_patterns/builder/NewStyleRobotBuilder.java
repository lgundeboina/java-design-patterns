package com.design_patterns.builder;

public class NewStyleRobotBuilder implements IRobotBuilder{
    private Robot robot;
    public NewStyleRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        this.robot.setHead("New Head");
    }

    @Override
    public void buildRobotTors() {
        this.robot.setTors("New Tors");
    }

    @Override
    public void buildRobotArms() {
        this.robot.setArms("New Arms");
    }

    @Override
    public void buildRobotLegs() {
        this.robot.setLegs("Walking legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
