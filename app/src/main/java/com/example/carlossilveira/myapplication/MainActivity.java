package com.example.carlossilveira.myapplication;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Minimax minimax;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,bStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button) findViewById(R.id.b0);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        bStart=(Button) findViewById(R.id.bStart);
        minimax=new Minimax();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b0.setText("X");
                b0.setEnabled(false);
                minimax.pulsaBoton(0);
                int ng=minimax.getGanador();
                ganar();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText("X");
                b1.setEnabled(false);
                minimax.pulsaBoton(1);
                int ng=minimax.getGanador();
                ganar();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setText("X");
                b2.setEnabled(false);
                minimax.pulsaBoton(2);
                int ng=minimax.getGanador();
                ganar();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setText("X");
                b3.setEnabled(false);
                minimax.pulsaBoton(3);
                int ng=minimax.getGanador();
                ganar();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setText("X");
                b4.setEnabled(false);
                minimax.pulsaBoton(4);
                int ng=minimax.getGanador();
                ganar();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setText("X");
                b5.setEnabled(false);
                minimax.pulsaBoton(5);
                int ng=minimax.getGanador();
                ganar();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setText("X");
                b6.setEnabled(false);
                minimax.pulsaBoton(6);
                int ng=minimax.getGanador();
                ganar();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setText("X");
                b7.setEnabled(false);
                minimax.pulsaBoton(7);
                int ng=minimax.getGanador();
                ganar();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setText("X");
                b8.setEnabled(false);
                minimax.pulsaBoton(8);
                int ng=minimax.getGanador();
                ganar();
            }
        });
        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b0.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b0.setText("");
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                minimax=new Minimax();
            }
        });
    }
    public void ganar(){
        int pos=minimax.getUltimoBtn();
        if(pos==0){b0.setText("0");b0.setEnabled(false);}
        if(pos==1){b1.setText("0");b1.setEnabled(false);}
        if(pos==2){b2.setText("0");b2.setEnabled(false);}
        if(pos==3){b3.setText("0");b3.setEnabled(false);}
        if(pos==4){b4.setText("0");b4.setEnabled(false);}
        if(pos==5){b5.setText("0");b5.setEnabled(false);}
        if(pos==6){b6.setText("0");b6.setEnabled(false);}
        if(pos==7){b7.setText("0");b7.setEnabled(false);}
        if(pos==8){b8.setText("0");b8.setEnabled(false);}
        int ng=minimax.getGanador();
        Vibrator v= (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if(ng==0){
            Toast.makeText(getApplicationContext(),"Gana el usuario",Toast.LENGTH_LONG).show();
            v.vibrate(400);
        }else if(ng==1){
            Toast.makeText(getApplicationContext(),"Gana el ordenador",Toast.LENGTH_LONG).show();
            v.vibrate(400);
        }else if(minimax.tableroComp()){
            Toast.makeText(getApplicationContext(),"Empate",Toast.LENGTH_LONG).show();
            v.vibrate(400);
        }
    }
}
