package com.example.laboratorio.classwork3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText calcular;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,sum,res,mul,div,equ,del,back;
    private Double total,value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcular = (EditText) findViewById(R.id.editText);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b0=(Button) findViewById(R.id.button0);
        sum=(Button) findViewById(R.id.buttoninc);
        res=(Button) findViewById(R.id.buttondec);
        mul=(Button) findViewById(R.id.buttonmul);
        div=(Button) findViewById(R.id.buttondiv);
        equ=(Button) findViewById(R.id.buttoneq);
        del=(Button) findViewById(R.id.buttondel);
        back=(Button) findViewById(R.id.buttonBack);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        sum.setOnClickListener(this);
        res.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        equ.setOnClickListener(this);
        del.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button1:

                calcular.setText(calcular.getText().toString()+"1");
                break;
            case R.id.button2:
                calcular.setText(calcular.getText().toString()+"2");
                break;
            case R.id.button3:
                calcular.setText(calcular.getText().toString()+"3");
                break;
            case R.id.button4:
                calcular.setText(calcular.getText().toString()+"4");
                break;
            case R.id.button5:
                calcular.setText(calcular.getText().toString()+"5");
                break;
            case R.id.button6:
                calcular.setText(calcular.getText().toString()+"6");
                break;
            case R.id.button7:
                calcular.setText(calcular.getText().toString()+"7");
                break;
            case R.id.button8:
                calcular.setText(calcular.getText().toString()+"8");
                break;
            case R.id.button9:
                calcular.setText(calcular.getText().toString()+"9");
                break;
            case R.id.button0:
                calcular.setText(calcular.getText().toString()+"0");
                break;
            case R.id.buttoninc:

                calcular.setText(calcular.getText().toString()+"+");
                break;
            case R.id.buttondec:
                calcular.setText(calcular.getText().toString()+"-");
                break;
            case R.id.buttonmul:
                calcular.setText(calcular.getText().toString()+"*");
                break;
            case R.id.buttondiv:
                calcular.setText(calcular.getText().toString()+"/");
                break;
            case R.id.buttoneq:
                Expression exp = new ExpressionBuilder(calcular.getText().toString()).build();
                calcular.setText(String.valueOf(exp.evaluate()));
                break;
            case R.id.buttondel:
                calcular.setText(null);
                break;

            case R.id.buttonBack:
                calcular.setText(calcular.getText().toString().substring(0,calcular.getText().length()-1));
                break;

        }
    }


}
