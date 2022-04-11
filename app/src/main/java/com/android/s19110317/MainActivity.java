package com.android.s19110317;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] checkboxList;
    private ListView listView;
    private CheckBox[] checkBoxes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.check_list);

        checkboxList = getResources().getStringArray(R.array.checkbox_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                checkboxList
        );
        listView.setAdapter(adapter);

    }


    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    private boolean checkboxIsCheck(int rId) {
        CheckBox checkBox = findViewById(rId);
        return checkBox.isChecked();
    }

    public void showToast(View view) {
        String result = "";
        checkboxList = getResources().getStringArray(R.array.checkbox_list);

        if (checkboxIsCheck(R.id.checkbox0)) {
            result += checkboxList[0];
        }

        if (checkboxIsCheck(R.id.checkbox1)) {
            result += " " + checkboxList[1];
        }

        if (checkboxIsCheck(R.id.checkbox2)) {
            result += " " + checkboxList[2];
        }

        if (checkboxIsCheck(R.id.checkbox3)) {
            result += " " + checkboxList[3];
        }

        if (checkboxIsCheck(R.id.checkbox4)) {
            result += " " + checkboxList[4];
        }

        displayToast(result);

    }
}