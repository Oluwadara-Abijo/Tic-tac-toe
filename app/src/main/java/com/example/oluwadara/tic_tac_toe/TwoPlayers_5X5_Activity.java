package com.example.oluwadara.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TwoPlayers_5X5_Activity extends AppCompatActivity {

    ///Instantiate the nine buttons
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14,
    b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, reset_button;

    //Instantiate current player
    int currentPlayer;

    public boolean endGame = false;

    public boolean enableAllButtons;

    public int playerOneScore = 0;
    public int playerTwoScore = 0;

    TextView score1, score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_players_5x5);

        //Instantiate board type spinner
        Spinner spinner = findViewById(R.id.board_type_spinner);
        // Spinner click listener
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 1) {
                    Intent threeByThree = new Intent(TwoPlayers_5X5_Activity.this, TwoPlayers_3X3_Activity.class);
                    finish();
                    startActivity(threeByThree);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.board_type_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        //Declare all buttons
        b1 = findViewById(R.id.button_one);
        b2 = findViewById(R.id.button_two);
        b3 = findViewById(R.id.button_three);
        b4 = findViewById(R.id.button_four);
        b5 = findViewById(R.id.button_five);
        b6 = findViewById(R.id.button_six);
        b7 = findViewById(R.id.button_seven);
        b8 = findViewById(R.id.button_eight);
        b9 = findViewById(R.id.button_nine);
        b10 = findViewById(R.id.button_ten);
        b11 = findViewById(R.id.button_eleven);
        b12 = findViewById(R.id.button_twelve);
        b13 = findViewById(R.id.button_thirteen);
        b14 = findViewById(R.id.button_fourteen);
        b15 = findViewById(R.id.button_fifteen);
        b16 = findViewById(R.id.button_sixteen);
        b17 = findViewById(R.id.button_seventeen);
        b18 = findViewById(R.id.button_eighteen);
        b19 = findViewById(R.id.button_nineteen);
        b20 = findViewById(R.id.button_twenty);
        b21 = findViewById(R.id.button_twenty_one);
        b22 = findViewById(R.id.button_twenty_two);
        b23 = findViewById(R.id.button_twenty_three);
        b24 = findViewById(R.id.button_twenty_four);
        b25 = findViewById(R.id.button_twenty_five);

        reset_button = findViewById(R.id.reset_button);

        score1 = findViewById(R.id.player_one_score);
        score2 = findViewById(R.id.player_two_score);

        currentPlayer = 1;

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) view;
                if (btn.getText().toString().equals("")) {
                    //If cell has not been clicked, check for current player and
                    //place "X" for player 1 or "O" for player 2
                    if (currentPlayer == 1) {
                        btn.setText("X");
                        currentPlayer = 2;
                    } else if (currentPlayer == 2) {
                        btn.setText("O");
                        currentPlayer = 1;
                    }
                }
                gameOver();
            }
        };

        b1.setOnClickListener(onClickListener);
        b2.setOnClickListener(onClickListener);
        b3.setOnClickListener(onClickListener);
        b4.setOnClickListener(onClickListener);
        b5.setOnClickListener(onClickListener);
        b6.setOnClickListener(onClickListener);
        b7.setOnClickListener(onClickListener);
        b8.setOnClickListener(onClickListener);
        b9.setOnClickListener(onClickListener);
        b10.setOnClickListener(onClickListener);
        b11.setOnClickListener(onClickListener);
        b12.setOnClickListener(onClickListener);
        b13.setOnClickListener(onClickListener);
        b14.setOnClickListener(onClickListener);
        b15.setOnClickListener(onClickListener);
        b16.setOnClickListener(onClickListener);
        b17.setOnClickListener(onClickListener);
        b18.setOnClickListener(onClickListener);
        b19.setOnClickListener(onClickListener);
        b20.setOnClickListener(onClickListener);
        b21.setOnClickListener(onClickListener);
        b22.setOnClickListener(onClickListener);
        b23.setOnClickListener(onClickListener);
        b24.setOnClickListener(onClickListener);
        b25.setOnClickListener(onClickListener);

        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                enableAllButtons = true;

                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                b10.setText("");
                b11.setText("");
                b12.setText("");
                b13.setText("");
                b14.setText("");
                b15.setText("");
                b16.setText("");
                b17.setText("");
                b18.setText("");
                b19.setText("");
                b20.setText("");
                b21.setText("");
                b22.setText("");
                b23.setText("");
                b24.setText("");
                b25.setText("");

                currentPlayer = 1;

                if (endGame) {
                    endGame = false;

                    if (enableAllButtons) {
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                        b10.setEnabled(true);
                        b11.setEnabled(true);
                        b12.setEnabled(true);
                        b13.setEnabled(true);
                        b14.setEnabled(true);
                        b15.setEnabled(true);
                        b16.setEnabled(true);
                        b17.setEnabled(true);
                        b18.setEnabled(true);
                        b19.setEnabled(true);
                        b20.setEnabled(true);
                        b21.setEnabled(true);
                        b22.setEnabled(true);
                        b23.setEnabled(true);
                        b24.setEnabled(true);
                        b25.setEnabled(true);
                    }

                    enableAllButtons = true;
                }
            }
        });

    }

    public void gameOver() {
        //Instantiate the string in each cell
        String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14,
                s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25;

        s1 = b1.getText().toString();
        s2 = b2.getText().toString();
        s3 = b3.getText().toString();
        s4 = b4.getText().toString();
        s5 = b5.getText().toString();
        s6 = b6.getText().toString();
        s7 = b7.getText().toString();
        s8 = b8.getText().toString();
        s9 = b9.getText().toString();
        s10 = b10.getText().toString();
        s11 = b11.getText().toString();
        s12 = b12.getText().toString();
        s13 = b13.getText().toString();
        s14 = b14.getText().toString();
        s15 = b15.getText().toString();
        s16 = b16.getText().toString();
        s17 = b17.getText().toString();
        s18 = b18.getText().toString();
        s19 = b19.getText().toString();
        s20 = b20.getText().toString();
        s21 = b21.getText().toString();
        s22 = b22.getText().toString();
        s23 = b23.getText().toString();
        s24 = b24.getText().toString();
        s25 = b25.getText().toString();

        //Determine if Player 1 wins
        if (s1.equals("X") && s1.equals(s2) && s1.equals(s3) && s1.equals(s4)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s1.equals("X") && s1.equals(s6) && s1.equals(s11) && s1.equals(s16)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s1.equals("X") && s1.equals(s7) && s1.equals(s13) && s1.equals(s19) ) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s2.equals("X") && s2.equals(s3) && s2.equals(s4) && s2.equals(s5)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s2.equals("X") && s2.equals(s7) && s2.equals(s12) && s2.equals(s17)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s2.equals("X") && s2.equals(s8)  && s2.equals(s14) && s2.equals(s20)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s3.equals("X") && s3.equals(s8) && s3.equals(s13) && s3.equals(s18)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s4.equals("X") && s4.equals(s8) && s4.equals(s12) && s4.equals(s16)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s4.equals("X") && s4.equals(s9) && s4.equals(s14) && s4.equals(s19)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s5.equals("X") && s5.equals(s10) && s5.equals(s15) && s5.equals(s20)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s5.equals("X") && s5.equals(s9) && s5.equals(s13) && s5.equals(s17) ) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s6.equals("X") && s6.equals(s7) && s6.equals(s8) && s6.equals(s9)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s6.equals("X") && s6.equals(s11) && s6.equals(s16) && s6.equals(s21)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s6.equals("X") && s6.equals(s12) && s6.equals(s18) && s6.equals(s24)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s7.equals("X") && s7.equals(s8) && s7.equals(s9) && s7.equals(s10)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s7.equals("X") && s7.equals(s12) && s7.equals(s17) && s7.equals(s22)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s7.equals("X") && s7.equals(s13) && s7.equals(s19) && s7.equals(s25)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s8.equals("X") && s8.equals(s13) && s8.equals(s18) && s8.equals(s22)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s9.equals("X") && s9.equals(s13) && s9.equals(s17) && s9.equals(s21)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s9.equals("X") && s9.equals(s14) && s9.equals(s19) && s9.equals(s24)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s10.equals("X") && s10.equals(s15) && s10.equals(s20) && s10.equals(s25)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s10.equals("X") && s10.equals(s14) && s10.equals(s18) && s10.equals(s22)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s11.equals("X") && s11.equals(s12) && s11.equals(s13) && s11.equals(s14)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s12.equals("X") && s12.equals(s13) && s12.equals(s14) && s12.equals(s15)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s16.equals("X") && s16.equals(s17) && s16.equals(s18) && s16.equals(s19)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s17.equals("X") && s17.equals(s18) && s17.equals(s19) && s17.equals(s20)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s21.equals("X") && s21.equals(s22) && s21.equals(s23) && s21.equals(s24)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        if (s22.equals("X") && s22.equals(s23) && s22.equals(s24) && s22.equals(s25)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        //Determine if Player 2 wins
        if (s1.equals("O") && s1.equals(s2) && s1.equals(s3) && s1.equals(s4)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s1.equals("O") && s1.equals(s6) && s1.equals(s11) && s1.equals(s16)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s1.equals("O") && s1.equals(s7) && s1.equals(s13) && s1.equals(s19) ) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s2.equals("O") && s2.equals(s3) && s2.equals(s4) && s2.equals(s5)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s2.equals("O") && s2.equals(s7) && s2.equals(s12) && s2.equals(s17)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s2.equals("O") && s2.equals(s8)  && s2.equals(s14) && s2.equals(s20)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s3.equals("O") && s3.equals(s8) && s3.equals(s13) && s3.equals(s18)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s4.equals("O") && s4.equals(s8) && s4.equals(s12) && s4.equals(s16)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s4.equals("O") && s4.equals(s9) && s4.equals(s14) && s4.equals(s19)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s5.equals("O") && s5.equals(s10) && s5.equals(s15) && s5.equals(s20)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s5.equals("O") && s5.equals(s9) && s5.equals(s13) && s5.equals(s17) ) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s6.equals("O") && s6.equals(s7) && s6.equals(s8) && s6.equals(s9)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s6.equals("O") && s6.equals(s11) && s6.equals(s16) && s6.equals(s21)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s6.equals("O") && s6.equals(s12) && s6.equals(s18) && s6.equals(s24)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s7.equals("O") && s7.equals(s8) && s7.equals(s9) && s7.equals(s10)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s7.equals("O") && s7.equals(s12) && s7.equals(s17) && s7.equals(s22)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s7.equals("O") && s7.equals(s13) && s7.equals(s19) && s7.equals(s25)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s8.equals("O") && s8.equals(s13) && s8.equals(s18) && s8.equals(s22)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s9.equals("O") && s9.equals(s13) && s9.equals(s17) && s9.equals(s21)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s9.equals("O") && s9.equals(s14) && s9.equals(s19) && s9.equals(s24)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s10.equals("O") && s10.equals(s15) && s10.equals(s20) && s10.equals(s25)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s10.equals("O") && s10.equals(s14) && s10.equals(s18) && s10.equals(s22)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s11.equals("O") && s11.equals(s12) && s11.equals(s13) && s11.equals(s14)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s12.equals("O") && s12.equals(s13) && s12.equals(s14) && s12.equals(s15)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s16.equals("O") && s16.equals(s17) && s16.equals(s18) && s16.equals(s19)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s17.equals("O") && s17.equals(s18) && s17.equals(s19) && s17.equals(s20)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s21.equals("O") && s21.equals(s22) && s21.equals(s23) && s21.equals(s24)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        if (s22.equals("O") && s22.equals(s23) && s22.equals(s24) && s22.equals(s25)) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        //Declare a draw if there is no winner
        if (!s1.equals("") && !s2.equals("") && !s3.equals("") && !s4.equals("") && !s5.equals("") && !s6.equals("")
                && !s7.equals("") && !s8.equals("") && !s9.equals("") && !s10.equals("") && !s11.equals("") &&
                !s12.equals("") && !s13.equals("") && !s14.equals("") && !s15.equals("") && !s16.equals("") &&
                !s17.equals("") && !s18.equals("") && !s19.equals("") && !s20.equals("") && !s21.equals("") &&
                !s22.equals("") &&!s23.equals("") && !s24.equals("") && !s25.equals("") && !endGame) {
            Toast.makeText(TwoPlayers_5X5_Activity.this, "Game Over! No winner.", Toast.LENGTH_LONG).show();
            endGame = true;
        }

        if (endGame) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);
        }

    }

}
