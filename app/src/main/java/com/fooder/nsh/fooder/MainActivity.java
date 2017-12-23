package com.fooder.nsh.fooder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
        Weather bangalore = new Weather();
        bangalore.setCity("Banglore");
        bangalore.setTemperature(24);
        bangalore.setHumidity(83);
        bangalore.setPressure(1013);
        rootRef.child("Banglore").setValue(bangalore);

        Weather delhi = new Weather();
        delhi.setCity("Delhi");
        delhi.setTemperature(27);
        delhi.setHumidity(94);
        delhi.setPressure(1003);
        rootRef.child("Delhi").setValue(delhi);


        rootRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                    Weather climate = postSnapshot.getValue(Weather.class);
    /* You could extract the values of object using the getter methods
     * and display it in your GUI.

     *  climate.getCity()
     *  climate.getTemperature()
     *  climate.getHumidity()
     *  c<TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="name 1"
        android:id="@+id/n1"/>
    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="quantity"
        android:id="@+id/q1"/>limate.getPressure()
     **/

/*                    TextView a = findViewById(R.id.one);
                    TextView b = findViewById(R.id.two);
                    TextView c = findViewById(R.id.three);
                    TextView d = findViewById(R.id.next);

                            a.setText(climate.getCity().toString());
                              b.setText(Integer.toString(climate.getTemperature()));
                                c.setText(Integer.toString(climate.getHumidity()));
                                  d.setText(Integer.toString(climate.getPressure()));
                }
            }
            @Override
            public void onCancelled(DatabaseError firebaseError) {
       /*
        * You may print the error message.
               **/
   /*         }
        });
 */

        DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();



    }

}
