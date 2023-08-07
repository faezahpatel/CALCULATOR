package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView result, output;
    MaterialButton clearbtn, closebtn, openbtn, dividebtn;
    MaterialButton button7, button8, button9, buttonmul;
    MaterialButton button4, button5, button6, buttonsub;
    MaterialButton button1, button2, button3, buttonadd;
    MaterialButton buttonallclear, buttonzero, buttond, buttonequal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        output = findViewById(R.id.output);
        assignId(clearbtn, R.id.clear_btn);
        assignId(closebtn, R.id.close_btn);
        assignId(openbtn, R.id.open_btn);
        assignId(dividebtn, R.id.btndivide);
        assignId(button7, R.id.btn7);
        assignId(button8, R.id.btn8);
        assignId(button9, R.id.btn9);
        assignId(buttonmul, R.id.btnmul);
        assignId(button4, R.id.btn4);
        assignId(button5, R.id.btn5);
        assignId(button6, R.id.btn6);
        assignId(buttonsub, R.id.btnsub);
        assignId(button1, R.id.btn1);
        assignId(button2, R.id.btn2);
        assignId(button3, R.id.btn3);
        assignId(buttonadd, R.id.btnadd);
        assignId(clearbtn, R.id.allclear);
        assignId(buttonequal, R.id.btnequal);
        assignId(buttond, R.id.button);
        assignId(buttonzero, R.id.btnzero);

    }

    void assignId(MaterialButton btn, int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        MaterialButton Button = (MaterialButton) view;
        String ButtonText = Button.getText().toString();
        String datatocalculate = output.getText().toString();
        //IT WILL CONCAATINATE

        if (ButtonText.equals("AC")) {
            output.setText(" ");
            result.setText(("0"));
            return;
        }

        if (ButtonText.equals("=")) {
            output.setText(result.getText());
        }

        if (ButtonText.equals("C")) {
            datatocalculate = datatocalculate.substring(0, datatocalculate.length() - 1);

        } else {
            datatocalculate = datatocalculate + ButtonText;
        }
        output.setText(datatocalculate);

    }
    String getresult(String data){
return "calucalted";
}
    }
}
        }
        }
