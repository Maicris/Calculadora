package br.com.appdev.calculadora;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSumOnClick(View view) {

        //Teste
        InputMethodManager inputMethodManager =
                (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

        Double num1, num2, sum;
        EditText txtNum1, txtNum2, txtSum;

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        txtSum = (EditText) findViewById(R.id.txtSum);
        num1 = Double.valueOf(txtNum1.getText().toString());
        num2 = Double.valueOf(txtNum2.getText().toString());
        sum = num1 + num2;
        txtSum.setText(""+sum);
    }
}
