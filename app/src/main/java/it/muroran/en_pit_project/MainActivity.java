package it.muroran.en_pit_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;//ボタン利用のため追加


public class MainActivity extends AppCompatActivity {
    private Button s_btn;//撮影用ボタン

    // ずかんが押された時の処理
    public void zukanTapped(View view) {
        Intent intent = new Intent(this, zukanActivity.class);
        startActivityForResult(intent,0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s_btn = (Button) findViewById(R.id.b0);


        s_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // インテントへのインスタンス生成
                Intent intent = new Intent(MainActivity.this, CameraCaptureActivity.class);
                //                // サブ画面の呼び出し
                startActivity(intent);
            }
        });

    }
}


