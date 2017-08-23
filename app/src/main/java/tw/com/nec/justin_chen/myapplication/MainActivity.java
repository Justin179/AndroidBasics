package tw.com.nec.justin_chen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);

                // 資料
                String name = "Justin";
                int height = 179;

                // 資料放物件
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                bundle.putInt("height",height);

                // 物件放intent
                intent.putExtra("key",bundle);

                startActivity(intent);
                MainActivity.this.finish();
            }
        });

    }
}
