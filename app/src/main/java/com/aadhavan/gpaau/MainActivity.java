package com.aadhavan.gpaau;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    public Button calc;
    public Button res;
    public TextView cgpa;
    RadioGroup chephylab;
    public RadioButton z1,z2,z3,z4,z5,z6;
    RadioGroup che;
    public RadioButton o1,o2,o3,o4,o5,o6;
    RadioGroup python;
    public RadioButton t1,t2,t3,t4,t5,t6;
    RadioGroup eg;
    public RadioButton th1,th2,th3,th4,th5,th6;
    RadioGroup pythonlab;
    public RadioButton f1,f2,f3,f4,f5,f6;
    RadioGroup eng;
    public RadioButton s1,s2,s3,s4,s5,s6;
    RadioGroup math;
    public RadioButton se1,se2,se3,se4,se5,se6;
    RadioGroup phy;
    public RadioButton e1,e2,e3,e4,e5,e6;
    float chephylab_int = 0;
    float che_int = 0;
    float python_int = 0;
    float eg_int = 0;
    float pylab_int = 0;
    float en_int = 0;
    float m_int = 0;
    float phy_int = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onetimedia();
        cgpa = findViewById(R.id.cgpa);
        cgpa.setText("0");
        res = findViewById(R.id.reset);
        calc = findViewById(R.id.button);
        z1 = findViewById(R.id.chephy1);
        z2 = findViewById(R.id.chephy2);
        z3 = findViewById(R.id.chephy3);
        z4 = findViewById(R.id.chephy4);
        z5 = findViewById(R.id.chephy5);
        z6 = findViewById(R.id.chephy6);
        o1 = findViewById(R.id.che1);
        o2 = findViewById(R.id.che2);
        o3 = findViewById(R.id.che3);
        o4 = findViewById(R.id.che4);
        o5 = findViewById(R.id.che5);
        o6 = findViewById(R.id.che6);
        t1 = findViewById(R.id.py1);
        t2 = findViewById(R.id.py2);
        t3 = findViewById(R.id.py3);
        t4 = findViewById(R.id.py4);
        t5 = findViewById(R.id.py5);
        t6 = findViewById(R.id.py6);
        th1 = findViewById(R.id.eg1);
        th2= findViewById(R.id.eg2);
        th3= findViewById(R.id.eg3);
        th4= findViewById(R.id.eg4);
        th5= findViewById(R.id.eg5);
        th6= findViewById(R.id.eg6);
        f1 = findViewById(R.id.pylab1);
        f2 = findViewById(R.id.pylab2);
        f3 = findViewById(R.id.pylab3);
        f4 = findViewById(R.id.pylab4);
        f5 = findViewById(R.id.pylab5);
        f6 = findViewById(R.id.pylab6);
        s1 = findViewById(R.id.en1);
        s2 = findViewById(R.id.en2);
        s3 = findViewById(R.id.en3);
        s4 = findViewById(R.id.en4);
        s5 = findViewById(R.id.en5);
        s6 = findViewById(R.id.en6);
        se1 = findViewById(R.id.m1);
        se2 = findViewById(R.id.m2);
        se3 = findViewById(R.id.m3);
        se4 = findViewById(R.id.m4);
        se5 = findViewById(R.id.m5);
        se6 = findViewById(R.id.m6);
        e1 = findViewById(R.id.phy1);
        e2 = findViewById(R.id.phy2);
        e3 = findViewById(R.id.phy3);
        e4 = findViewById(R.id.phy4);
        e5 = findViewById(R.id.phy5);
        e6 = findViewById(R.id.phy6);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cgpa.setText("0");
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (z1.isChecked()){
                    chephylab_int = 10;
                }
                else if (z2.isChecked()){
                    chephylab_int = 9;
                }
                else if (z3.isChecked()){
                    chephylab_int = 8;
                }
                else if (z4.isChecked()){
                    chephylab_int = 7;
                }
                else if (z5.isChecked()){
                    chephylab_int = 6;
                }
                else if (z6.isChecked()){
                    chephylab_int = 0;
                }
                if (o1.isChecked()){
                    che_int = 10;
                }
                else if (o2.isChecked()){
                    che_int = 9;
                }
                else if (o3.isChecked()){
                    che_int = 8;
                }
                else if (o4.isChecked()){
                    che_int = 7;
                }
                else if (o5.isChecked()){
                    che_int = 6;
                }
                else if (o6.isChecked()){
                    che_int = 0;
                }
                if (t1.isChecked()){
                    python_int = 10;
                }
                else if (t2.isChecked()){
                    python_int = 9;
                }
                else if (t3.isChecked()){
                    python_int = 8;
                }
                else if (t4.isChecked()){
                    python_int = 7;
                }
                else if (t5.isChecked()){
                    python_int = 6;
                }
                else if (t6.isChecked()){
                    python_int = 0;
                }
                if (th1.isChecked()){
                    eg_int = 10;
                }
                else if (th2.isChecked()){
                    eg_int = 9;
                }
                else if (th3.isChecked()){
                    eg_int = 8;
                }
                else if (th4.isChecked()){
                    eg_int = 7;
                }
                else if (th5.isChecked()){
                    eg_int = 6;
                }
                else if (th6.isChecked()){
                    eg_int = 0;
                }
                if (f1.isChecked()){
                    pylab_int = 10;
                }
                else if (f2.isChecked()){
                    pylab_int = 9;
                }
                else if (f3.isChecked()){
                    pylab_int = 8;
                }
                else if (f4.isChecked()){
                    pylab_int = 7;
                }
                else if (f5.isChecked()){
                    pylab_int = 6;
                }
                else if (f6.isChecked()){
                    pylab_int = 0;
                }
                if (s1.isChecked()){
                    en_int = 10;
                }
                else if (s2.isChecked()){
                    en_int = 9;
                }
                else if (s3.isChecked()){
                    en_int = 8;
                }
                else if (s4.isChecked()){
                    en_int = 7;
                }
                else if (s5.isChecked()){
                    en_int = 6;
                }
                else if (s6.isChecked()){
                    en_int = 0;
                }
                if (se1.isChecked()){
                    m_int = 10;
                }
                else if (se2.isChecked()){
                    m_int = 9;
                }
                else if (se3.isChecked()){
                    m_int = 8;
                }
                else if (se4.isChecked()){
                    m_int = 7;
                }
                else if (se5.isChecked()){
                    m_int = 6;
                }
                else if (se6.isChecked()){
                    m_int = 0;
                }
                if (e1.isChecked()){
                    phy_int = 10;
                }
                else if (e2.isChecked()){
                    phy_int = 9;
                }
                else if (e3.isChecked()){
                    phy_int = 8;
                }
                else if (e4.isChecked()){
                    phy_int = 7;
                }
                else if (e5.isChecked()){
                    phy_int = 6;
                }
                else if (e6.isChecked()){
                    phy_int = 0;
                }float
                 result =((chephylab_int*2)+(che_int*3)+(python_int*3)+(eg_int*4)+(pylab_int*2)+(en_int*4)+(m_int*4)+(phy_int*3))/25;
                cgpa.setText(String.valueOf(result));
            }


        });
    }
    public void onetimedia(){
        new AlertDialog.Builder(this)
                .setTitle("Credits")
                .setMessage("Developed by adenosinetp10\nMade in Android Studio 3.6.1\nUsing JAVA and XML\nApp Version : 1.01")
                .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                onetimedia();
                break;

            case R.id.telegram_page:
                visittelegram();
                break;

            case R.id.github:
                visitgithub();
                break;

        }
        return true;
    }
    public void visittelegram(){
        Uri telegramwebsite = Uri.parse("https://t.me/aadha_bot");
        Intent telegram_open = new Intent(Intent.ACTION_VIEW,telegramwebsite);
        startActivity(telegram_open);

    }
    public void visitgithub(){
        Uri githubwebsite = Uri.parse("https://github.com/adenosinetp10/CGPA-AU-R2017-SEM-1/");
        Intent github_open = new Intent(Intent.ACTION_VIEW,githubwebsite);
        startActivity(github_open);

    }
}
