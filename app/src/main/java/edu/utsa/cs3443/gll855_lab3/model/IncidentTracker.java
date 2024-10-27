package edu.utsa.cs3443.gll855_lab3.model;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import edu.utsa.cs3443.gll855_lab3.MainActivity;

/**
 * This class is a model for the collection of incidents and managing
 * the data from an input file of incidents
 */
public class IncidentTracker {

    ArrayList<Incident> incidents;
    private Incident currentIncident;
    private int incidentIdx;

    /**
     * This is the class constructor for an incidentTracker object,
     * which initializes a new ArrayList of incident objects
     */
    public IncidentTracker(){
        incidents = new ArrayList<Incident>();
    }

    public void printIncidents(ArrayList<Incident> incidents){

        for(int i = 0; i < incidents.size(); i++){

            System.out.println(i + " " + incidents.get(i).toString());
        }
    }

    /**
     * This method uses file I/O to read a csv file of
     * incidents and store each incident in the ArrayList
     * of incident objects
     *
     * @param activity the main activity class
     */
    public void loadIncidents(MainActivity activity){
        //reads the data from the incidents.csv file
        AssetManager manager = activity.getAssets();
        Scanner scan = null;
        String filename = "incidents.csv";
        try {
            InputStream file = manager.open(filename);
            scan = new Scanner(file);
            scan.nextLine();
            while (scan.hasNextLine()) {

                String line = scan.nextLine();
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                addIncident(new Incident(id, tokens[1], tokens[2], tokens[3], tokens[4], new ResponseTeam(tokens[5])));
            }
        }
        catch(IOException e){

            throw new RuntimeException(e);
        }

        printIncidents(incidents);
    }

    /**
     * Gets an incident at a specific index
     *
     * @param incidentID index of the incident
     * @return returns the incident object
     */
    public Incident getIncident(int incidentID){
        return incidents.get(incidentID);
    }

    /**
     * Sets an incident object
     *
     * @param incident an incident object
     */
    public void setIncident(Incident incident){
        this.currentIncident = incident;
    }

    /**
     * Adds an incident to the ArrayList of incidents
     *
     * @param incident an incident object
     */
    public void addIncident(Incident incident){
        incidents.add(incident);
    }

    /**
     * Sets the index of the incident
     *
     * @param incidentIdx index of an incident
     */
    public void setIncidentIdx(int incidentIdx){
        this.incidentIdx = incidentIdx;
    }

    /**
     * Gets the index of the incident
     *
     * @return returns the index of the incident
     */
    public int getIncidentIdx(){
        return this.incidentIdx;
    }


}
