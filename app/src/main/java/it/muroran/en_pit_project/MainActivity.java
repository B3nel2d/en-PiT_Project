package it.muroran.en_pit_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener((OnClickListener) this);
    }

    // b1(ずかん)が押された時の処理
    public void onClick(View v){
        if(v==b1){
            Intent intent = new Intent(this, zukanActivity.class);
            startActivityForResult(intent,0);
        }
    }

}
