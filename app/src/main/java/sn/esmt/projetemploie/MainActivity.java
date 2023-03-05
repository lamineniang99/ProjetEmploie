package sn.esmt.projetemploie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button demandeurParam ;
    private Button recruteurParam ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        demandeurParam = (Button)findViewById(R.id.demandeurParam);
        recruteurParam = (Button) findViewById(R.id.recruteurParam);

        demandeurParam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DemandeurActivity.class);
                startActivity(intent);
            }
        });

        recruteurParam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RecruteurActivity.class);
                startActivity(intent);
            }
        });
    }
}