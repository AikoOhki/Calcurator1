package com.example.aiko.calcurator1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView n1Text;
    int n1;
    TextView opeText;
    int ope;
    TextView n2Text;
    int n2;
    TextView answerText;
    int answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1Text = (TextView) findViewById(R.id.n1);
        n1 = 0;
        n1Text.setText("0");
        opeText = (TextView) findViewById(R.id.ope);
        ope = 0;
        opeText.setText("");
        n2Text = (TextView) findViewById(R.id.n2);
        n2 = 0;
        n2Text.setText("");
        answerText = (TextView) findViewById(R.id.answer);
        answer = 0;
        answerText.setText("");

    }

    public void bt1 (View v) {
        if (ope == 0) {
            n1 = n1 * 10 + 1;
            n1Text.setText(n1 + "");
        } else if
                (ope > 0) {
            n2 = n2 * 10 + 1;
            n2Text.setText(n2 + "");
        }
    }


    public void bt2 (View v) {
        if (ope == 0){
            n1 = n1 * 10 + 2;
            n1Text.setText(n1 + "");
        }else if (ope > 0){
            n2 = n2 * 10 + 2;
            n2Text.setText(n2 + "");
        }
    }

    public void bt3 (View v){
        if (ope == 0) {
            n1 = n1 * 10 + 3;
            n1Text.setText(n1 + "");
        } else if (ope > 0){
            n2 = n2 * 10 + 3;
            n2Text.setText(n2 + "");
        }
    }

    public void bt4 (View v){
        if (ope == 0) {
            n1 = n1 * 10 + 4;
            n1Text.setText(n1 + "");
        }else if(ope > 0){
            n2 = n2 * 10 + 4;
            n2Text.setText(n2 + "");
        }
    }

    public void bt5 (View v){
        if (ope == 0) {
            n1 = n1 * 10 + 5;
            n1Text.setText(n1 + "");
        } else if (ope > 0){
            n2 = n2 * 10 + 5;
            n2Text.setText(n2 + "");
        }
    }

    public void bt6 (View v){
        if (ope == 0) {
            n1 = n1 * 10 + 6;
            n1Text.setText(n1 + "");
        }else if (ope > 0){
            n2 = n2 * 10 + 6;
            n2Text.setText(n2 + "");
        }
    }

    public void bt7 (View v){
        if (ope == 0) {
            n1 = n1 * 10 + 7;
            n1Text.setText(n1 + "");
        }else if (ope > 0){
            n2 = n2 * 10 + 7;
            n2Text.setText(n2 + "");
        }
    }

    public void bt8 (View v){
        if (ope == 0) {
            n1 = n1 * 10 + 8;
            n1Text.setText(n1 + "");
        }else if (ope > 0){
            n2 = n2 * 10 + 8;
            n2Text.setText(n2 + "");
        }
    }

    public void bt9 (View v){
        if (ope == 0) {
            n1 = n1 * 10 + 9;
            n1Text.setText(n1 + "");
        }else if (ope > 0){
            n2 = n2 * 10 + 9;
            n2Text.setText(n2 + "");
        }
    }

    public void bt0 (View v){
        if (ope == 0) {
            n1 = n1 * 10 + 0;
            n1Text.setText(n1 + "");
        }else if (ope > 0){
            n2 = n2 * 10 + 0;
            n2Text.setText(n2 + "");
        }
    }

    public void btplus (View v) {
        ope = 1;
        opeText.setText("+");
        n2Text.setText("");
    }

    public void btminus (View v) {
        ope = 2;
        opeText.setText("-");
        n2Text.setText("");
    }

    public void btmulti (View v) {
        ope = 3;
        opeText.setText("*");
        n2Text.setText("");
    }

    public void btdivi (View v) {
        ope = 4;
        opeText.setText("/");
        n2Text.setText("");
    }

    public void btequal (View v) {
        if (ope == 1) {
            answer = n1 + n2;
            answerText.setText("=" + answer);
            ope = -1;
            n1 = 0;
            ope = 0;
            n2 = 0;
            answer = 0;
        }

        if (ope == 2) {
            answer = n1 - n2;
            answerText.setText("=" + answer);
            ope = -1;
            n1 = 0;
            ope = 0;
            n2 = 0;
            answer = 0;
        }

        if (ope == 3) {
            answer = n1 * n2;
            answerText.setText("=" + answer);
            ope = -1;
            n1 = 0;
            ope = 0;
            n2 = 0;
            answer = 0;
        }

        if (ope == 4) {
            answer = n1 / n2;
            answerText.setText("=" + answer);
            ope = -1;
            n1 = 0;
            ope = 0;
            n2 = 0;
            answer = 0;
        }







    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
