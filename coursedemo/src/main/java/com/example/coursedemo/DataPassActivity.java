package com.example.coursedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataPassActivity extends AppCompatActivity {

    public static final int RESULT_BACK=1;

    private EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pass);
        inputText=(EditText)findViewById(R.id.input_text);
    }

    public void onClickButton(View v){
        Intent data=new Intent();
        DataModel dataModel=new DataModel();
        dataModel.setData(inputText.getText().toString());
        data.putExtra("input_data",dataModel);
        setResult(RESULT_BACK,data);
        finish();
    }
}
