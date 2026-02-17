package ru.mirea.nikolaevad.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EmptyAcrivity extends AppCompatActivity {

    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkBox1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_acrivity);

        checkBox1 = findViewById(R.id.checkBox);
        textViewStudent = findViewById(R.id.textView2);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку №9");
                checkBox1.setChecked(true);
            }
        };

        View.OnClickListener oclBtnItsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Это не я сделал!");
                checkBox1.setChecked(false);
            }
        };

        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
        btnItIsNotMe.setOnClickListener(oclBtnItsNotMe);
    }
}