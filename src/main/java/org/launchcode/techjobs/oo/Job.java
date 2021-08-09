package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Job job = (Job) object;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String reply = new String();

//maybe try getDeclaredFields() ??
//        String replyId = new String('\n' + "ID: " + this.id);
//        String replyName = new String('\n' + "Name: " + this.name);
//        String replyEmployer = new String('\n' + "Employer: " + this.employer);
//        String replyLocation = new String('\n' + "Location: " + this.location);
//        String replyPositionType = new String('\n' + "Position Type: " + this.positionType);
//        String replyCoreCompetency = new String('\n' + "Core Competency: " + this.coreCompetency +'\n');
//
////        these if statements are never triggering for some reason
//        if (this.getName() == "") {
//            replyName = '\n' + "Name: " + "Data not available";
//        }
//        if (this.getEmployer() == null) {
//            replyEmployer = '\n' + "Employer: " + "Data not available";
//        }
//        if (this.getLocation() == null) {
//            replyLocation = '\n' + "Location: " + "Data not available";
//        }
//        if (this.getPositionType() == null) {
//            replyPositionType = '\n' + "Position Type: " + "Data not available";
//        }
//        if (this.getCoreCompetency() == null) {
//            replyCoreCompetency = '\n' + "Core Competency: " + "Data not available" +'\n';
//        }
//
//
//
//        reply = replyId + replyName + replyEmployer + replyLocation + replyPositionType + replyCoreCompetency;


//        technically a company, city, etc., could have the characters null as part of their name, so this option isn't as versatile as it could be
        reply = '\n' + "ID: " + this.id + '\n' + "Name: " + this.name + '\n' + "Employer: " + this.employer + '\n' + "Location: " + this.location + '\n' + "Position Type: " + this.positionType + '\n' + "Core Competency: " + this.coreCompetency +'\n';
        if (reply.contains("null")) {
            String replyReplace = reply.replace("null", "Data not available");
            return replyReplace;
        } else {
            return reply;
        }
//        return reply;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


}
