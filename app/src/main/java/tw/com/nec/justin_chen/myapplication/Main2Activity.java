package tw.com.nec.justin_chen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int numbers = getIntent().getExtras().getInt("key");
        textView = (TextView)findViewById(R.id.textView2);
        textView.setText(String.valueOf(numbers));


        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                Main2Activity.this.finish();
            }
        });

    }
}
