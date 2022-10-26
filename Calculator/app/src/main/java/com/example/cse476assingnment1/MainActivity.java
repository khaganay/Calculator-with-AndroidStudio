package com.example.cse476assingnment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    TextView works;
    TextView results;
    String workings = "";
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnmux, btnadd, btnsub, btndiv, btndot, btnpow, btnclr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        results = (TextView) findViewById(R.id.result);
        works = (TextView) findViewById(R.id.work);
    }
    private void setWorkings(String givenValue){
        workings = workings + givenValue;
        works.setText(workings);
    }

    public void zero(View view){
        setWorkings("0");
    }
    public void one(View view){
        setWorkings("1");
    }
    public void two(View view){
        setWorkings("2");
    }
    public void three(View view){
        setWorkings("3");
    }
    public void four(View view){
        setWorkings("4");
    }
    public void five(View view){
        setWorkings("5");
    }
    public void six(View view){
        setWorkings("6");
    }
    public void seven(View view){
        setWorkings("7");
    }
    public void eight(View view){
        setWorkings("8");
    }
    public void nine(View view){
        setWorkings("9");
    }
    public void dot(View view){
        setWorkings(".");
    }
    public void mux(View view){
        setWorkings("*");
    }
    public void addition(View view){
        setWorkings("+");
    }
    public void subtraction(View view){
        setWorkings("-");
    }
    public void div(View view){
        setWorkings("/");
    }
    public void clear(View view){
        works.setText("");
        workings = "";
        results.setText("");
    }

    public void equals(View view){
        Double result = null;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

        try {
            result = (double)engine.eval(workings);

    } catch (ScriptException e) {
            e.printStackTrace();
        }
        {
            Toast.makeText(this, "Invalid Input",Toast.LENGTH_SHORT).show();
        }
        if(result != null)
            results.setText(String.valueOf(result.doubleValue()));

        workings = "";
    }


    }



