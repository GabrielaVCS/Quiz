package application.example.com.quizradio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton a1;
    RadioButton a2;
    RadioButton a3;
    RadioButton a4;

    RadioButton b1;
    RadioButton b2;
    RadioButton b3;
    RadioButton b4;

    RadioButton c1;
    RadioButton c2;

    RadioButton d1;
    RadioButton d2;
    RadioButton d3;
    RadioButton d4;

    RadioButton e1;
    RadioButton e2;
    RadioButton e3;
    RadioButton e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (RadioButton)findViewById(R.id.resp11);
        a2 = (RadioButton)findViewById(R.id.resp12);
        a3 = (RadioButton)findViewById(R.id.resp13);
        a4 = (RadioButton)findViewById(R.id.resp14);

        b1 = (RadioButton)findViewById(R.id.resp21);
        b2 = (RadioButton)findViewById(R.id.resp22);
        b3 = (RadioButton)findViewById(R.id.resp23);
        b4 = (RadioButton)findViewById(R.id.resp24);

        c1 = (RadioButton)findViewById(R.id.resp31);
        c2 = (RadioButton)findViewById(R.id.resp32);

        d1 = (RadioButton)findViewById(R.id.resp41);
        d2 = (RadioButton)findViewById(R.id.resp42);
        d3 = (RadioButton)findViewById(R.id.resp43);
        d4 = (RadioButton)findViewById(R.id.resp44);

        e1 = (RadioButton)findViewById(R.id.resp51);
        e2 = (RadioButton)findViewById(R.id.resp52);
        e3 = (RadioButton)findViewById(R.id.resp53);
        e4 = (RadioButton)findViewById(R.id.resp54);
    }

    public void Verifica(View v){

        if(a1.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'b'",Toast.LENGTH_LONG).show();
        }else if(a2.isChecked()){
            //certo
            Toast.makeText(this,"Você acertou a questão 1!",Toast.LENGTH_LONG).show();
        }else if(a3.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'b'",Toast.LENGTH_LONG).show();
        }else if(a4.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'b'",Toast.LENGTH_LONG).show();
        }

        if(b1.isChecked()){
            //certo
            Toast.makeText(this,"Você acertou a questão 2!",Toast.LENGTH_LONG).show();
        }else if(b2.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'a'",Toast.LENGTH_LONG).show();
        }else if(b3.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'a'",Toast.LENGTH_LONG).show();
        }else if(b4.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'a'",Toast.LENGTH_LONG).show();
        }

        if(c1.isChecked()){
            //certo
            Toast.makeText(this,"Você acertou a questão 3!",Toast.LENGTH_LONG).show();
        }else if(c2.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'sim'",Toast.LENGTH_LONG).show();
        }

        if(d1.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'c'",Toast.LENGTH_LONG).show();
        }else if(d2.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'c'",Toast.LENGTH_LONG).show();
        }else if(d3.isChecked()){
            //certo
            Toast.makeText(this,"Você acertou a questão 4!",Toast.LENGTH_LONG).show();
        }else if(d4.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'c'",Toast.LENGTH_LONG).show();
        }

        if(e1.isChecked()){
            //certo
            Toast.makeText(this,"Você acertou a questão 5!",Toast.LENGTH_LONG).show();
        }else if(e2.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'a'",Toast.LENGTH_LONG).show();
        }else if(e3.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'a'",Toast.LENGTH_LONG).show();
        }else if(e4.isChecked()){
            Toast.makeText(this,"Você errou a questão, resposta certa é a alternativa 'a'",Toast.LENGTH_LONG).show();
        }
    }
}
