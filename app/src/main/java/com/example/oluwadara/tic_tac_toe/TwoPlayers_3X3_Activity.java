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

public class TwoPlayers_3X3_Activity extends AppCompatActivity {

    ///Instantiate the nine buttons
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, reset_button;

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
        setContentView(R.layout.activity_two_players_3x3);

        //Instantiate board type spinner
        Spinner spinner = findViewById(R.id.board_type_spinner);
        // Spinner click listener
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 2) {
                    Intent fiveByFive = new Intent(TwoPlayers_3X3_Activity.this, TwoPlayers_5X5_Activity.class);
                    finish();
                    startActivity(fiveByFive);
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
                    }

                    enableAllButtons = true;
                }
            }
        });

    }


    public void gameOver() {
        //Instantiate the string in each cell
        String s1, s2, s3, s4, s5, s6, s7, s8, s9;

        s1 = b1.getText().toString();
        s2 = b2.getText().toString();
        s3 = b3.getText().toString();
        s4 = b4.getText().toString();
        s5 = b5.getText().toString();
        s6 = b6.getText().toString();
        s7 = b7.getText().toString();
        s8 = b8.getText().toString();
        s9 = b9.getText().toString();

        //Determine if Player 1 wins
        if (s1.equals("X") && s1.equals(s2) && s1.equals(s3)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s1.equals("X") && s1.equals(s4) && s1.equals(s7)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s1.equals("X") && s1.equals(s5) && s1.equals(s9)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s2.equals("X") && s2.equals(s5) && s2.equals(s8)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s3.equals("X") && s3.equals(s5) && s3.equals(s7)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s3.equals("X") && s3.equals(s6) && s3.equals(s9)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s4.equals("X") && s4.equals(s5) && s4.equals(s6)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }
        if (s7.equals("X") && s7.equals(s8) && s7.equals(s9)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
            playerOneScore += 5;
            score1.setText("" + playerOneScore);
            endGame = true;
        }

        //Determine if Player 2 wins
        if (s1.equals("O") && s1.equals(s2) && s1.equals(s3)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s1.equals("O") && s1.equals(s4) && s1.equals(s7)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s1.equals("O") && s1.equals(s5) && s1.equals(s9)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s2.equals("O") && s2.equals(s5) && s2.equals(s8)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s3.equals("O") && s3.equals(s5) && s3.equals(s7)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s3.equals("O") && s3.equals(s6) && s3.equals(s9)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s4.equals("O") && s4.equals(s5) && s4.equals(s6)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }
        if (s7.equals("O") && s7.equals(s8) && s7.equals(s9)) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
            playerTwoScore += 5;
            score2.setText("" + playerTwoScore);
            endGame = true;
        }

        //Declare a draw if there is no winner
        if (!s1.equals("") && !s2.equals("") && !s3.equals("") && !s4.equals("") && !s5.equals("")
                && !s6.equals("") && !s7.equals("") && !s8.equals("") && !s9.equals("") && !endGame) {
            Toast.makeText(TwoPlayers_3X3_Activity.this, "Game Over! No winner.", Toast.LENGTH_LONG).show();
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
        }

    }


}

