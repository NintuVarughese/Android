package com.example.layouts;//package com.example.constraints;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.layouts.R;

//import com.example.constraints.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnConstraintLayout = findViewById(R.id.btnConstraintLayout);
        Button btnLinearLayout = findViewById(R.id.btnLinearLayout);
        Button btnRelativeLayout = findViewById(R.id.btnRelativeLayout);
        Button btnFrameLayout = findViewById(R.id.btnFrameLayout);
        Button btnTableLayout = findViewById(R.id.btnTableLayout);

        btnConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.constrain_layout);
            }
        });

        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.linear_layout);
            }
        });

        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.relative_layout);
            }
        });

        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.frame_layout);
            }
        });

        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.table_layout);
            }
        });
    }
}
