package ur.mi.de.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Init stage

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int fünf = 5;
        int zehn = fünf * 2;
        String hello = "Hello";
        int neunzehn = 23-4;
        String name = "Sarah";
    }
}
