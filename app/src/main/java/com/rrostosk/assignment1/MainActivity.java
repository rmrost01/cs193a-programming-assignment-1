package com.rrostosk.assignment1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateTip(View view) {
        EditText check = (EditText) findViewById(R.id.checkAmt);
        String amount = check.getText().toString();
        double answer = Double.parseDouble(amount);
        double tip;
        if (view.getId() == R.id.button10) {
            tip = 10;
        }
        else if (view.getId() == R.id.button15) {
            tip = 15;
        }
        else {
            tip = 20;
        }
        double tipAmt = answer + answer*(tip/100);
        TextView tipBox = (TextView) findViewById(R.id.result);
        tipBox.setText(Double.toString(tipAmt));
    }
}