import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.userfriendlycalculator.MainActivity;
import com.example.userfriendlycalculator.R;

public class launch_Screen extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button simpleBtn = (Button) findViewById(R.id.simpleBtn);
        Button complexBtn = (Button) findViewById(R.id.complexBtn);

        simpleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //simple button functionality
                startActivity(new Intent( launch_Screen.this, MainActivity.class));

            }
        });
        complexBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //complex button functionality
                startActivity(new Intent (launch_Screen.this, MainActivity.class ));

            }


        });

    }


}
