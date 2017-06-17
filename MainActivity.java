package com.sts.radiobuttondemoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    RadioButton mApple,mMango;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mApple= (RadioButton) findViewById(R.id.apple_radiobutton);
        mMango= (RadioButton) findViewById(R.id.mango_radiobutton);
        mApple.setOnCheckedChangeListener(this);
        mMango.setOnCheckedChangeListener(this);

    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(buttonView.getId()==R.id.apple_radiobutton)
        {
            if(isChecked)
            {
                Toast.makeText(this, "Appple", Toast.LENGTH_SHORT).show();
            }
        }
        if(buttonView.getId()==R.id.mango_radiobutton)
        {
            if(isChecked)
            {
                Toast.makeText(this, "Mango", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
