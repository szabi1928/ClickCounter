package com.example.diak.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.diak.clickcounter.R.id.textView2;

public class MainActivity extends AppCompatActivity {

    //Valtozok felvetele
    private int szam=0;
    //3 button valtozo
    private Button noveles, csokkentes, reset;
    //1 textview valtozo
        private TextView kiiratas;
    //kattintás számoló változó
    private int ClickCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //változók összekö9tése widgetekkel
        noveles = (Button) findViewById(R.id.buttonNoveles);
        csokkentes = (Button) findViewById(R.id.buttonCsokkent);
        reset = (Button) findViewById(R.id.buttonReset);
        kiiratas = (TextView) findViewById(textView2);




            noveles.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    szam++;
                    ClickCounter++;
                    if (ClickCounter == 20){
                        Toast.makeText(MainActivity.this, "Unatkozol", Toast.LENGTH_SHORT).show();

                    }
                    kiiratas.setText(Integer.toString(szam));
                }
            });

        csokkentes.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              szam--;
                                              ClickCounter++;
                                              if (ClickCounter == 20){
                                                  Toast.makeText(MainActivity.this, "Unatkozol", Toast.LENGTH_SHORT).show();

                                              }
                                              kiiratas.setText(Integer.toString(szam));
                                          }
                                      });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam = 0;
                ClickCounter++;
                if (ClickCounter == 20) {
                    Toast.makeText(MainActivity.this, "Unatkozol", Toast.LENGTH_SHORT).show();

                }
                kiiratas.setText(Integer.toString(szam));
            }
        });




    }
}
