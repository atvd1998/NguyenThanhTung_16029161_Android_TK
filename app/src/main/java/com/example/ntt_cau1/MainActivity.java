package com.example.ntt_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText tkET, mkET;
    CheckBox luuCB;
    Button dnBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        luuCB = (CheckBox)findViewById(R.id.luuCB);
        dnBTN = (Button)findViewById(R.id.dnBTN);
        dnBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(luuCB.isChecked() == true)
                {
                    Toast.makeText(MainActivity.this,
                            "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,
                            "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
