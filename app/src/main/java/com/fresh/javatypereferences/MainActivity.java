package com.fresh.javatypereferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.fresh.javatypereferences.model.DataType;
import com.fresh.javatypereferences.viewmodel.DataTypeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final List<DataType> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DataTypeAdapter adapter = new DataTypeAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }

    private void setListData() {
        list.add(new DataType("int", "Primitive",
                "The int data type is a 32-bit signed two's complement integer. Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive). Its minimum value is - 2,147,483,648and maximum value is 2,147,483,647. Its default value is 0."));
        list.add(new DataType("float", "Primitive",
                "The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited. It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. The float data type should never be used for precise values, such as currency."));
        list.add(new DataType("boolean", "Primitive",
                "The Boolean data type is used to store only two possible values: true and false. This data type is used for simple flags that track true/false conditions."));
        list.add(new DataType("String", "Array",
                "Strings are the type of objects that can store the character of values. A string acts the same as an array of characters in Java."));
    }
}