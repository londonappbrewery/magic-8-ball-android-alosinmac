package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton;
        myButton= (Button) findViewById(R.id.askButton);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //log that the button was pressed
                Log.d("Magic 8ball", "Ask button was pressed");
                //create a random number generator
                Random randomNumberGenerator = new Random();
                //set a variable with a random number between 0-4 (for the 5 ball images)
                int number = randomNumberGenerator.nextInt(5);
                //set the image to display to match with the random number generated
                ballDisplay.setImageResource(ballArray[number]);

            }
        });
    }

}
