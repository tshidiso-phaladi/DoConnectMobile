package com.example.tumudip.doconnect;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TimePicker;
import android.widget.Button;

public class AppointmentsActivity  extends AppCompatActivity {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.appointments);

        CalendarView date = (CalendarView)findViewById(R.id.cvDate);
        TimePicker time = (TimePicker)findViewById(R.id.tpTime);
        Button btnApp = (Button)findViewById(R.id.btn_bookAppointment);

        btnApp.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                Snackbar.make(view, "Appointment Successfully Booked", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
            });
    }
}
