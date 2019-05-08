package irdc.ex03_01.rgb;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tr,tg,tb,tv;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tr = findViewById(R.id.textView2);
        tg = findViewById(R.id.textView3);
        tb = findViewById(R.id.textView4);
        tv = findViewById(R.id.textView5);
    }
    public void changecolor(View v){
        Random x = new Random();

        int red = x.nextInt(256);
        tr.setText("Red: " + red);
        tr.setTextColor(Color.rgb(red,0,0));

        int green = x.nextInt(256);
        tg.setText("Green: " + green);
        tg.setTextColor(Color.rgb(0,green,0));

        int blue = x.nextInt(256);
        tb.setText("Blue: " + blue);
        tb.setTextColor(Color.rgb(0,0,blue));

        text += red + ", " + green + ", " + blue + "\n";
        tv.setTextSize(16);
        tv.setText(text);
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setBackgroundColor(Color.rgb(red,green,blue));
    }
}
