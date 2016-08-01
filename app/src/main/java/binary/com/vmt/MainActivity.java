package binary.com.vmt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.buttonVM)
    Button btVM;
    @BindView(R.id.buttonCheckUp)
    Button btCheckup;
    @BindView(R.id.buttonCheckUpBefore)
    Button btCheckUpBefore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Button vehReg = (Button) findViewById(R.id.button);
        vehReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VehicleRegistrationActivity.class));
            }
        });

        btCheckup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CheckUpActivity.class));
            }
        });

        btCheckUpBefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CheckUpBeforeSchedule.class));
            }
        });

        btVM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VehicleMaintenanceActivity.class));
            }
        });
    }
}
