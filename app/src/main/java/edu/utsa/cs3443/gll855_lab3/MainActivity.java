package edu.utsa.cs3443.gll855_lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.gll855_lab3.model.IncidentTracker;

/**
 * This class is the controller class where it manages the flow
 * of the data and responds to the events triggered by the view objects.
 *
 */
public class MainActivity extends AppCompatActivity {

    private IncidentTracker incidents;

    /**
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *     previously being shut down then this Bundle contains the data it most
     *     recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createIncidents();

        Button button_data = findViewById(R.id.button);
        Button button_malware = findViewById(R.id.button2);
        Button button_ddos = findViewById(R.id.button3);
        Button button_phishing = findViewById(R.id.button5);

        button_data.setOnClickListener(new View.OnClickListener() {
            /**
             * This button gives a toast message when clicked for an
             * incident about a data breach
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), displayIncident(0), Toast.LENGTH_LONG).show();
            }
        });

        button_malware.setOnClickListener(new View.OnClickListener() {
            /**
             * This button gives a toast message when clicked for an
             * incident about malware
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), displayIncident(2), Toast.LENGTH_LONG).show();

            }
        });

        button_ddos.setOnClickListener(new View.OnClickListener() {
            /**
             * This button gives a toast message when clicked for an
             * incident about a DDos attack
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), displayIncident(1), Toast.LENGTH_LONG).show();
            }
        });

        button_phishing.setOnClickListener(new View.OnClickListener() {
            /**
             * This button gives a toast message when clicked for an
             * incident about ransomware
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), displayIncident(3), Toast.LENGTH_LONG).show();
            }
        });

    }

    /**
     * This method creates a new ArrayList of incidents and loads them
     * into the ArrayList from an input file
     */
    private void createIncidents(){
        incidents  = new IncidentTracker();
        incidents.loadIncidents(this);
    }

    /**
     * This methods gets the current incident from the arrayList and returns
     * its toString representation
     *
     * @return returns a string representation of the the current incident
     */
    private String displayIncident(int incidentIdx){
        return incidents.getIncident(incidentIdx).toString();
    }


}