package binary.com.vmt;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.facebook.shimmer.ShimmerFrameLayout;


public class SplashScreenActivity extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 1500;
    private static int SPLASH_TIME_MINUS = 3000;
    ShimmerFrameLayout container;
    ImageView ivHidden;
    int time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ivHidden = (ImageView) findViewById(R.id.imageViewHidden);
        container =
                (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container);
        container.startShimmerAnimation();


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                container.stopShimmerAnimation();
                container.setVisibility(View.GONE);
                ivHidden.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {

                        Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                        startActivity(i);

                        finish();
                    }
                }, SPLASH_TIME_OUT);

            }
        }, SPLASH_TIME_OUT);


    }


}
