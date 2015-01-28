package com.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends Activity {
	EditText vFirstValue;
	EditText vSecondValue;
	TextView vResult;
	Button vCalculate;
	float vNum1 , vNum2, vOutPut;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        vFirstValue = (EditText) findViewById(R.id.EditText01);
        vFirstValue.setText("0");
        vFirstValue.setOnTouchListener(new View.OnTouchListener() {
			
			public boolean onTouch(View v, MotionEvent event) {
				vFirstValue.setText("");
				return false;
			}
		});
        
        vSecondValue = (EditText) findViewById(R.id.EditText02);
        vSecondValue.setText("0");
        vSecondValue.setOnTouchListener(new View.OnTouchListener() {
        	
			public boolean onTouch(View v, MotionEvent event) {
				vSecondValue.setText("");
				return false;
			}
        });

        vResult = (TextView) findViewById(R.id.TextView01);
        vResult.setText("0.00");
        
        vCalculate = (Button) findViewById(R.id.Button01);

        //Adding listener to button
        vCalculate.setOnClickListener(new View.OnClickListener() {

	    	public void onClick(View v) {
	    		//Getting first & second values and passing to show result
	    		showResult(vFirstValue.getText().toString(), vSecondValue.getText().toString());
	    	}
        });
    }

    //Showing multiply results
    public void showResult(String vFirst, String vSecond) {
    	vNum1 = Float.parseFloat(vFirst);
    	vNum2 = Float.parseFloat(vSecond);
    	vOutPut = vNum1 * vNum2;
    	vResult.setText(String.valueOf(vOutPut));
    }
 
}
