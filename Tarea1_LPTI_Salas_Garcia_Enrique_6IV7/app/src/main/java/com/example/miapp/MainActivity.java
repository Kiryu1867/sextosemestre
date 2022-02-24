package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText materia1,materia2,materia3,materia4,materia5,materia6,materia7,materia8,materia9,materia10,reslt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();


        materia1=(EditText)findViewById(R.id.txt_mat1);
        materia2=(EditText)findViewById(R.id.txt_mat2);
        materia3=(EditText)findViewById(R.id.txt_mat3);
        materia4=(EditText)findViewById(R.id.txt_mat4);
        materia5=(EditText)findViewById(R.id.txt_mat5);
        materia6=(EditText)findViewById(R.id.txt_mat6);
        materia7=(EditText)findViewById(R.id.txt_mat7);
        materia8=(EditText)findViewById(R.id.txt_mat8);
        materia9=(EditText)findViewById(R.id.txt_mat9);
        materia10=(EditText)findViewById(R.id.txt_mat10);






        reslt=(EditText)findViewById(R.id.txt_result_1par);
    }

    public void promedio(View view){
        String materia1 = materia1.getText().toString();
        String materia2 = materia2.getText().toString();
        String materia3 = materia3.getText().toString();
        String materia4 = materia4.getText().toString();
        String materia5 = materia5.getText().toString();
        String materia6 = materia6.getText().toString();
        String materia7 = materia7.getText().toString();
        String materia8 = materia8.getText().toString();
        String materia9 = materia9.getText().toString();
        String materia10 = materia10.getText().toString();





        double mate1 = Double.parseDouble(materia1);
        double mate2 = Double.parseDouble(materia2);
        double mate3 = Double.parseDouble(materia3);
        double mate4 = Double.parseDouble(materia4);
        double mate5 = Double.parseDouble(materia5);
        double mate6 = Double.parseDouble(materia6);
        double mate7 = Double.parseDouble(materia7);
        double mate8 = Double.parseDouble(materia8);
        double mate9 = Double.parseDouble(materia9);
        double mate10 = Double.parseDouble(materia10);






        double promedio1par = (mate1+mate2+mate3+mate4+mate5+mate6+mate7+mate8+mate9+mate10)/10;




        String result = String.valueOf(promedio1par);

        reslt.setText(result);


    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();

    }




}
