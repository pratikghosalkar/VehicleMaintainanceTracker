package binary.com.vmt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VehicleRegistrationActivity extends AppCompatActivity {

    @BindView(R.id.buttonAddDriver) Button btAddDriver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_registration);
        ButterKnife.bind(this);

        btAddDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VehicleRegistrationActivity.this, DriverDetailsActivity.class));
            }
        });
    }


}
