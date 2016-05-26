package kr.hs.emirim.nahyeonkim.imageslideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper flip;
    EditText edit;
    int time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip=(ViewFlipper)findViewById(R.id.view_flip);
        edit=(EditText)findViewById(R.id.edit_text);
        Button butStart=(Button)findViewById(R.id.but_start);
        butStart.setOnClickListener(this);
        Button butStop=(Button)findViewById(R.id.but_stop);
        butStop.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.but_start: flip.startFlipping();time=(int)Double.parseDouble(edit.getText().toString())*1000; flip.setFlipInterval(time); break;
            case R.id.but_stop: flip.stopFlipping(); break;
        }
    }
}
