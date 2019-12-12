package com.example.diarydoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class PatientHome extends AppCompatActivity {

    private GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home);

        mainGrid = findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child items of main grid
        for(int i=0;i<mainGrid.getChildCount();i++){
            CardView cardView=(CardView) mainGrid.getChildAt(i);
            final int finalI=i;
            //Set onClick Listeners to all card views..
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (finalI){ //Switch between activities...
                        case 0:
                            Intent a=new Intent(PatientHome.this,AttActivity.class);
                            startActivity(a);
                            break;
                        case 1:
                            Intent b=new Intent(PatientHome.this,SubActivity.class);
                            startActivity(b);
                            break;
                        case 2:
                            Intent c=new Intent(PatientHome.this,ExtActivity.class);
                            startActivity(c);
                            break;
                        case 3:
                            Intent d=new Intent(PatientHome.this,ttActivity.class);
                            startActivity(d);
                            break;
                        case 4:
                            Intent e=new Intent(PatientHome.this,offActivity.class);
                            startActivity(e);
                            break;
                        case 5:
                            Intent f=new Intent(PatientHome.this,vitActivity.class);
                            startActivity(f);
                            break;


                    }
                }
            });

        }
    }
}
