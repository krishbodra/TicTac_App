package com.example.tictacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity {

    TextView b1,b2,b3,b4,b5,b6,b7,b8,b9,textview;
    Button breset;
    int counter=0;

    boolean isWin=false;


    void tictac(){

        if(b1.getText().toString()=="0"&&b2.getText().toString()=="0"&&b3.getText().toString()=="0"){
            textview.setText("0 is win");
            isWin=true;
        }else if(b4.getText().toString()=="0"&&b5.getText().toString()=="0"&&b6.getText().toString()=="0"){
            textview.setText("0 is win");
            isWin=true;
        }else if(b7.getText().toString()=="0"&&b8.getText().toString()=="0"&&b9.getText().toString()=="0"){
            textview.setText("0 is win");
            isWin=true;
        }else if(b1.getText().toString()=="0"&&b4.getText().toString()=="0"&&b7.getText().toString()=="0"){
            textview.setText("0 is win");
            isWin=true;
        }else if(b2.getText().toString()=="0"&&b5.getText().toString()=="0"&&b8.getText().toString()=="0"){
            textview.setText("0 is win");
            isWin=true;
        }else if(b3.getText().toString()=="0"&&b6.getText().toString()=="0"&&b9.getText().toString()=="0"){
            textview.setText("0 is win");
            isWin=true;
        }else if(b1.getText().toString()=="0"&&b5.getText().toString()=="0"&&b9.getText().toString()=="0"){
            textview.setText("0 is win");
            isWin=true;
        }else if(b3.getText().toString()=="0"&&b5.getText().toString()=="0"&&b7.getText().toString()=="0"){
            textview.setText("0 is win");
            isWin=true;
            // X part
        }else if(b1.getText().toString()=="X"&&b2.getText().toString()=="X"&&b3.getText().toString()=="X"){
            textview.setText("X is win");
            isWin=true;
        }else if(b4.getText().toString()=="X"&&b5.getText().toString()=="X"&&b6.getText().toString()=="X"){
            textview.setText("X is win");
            isWin=true;
        }else if(b7.getText().toString()=="X"&&b8.getText().toString()=="X"&&b9.getText().toString()=="X"){
            textview.setText("X is win");
            isWin=true;
        }else if(b1.getText().toString()=="X"&&b4.getText().toString()=="X"&&b7.getText().toString()=="X"){
            textview.setText("X is win");
            isWin=true;
        }else if(b2.getText().toString()=="X"&&b5.getText().toString()=="X"&&b8.getText().toString()=="X"){
            textview.setText("X is win");
            isWin=true;
        }else if(b3.getText().toString()=="X"&&b6.getText().toString()=="X"&&b9.getText().toString()=="X"){
            textview.setText("X is win");
            isWin=true;
        }else if(b1.getText().toString()=="X"&&b5.getText().toString()=="X"&&b9.getText().toString()=="X"){
            textview.setText("X is win");
            isWin=true;
        }else if(b3.getText().toString()=="X"&&b5.getText().toString()=="X"&&b7.getText().toString()=="X"){
            textview.setText("X is win");
            isWin=true;
        } // draw
        else if(!b1.getText().toString().isEmpty()&&!b2.getText().toString().isEmpty()&&!b3.getText().toString().isEmpty()&&
                !b4.getText().toString().isEmpty()&&!b5.getText().toString().isEmpty()&&!b6.getText().toString().isEmpty()&&
                b7.getText().toString()!=""&&b8.getText().toString()!=""&&b9.getText().toString()!=""){
            textview.setText("Game Draw");
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("krish", "onCreate: ");

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        breset = findViewById(R.id.breset);
        textview = findViewById(R.id.textview);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString().isEmpty() && !isWin) {
                    if(counter % 2 == 0){
                        b1.setText("0");
                    }else {
                        b1.setText("X");
                    }
                    counter++;

                    tictac();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().isEmpty() && !isWin) {
                    if(counter % 2 == 0){
                        b2.setText("0");
                    }else {
                        b2.setText("X");
                    }
                    counter++;

                    tictac();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString().isEmpty() && !isWin) {
                    if(counter % 2 == 0){
                        b3.setText("0");
                    }else {
                        b3.setText("X");
                    }
                    counter++;

                    tictac();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString().isEmpty() && !isWin) {
                    if(counter % 2 == 0){
                        b4.setText("0");
                    }else {
                        b4.setText("X");
                    }
                    counter++;

                    tictac();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString().isEmpty() && !isWin) {
                    if(counter % 2 == 0){
                        b5.setText("0");
                    }else {
                        b5.setText("X");
                    }
                    counter++;

                    tictac();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString().isEmpty() && !isWin) {
                    if(counter % 2 == 0){
                        b6.setText("0");
                    }else {
                        b6.setText("X");
                    }
                    counter++;

                    tictac();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString().isEmpty() && !isWin) {
                    if(counter % 2 == 0){
                        b7.setText("0");
                    }else {
                        b7.setText("X");
                    }
                    counter++;

                    tictac();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().isEmpty() && !isWin) {
                    if(counter % 2 == 0){
                        b8.setText("0");
                    }else {
                        b8.setText("X");
                    }
                    counter++;

                    tictac();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString().isEmpty() && !isWin) {
                    if(counter % 2 == 0){
                        b9.setText("0");
                    }else {
                        b9.setText("X");
                    }
                    counter++;

                    tictac();
                }
            }
        });
        breset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                textview.setText("");
                counter = 0;
                isWin = false;

            }
        });
    }
}