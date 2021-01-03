package com.design_patterns.builder;

public class RobotEngineer {
    private IRobotBuilder robotBuilder;

    public RobotEngineer(IRobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }
    public void makeRobot(){
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTors();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }
}
