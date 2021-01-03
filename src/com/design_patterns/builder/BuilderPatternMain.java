package com.design_patterns.builder;

/**
 * @author LGundeboina
 */
public class BuilderPatternMain {

    public static void main(String[] args){
        /**
         * Building an objects using other objects
         */
        IRobotBuilder oldStyleBuilder = new OldStyleRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleBuilder);
        robotEngineer.makeRobot();
        Robot oldRobot = robotEngineer.getRobot();
        System.out.println("Old Robot Head should be Tin: "+ oldRobot.getRobotHead()); //Tin Head

        IRobotBuilder newStyleBuilder = new NewStyleRobotBuilder();
        robotEngineer = new RobotEngineer(newStyleBuilder);
        robotEngineer.makeRobot();
        Robot newRobot = robotEngineer.getRobot();
        System.out.println("Old Robot Head should be New: "+ newRobot.getRobotHead()); //New Head

    }
}
