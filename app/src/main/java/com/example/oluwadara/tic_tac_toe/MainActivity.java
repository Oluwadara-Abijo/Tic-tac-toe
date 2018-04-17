package com.example.oluwadara.tic_tac_toe;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    //Instantiate all buttons
    Button singleP, twoP, exit;

    @Override
    @TargetApi(21)
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        // inside your activity (if you did not enable transitions in your theme)
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        // set an enter transition
        getWindow().setEnterTransition(new Explode());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare single player button
        singleP = findViewById(R.id.single_player_button);
        //Set on click listener on single player button
        //to start single player 3 by 3 board activity
        singleP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent singlePlayer = new Intent(MainActivity.this, SinglePlayer_3X3_Activity.class);
                startActivity(singlePlayer);
            }
        });

        //Declare two players button
        twoP = findViewById(R.id.two_players_button);
        //Set on click listener on two players button
        //to start two players 3 by 3 board activity
        twoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twoPlayers = new Intent(MainActivity.this, TwoPlayers_3X3_Activity.class);
                startActivity(twoPlayers);
            }
        });

        //Define what exit button does
        exit = findViewById(R.id.exit_button);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}
