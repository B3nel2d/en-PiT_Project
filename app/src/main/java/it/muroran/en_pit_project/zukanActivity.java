package it.muroran.en_pit_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class zukanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zukan);

        ImageView contentButton1 = findViewById(R.id.imageView1);
        contentButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!new Fish().isCaptured()){
                    return;
                }

                setContentView(R.layout.content1);
                TextView name = findViewById(R.id.contentName);
                //name.setText();
            }
        });

        ImageView contentButton2 = findViewById(R.id.imageView2);
        contentButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
