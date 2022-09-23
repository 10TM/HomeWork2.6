package kg.nazar.homework26;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1=findViewById(R.id.t2);
        TextView textView2=findViewById(R.id.t3);
        TextView textView3=findViewById(R.id.t4);
        TextView textView4=findViewById(R.id.t5);
        Button button=findViewById(R.id.button);
        EditText login=findViewById(R.id.login);
        EditText password=findViewById(R.id.Password);
        login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(login.getText().toString().equals("")){
                    button.setBackgroundColor(Color.BLUE);
                } else {
                    button.setBackgroundColor(Color.YELLOW);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (login.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                    login.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);
                    textView4.setVisibility(View.GONE);
                    textView1.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                }else {
                    Toast.makeText(MainActivity.this, "Вы ввели неверные данные", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}