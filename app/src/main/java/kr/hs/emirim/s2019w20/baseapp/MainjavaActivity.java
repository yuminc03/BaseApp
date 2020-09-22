package kr.hs.emirim.s2019w20.baseapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainjavaActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    CheckBox check1;
    CheckBox check2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.toastButton);
        button1.setOnClickListener(this);

        check1 = findViewById(R.id.checkBox1);
        check1.setOnClickListener(this);
        check2 = findViewById(R.id.checkBox2);
        check2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){//클릭한 view아이디 값 리턴
            case R.id.toastButton:
                Toast.makeText(this, "나 클릭되었어요",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox1:
            case R.id.checkBox2:
                CheckBox check = (CheckBox) view;
                Toast.makeText(this, "내가 좋아하는 것은~" + check.getText(),
                        Toast.LENGTH_SHORT).show();
                break;
        }
        Toast.makeText(this, "나 클릭되었어요",
                Toast.LENGTH_SHORT).show();
    }
}