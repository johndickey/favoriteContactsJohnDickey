package com.example.john.favorite_contacts_johndickey;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btncall1, btntext1, btncall2, btntext2, btncall3, btntext3;
    Spinner spintext1, spintext2, spintext3;
    TextView number1, number2, number3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupButtonClickEvents();
    }

    private void setupButtonClickEvents() {
        number1 = findViewById(R.id.textViewnumber1);
        spintext1 = findViewById(R.id.spinnerText1);

        btncall1 = (Button) findViewById(R.id.buttoncall1);
        btncall1.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + number1));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }

        });

        btntext1 = (Button) findViewById(R.id.buttontext1);
        btntext1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2183911863" + number1));
                sendIntent.putExtra("sms_body", "Content of the SMS goes here..." + spintext1);
                if (sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendIntent);
                }
            }

        });

    }

    private void setupButtonClickEvents2() {
        number2 = findViewById(R.id.textViewnumber2);
        spintext2 = findViewById(R.id.spinnerText2);

        btncall2 = (Button) findViewById(R.id.buttoncall2);
        btncall2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number2));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });

        btntext2 = (Button) findViewById(R.id.buttontext1);
        btntext2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2183911863" + number2));
                sendIntent.putExtra("sms_body", "Content of the SMS goes here..." + spintext2);
                if (sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendIntent);
                }
            }

        });

    }

    private void setupButtonClickEvents3() {
        number3 = findViewById(R.id.textViewnumber3);
        spintext3 = findViewById(R.id.spinnerText3);

        btncall3 = (Button) findViewById(R.id.buttoncall3);
        btncall3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number3));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });

        btntext3 = (Button) findViewById(R.id.buttontext3);
        btntext3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2183911863" + number3));
                sendIntent.putExtra("sms_body", "Content of the SMS goes here..." + spintext3);
                if (sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendIntent);
                }
            }

        });

    }
}
