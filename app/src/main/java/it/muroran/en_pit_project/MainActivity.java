package it.muroran.en_pit_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // ずかんが押された時の処理
    public void zukanTapped(View view) {
        Intent intent = new Intent(this, zukanActivity.class);
        startActivityForResult(intent,0);
    }

}
