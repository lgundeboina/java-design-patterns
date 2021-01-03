package com.design_patterns.builder;

public class OldStyleRobotBuilder implements IRobotBuilder{
    private Robot robot;
    public OldStyleRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setHead("Tin Head");
    }

    @Override
    public void buildRobotTors() {
        robot.setTors("Tim Tors");
    }

    @Override
    public void buildRobotArms() {
        robot.setArms("Tin Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setLegs("Skate legs");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
