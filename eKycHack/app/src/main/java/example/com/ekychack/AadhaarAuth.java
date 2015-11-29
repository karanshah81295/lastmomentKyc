package example.com.ekychack;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class AadhaarAuth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadhaar_auth);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=(EditText)findViewById(R.id.aadharNo);
                EditText editText1=(EditText)findViewById(R.id.aadharName);
                Intent intent=new Intent(getApplicationContext(),OtpAuth.class);
                if(editText.getText().toString().length()!=12||editText.getText().toString()==null)
                {
                    Snackbar.make(view,"Invalid Aadhar Number Format",Snackbar.LENGTH_LONG).show();
                    return;
                }
                else{
                startActivity(intent);}
            }
        });
    }
}
