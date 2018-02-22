package com.fortek.modoo.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.fortek.modoo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HelloWorldActivity extends AppCompatActivity {
    @BindView(R.id.tvMain)
    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvMain.setText(R.string.hello_odoo);
    }
}
