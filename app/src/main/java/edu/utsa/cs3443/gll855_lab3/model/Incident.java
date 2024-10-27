package edu.utsa.cs3443.gll855_lab3.model;

import androidx.annotation.NonNull;

/**
 * This class is a model for an incident object
 */
public class Incident {

    private int incidentID;
    private String incidentType;
    private String priorityLevel;
    private String time;
    private String status;
    private ResponseTeam responseTeam;

    /**
     * This is the constructor for an incident object
     *
     * @param incidentID the ID of the incident (1, 2, 3, 4, 5)
     * @param incidentType the type of incident (data breach, ddos attack, malware, ransomware)
     * @param priorityLevel the priortiy level (low, medium, high)
     * @param time the time of the incident
     * @param status the status of the incident (under investigation, resolved)
     * @param responseTeam the name of the response team (alpha, beta, gamma)
     */
    public Incident(int incidentID, String incidentType, String priorityLevel, String time, String status, ResponseTeam responseTeam){
        this.incidentID = incidentID;
        this.incidentType = incidentType;
        this.priorityLevel = priorityLevel;
        this.time = time;
        this.status = status;
        this.responseTeam = responseTeam;
    }

    /**
     * To string representation of the incident
     *
     * @return returns the String representation of the incident
     */
    @NonNull
    public String toString(){
        return "Priority: " + getPriorityLevel() + " Status: " + getStatus() + " Team: " + getResponseTeam();
    }

    /**
     * Sets the incident ID
     *
     * @param incidentID Incident ID
     */
    public void setIncidentID(int incidentID){
        this.incidentID = incidentID;
    }

    /**
     * Gets the incident ID
     *
     * @return returns the incident ID
     */
    public int getIncidentID(){
        return this.incidentID;
    }

    /**
     * Sets the incident type
     *
     * @param incidentType incident type
     */
    public void setIncidentType(String incidentType){
        this.incidentType = incidentType;
    }

    /**
     * Gets the incident type
     *
     * @return returns the type of incident
     */
    public String getIncidentType(){
        return this.incidentType;
    }

    /**
     * sets the priority level of the incident
     *
     * @param priorityLevel priortiy level of the incicent
     */
    public void setPriorityLevel(String priorityLevel){
        this.priorityLevel = priorityLevel;
    }

    /**
     * Gets the priority level of the incident
     *
     * @return returns the priority level
     */
    public String getPriorityLevel(){
        return this.priorityLevel;
    }

    /**
     * Sets the time of the incident
     *
     * @param time time of the incident
     */
    public void setTime(String time){
        this.time = time;
    }

    /**
     * Gets the time of the incident
     *
     * @return returns the time
     */
    public String getTime(){
        return this.time;
    }

    /**
     * Sets the status of the incident
     *
     * @param status sets the status
     */
    public void setStatus(String status){
        this.status = status;
    }

    /**
     * Gets the status of the incident
     *
     * @return returns the status
     */
    public String getStatus(){
        return this.status;
    }

    /**
     * Sets the reponse team object
     *
     * @param responseTeam response team object
     */
    public void setResponseTeam(ResponseTeam responseTeam){
        this.responseTeam = responseTeam;
    }

    /**
     * Gets the name of the response team
     *
     * @return returns the name of the response team
     */
    public String getResponseTeam(){
        return this.responseTeam.getTeamName();
    }
}
