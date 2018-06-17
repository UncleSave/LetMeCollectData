package unclesave.example.com.letmecollectdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // onCreate is executed when the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the file activity_main.xml as the user interface
        setContentView(R.layout.activity_main);

        TextView firstTextView = (TextView) findViewById(R.id.textView);
    }
}
