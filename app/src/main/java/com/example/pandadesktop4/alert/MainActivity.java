package com.example.pandadesktop4.alert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view)
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        AlertDialog.Builder builder = alert.setMessage("Are you sure,You want to make decision");
        alert.setPositiveButton("Yes",new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface arg0,int arg1)
            {
                Toast.makeText(MainActivity.this,"You Clicked yes button",Toast.LENGTH_LONG).show();
            }

        });

        alert.setNegativeButton("No",new DialogInterface.OnClickListener()
        {
            @Override
                    public void onClick(DialogInterface dialog, int which)
            {
                finish();
            }
        });

        AlertDialog alertDialog = alert.create();
        alertDialog.show();

    }
}
