package androidx2j.sample.lib;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater.from(this).inflate(R.layout.fragment_layout, null);
        LayoutInflater.from(this).inflate(R.layout.fragment_layout, null, false);
    }

}
