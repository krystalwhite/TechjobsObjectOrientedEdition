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
        String replyId = new String('\n' + "ID: " + this.id);
        String replyName = new String('\n' + "Name: " + this.name);
        String replyEmployer = new String('\n' + "Employer: " + this.employer);
        String replyLocation = new String('\n' + "Location: " + this.location);
        String replyPositionType = new String('\n' + "Position Type: " + this.positionType);
        String replyCoreCompetency = new String('\n' + "Core Competency: " + this.coreCompetency +'\n');

        if (this.employer.toString() == "") {
            replyEmployer = '\n' + "Employer: Data not available";
        }
        if (this.location.toString() == "") {
            replyLocation = '\n' + "Location: Data not available";
        }
        if (this.positionType.toString() == "") {
            replyPositionType = '\n' + "Position Type: Data not available";
        }
        if (this.coreCompetency.toString() == "") {
            replyCoreCompetency = '\n' + "Core Competency: Data not available" +'\n';
        }

        reply = replyId + replyName + replyEmployer + replyLocation + replyPositionType + replyCoreCompetency;
        return reply;
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
