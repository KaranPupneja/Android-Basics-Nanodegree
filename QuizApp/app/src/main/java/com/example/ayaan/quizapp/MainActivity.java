package com.example.ayaan.quizapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score = 0;
    int selectdid;
    public void finalscore(View view) {
        float f = 0, f1 = 0, f2 = 0, f3 = 0;
        RadioGroup clickd = (RadioGroup) findViewById(R.id.ques1);
        selectdid = clickd.getCheckedRadioButtonId();
        if (selectdid > 0) {
            RadioButton selectedradio = (RadioButton) findViewById(selectdid);
            s = (String) selectedradio.getText();
            if (s.equals("Virat Kohli")) {
                score = 5;
            } else
                score = 0;
            f1 = score;
        }
        RadioGroup clickd1 = (RadioGroup) findViewById(R.id.ques2);
        selectdid = clickd1.getCheckedRadioButtonId();
        if (selectdid > 0) {
            RadioButton selectedradio = (RadioButton) findViewById(selectdid);
            String s1 = (String) selectedradio.getText();
            if (s1.equals("Donald Trump")) {
                score = 5;
            } else
                score = 0;
            f2 = score;
        }
        RadioGroup clickd2 = (RadioGroup) findViewById(R.id.ques3);
        selectdid = clickd2.getCheckedRadioButtonId();
        if (selectdid > 0) {
            RadioButton selectedradio = (RadioButton) findViewById(selectdid);
            String s2 = (String) selectedradio.getText();
            if (s2.equals("Canberra")) {
                score = 5;
            } else
                score = 0;
            f3 = score;
        }
        f = f1 + f2 + f3 + question4() + question5();
        Toast.makeText(this, "Your score is :" + f, Toast.LENGTH_SHORT).show();
    }
    String s;
    public int question4() {
        EditText clickd = (EditText) findViewById(R.id.ques4);
        String s3 = clickd.getText().toString();
        String s4 = s3.toLowerCase();
        if (s4.equals("aglet")) {
            score = 5;
        } else
            score = 0;
        return score;
    }
    public float question5() {
        CheckBox froyo = (CheckBox) findViewById(R.id.froyo);
        CheckBox honeycomb = (CheckBox) findViewById(R.id.honey);
        CheckBox choco = (CheckBox) findViewById(R.id.choco);
        CheckBox resb = (CheckBox) findViewById(R.id.resberry);
        boolean fr, ho, ch, re;
        float d = 0;
        fr = froyo.isChecked();
        ho = honeycomb.isChecked();
        ch = choco.isChecked();
        re = resb.isChecked();
        if (ch == true || re == true) {
            d = 0;
        } else {
            if (fr == true)
                d = (float) (d + 2.5);
            if (ho == true)
                d = (float) (d + 2.5);
        }
        return d;
    }
}