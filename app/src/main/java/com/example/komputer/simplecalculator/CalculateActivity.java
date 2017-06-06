package com.example.komputer.simplecalculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class CalculateActivity extends AppCompatActivity implements Button.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        findViewById(R.id.firstNumber).setOnClickListener(this);
        findViewById(R.id.secondNumber).setOnClickListener(this);
        findViewById(R.id.addButton).setOnClickListener(this);
        findViewById(R.id.subtractButton).setOnClickListener(this);
        findViewById(R.id.multiplicationButton).setOnClickListener(this);
        findViewById(R.id.divideButton).setOnClickListener(this);
        findViewById(R.id.one).setOnClickListener(this);
        findViewById(R.id.two).setOnClickListener(this);
        findViewById(R.id.three).setOnClickListener(this);
        findViewById(R.id.four).setOnClickListener(this);
        findViewById(R.id.five).setOnClickListener(this);
        findViewById(R.id.six).setOnClickListener(this);
        findViewById(R.id.seven).setOnClickListener(this);
        findViewById(R.id.eight).setOnClickListener(this);
        findViewById(R.id.nine).setOnClickListener(this);
        findViewById(R.id.earse).setOnClickListener(this);
        findViewById(R.id.zero).setOnClickListener(this);
        findViewById(R.id.point).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        EditText a = (EditText)findViewById(R.id.firstNumber);
        EditText b = (EditText)findViewById(R.id.secondNumber);
        TextView calculation = (TextView)findViewById(R.id.calculation);
        TextView result = (TextView)findViewById(R.id.result);

        if(this.getCurrentFocus().getId() == a.getId() || this.getCurrentFocus().getId() == b.getId()){
            boolean first = true;
            if(this.getCurrentFocus().getId() == b.getId())
                first = false;

            switch(v.getId()){
                case R.id.one:
                    if(first)
                        a.append("1");
                    else
                        b.append("1");
                    break;

                case R.id.two:
                    if(first)
                        a.append("2");
                    else
                        b.append("2");
                    break;

                case R.id.three:
                    if(first)
                        a.append("3");
                    else
                        b.append("3");
                    break;

                case R.id.four:
                    if(first)
                        a.append("4");
                    else
                        b.append("4");
                    break;

                case R.id.five:
                    if(first)
                        a.append("5");
                    else
                        b.append("5");
                    break;

                case R.id.six:
                    if(first)
                        a.append("6");
                    else
                        b.append("6");
                    break;

                case R.id.seven:
                    if(first)
                        a.append("7");
                    else
                        b.append("7");
                    break;

                case R.id.eight:
                    if(first)
                        a.append("8");
                    else
                        b.append("8");
                    break;

                case R.id.nine:
                    if(first)
                        a.append("9");
                    else
                        b.append("9");
                    break;

                case R.id.zero:
                    if(first)
                        a.append("0");
                    else
                        b.append("0");
                    break;

                case R.id.point:
                    if(first)
                        a.append(".");
                    else
                        b.append(".");
                    break;

                case R.id.earse:
                    a.setText("");
                    b.setText("");
                    calculation.setText("");
                    result.setText("");
                    break;

                default:
                    break;
            }
        }

        if(a.length() != 0 && b.length() != 0){
            String firstNumber = a.getText().toString();
            String secondNumber = b.getText().toString();
            float res = 0;
            float x = Float.parseFloat(firstNumber);
            float y = Float.parseFloat(secondNumber);
            String calc = Float.toString(x);
            boolean showAll = false;

            switch(v.getId()){
                case R.id.addButton:
                    calc += " + ";
                    res = x + y;
                    showAll = true;
                    break;

                case R.id.subtractButton:
                    calc += " - ";
                    res = x - y;
                    showAll = true;
                    break;

                case R.id.multiplicationButton:
                    calc += " * ";
                    res = x * y;
                    showAll = true;
                    break;

                case R.id.divideButton:
                    calc += " / ";
                    res = x / y;
                    showAll = true;
                    break;

                case R.id.earse:
                    a.setText("");
                    b.setText("");
                    calculation.setText("");
                    result.setText("");
                    showAll = false;
                    break;

                default:
                    break;
            }
            calc += Float.toString(y) + " = ";

            if(showAll){
                calculation.setText(calc);
                result.setText(Float.toString(res));
            }
        }
    }
}
