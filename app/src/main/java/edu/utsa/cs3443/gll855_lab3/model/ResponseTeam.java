package edu.utsa.cs3443.gll855_lab3.model;

/**
 * This class is a model for a Response Team object
 */
public class ResponseTeam {

    private String teamID;
    private String teamName;
    private String teamLeader;
    private String contactInfo;

    /**
     * This is the constructor for a response team object
     *
     * @param teamName name of the response team
     */
    public ResponseTeam(String teamName){
        this.teamName = teamName;
        this.teamID = null;
        this.teamLeader = null;
        this.contactInfo = null;
    }

    /**
     * Sets the response team ID
     *
     * @param teamID response team ID
     */
    public void setTeamID(String teamID){
        this.teamID = teamID;
    }

    /**
     * Gets the reponse team ID
     *
     * @return returns the team ID
     */
    public String getTeamID(){
        return this.teamID;
    }

    /**
     * Sets the response team name
     *
     * @param teamName the response team name
     */
    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    /**
     * Gets the team name
     *
     * @return returns the team name
     */
    public String getTeamName(){
        return this.teamName;
    }

    /**
     * Sets the team leader of the response team
     *
     * @param teamLeader team leader of the response team
     */
    public void setTeamLeader(String teamLeader){
        this.teamLeader = teamLeader;
    }

    /**
     * Gets the team leader of the response team
     *
     * @return returns the team leader
     */
    public String getTeamLeader(){
        return this.teamLeader;
    }

    /**
     * Sets the contact info of the response team
     *
     * @param contactInfo response team contact info
     */
    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }

    /**
     * Gets the contact info of the response ream
     *
     * @return returns the contact info of the response team
     */
    public String getContactInfo(){
        return this.contactInfo;
    }

}
