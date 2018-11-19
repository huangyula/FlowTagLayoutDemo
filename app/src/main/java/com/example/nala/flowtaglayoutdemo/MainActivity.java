package com.example.nala.flowtaglayoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

public class MainActivity extends Activity {

    private String[] mVals = new String[]
            {
                    "hello", "Android", "button", "TextView", "ListView", "EditText",
                    "hello", "Android", "button", "TextView", "ListView", "EditText",
                    "hello", "Android", "button", "TextView", "ListView", "EditText"
            };
    private HyFlowLayout mFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlowLayout = (HyFlowLayout)findViewById(R.id.flowlayout);
        initData();
    }

    public void initData() {
        //添加一个有样式的TextView
        LayoutInflater mInflator=LayoutInflater.from(this);
        for(int i=0;i<mVals.length;i++){
            TextView tv=(TextView)mInflator.inflate(R.layout.tv,mFlowLayout,false);
            tv.setText(mVals[i]);
            mFlowLayout.addView(tv);
        }
    }
}
