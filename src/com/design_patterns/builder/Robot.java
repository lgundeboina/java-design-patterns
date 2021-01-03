package com.design_patterns.builder;

public class Robot implements IRobotPlan {
    private String robotHead;
    private String robotTors;
    private String robotArms;
    private String robotLegs;

    @Override
    public void setHead(String head) {
        robotHead = head;
    }

    @Override
    public void setTors(String tors) {
        robotTors = tors;
    }

    @Override
    public void setArms(String arms) {
        robotArms= arms;
    }

    @Override
    public void setLegs(String legs) {
        robotLegs = legs;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotTors() {
        return robotTors;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotLegs() {
        return robotLegs;
    }
}
