package pe.bazan.jhosep.com.pginasamarillasapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pe.bazan.jhosep.com.pginasamarillasapp.R;

public class BuscadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);
    }
    public void sendActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);



    }
}
