package com.dolia.artsiom.p0301_activityresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class AlignActivity extends ActionBarActivity implements OnClickListener {

    Button btnCenter;
    Button btnRight;
    Button btnLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.align);

        btnCenter = (Button) findViewById(R.id.btnCenter);
        btnRight = (Button) findViewById(R.id.btnRight);
        btnLeft = (Button) findViewById(R.id.btnLeft);

        btnCenter.setOnClickListener(this);
        btnRight.setOnClickListener(this);
        btnLeft.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){

        Intent intent = getIntent();

        switch (v.getId()){

            case R.id.btnCenter:
                intent.putExtra("align", Gravity.CENTER);
                break;
            case R.id.btnRight:
                intent.putExtra("align", Gravity.RIGHT);
                break;
            case R.id.btnLeft:
                intent.putExtra("align", Gravity.LEFT);
                break;
        }

        setResult(RESULT_OK, intent);
        finish();
    }
}
