package ovh.banaszkiewicz.firstandroidapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;

    private TextView sumTextView;
    private EditText sumEditText;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.number1 = findViewById(R.id.number1);
        this.number2 = findViewById(R.id.number2);

        this.sumTextView = findViewById(R.id.sumTextView);
        this.sumEditText = findViewById(R.id.sumEditText);
    }

    public void countSum(View v) {
        this.sumEditText.setText(String.valueOf(Integer.parseInt(this.number1.getText().toString()) + Integer.parseInt(this.number2.getText().toString())));
        this.sumEditText.setVisibility(View.VISIBLE);
        this.sumTextView.setVisibility(View.VISIBLE);
    }
}
