package org.example.model;

public class Driver {

    private int id;
    private String name;
    private String team;
    private Status status;
    private int skillLevel;

    public int getId() { return id; }
    public String getName() { return name; }
    public String getTeam() { return team; }
    public Status getStatus() { return status; }
    public int getSkillLevel() { return skillLevel; }

    @Override
    public String toString() {
        return "[" + id + "] " + name + " (" + team + ") - " + status + ", skill=" + skillLevel;
    }
}