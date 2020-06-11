package com.jasjotsingh.applifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_main,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("on Create");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(MainActivity.this,"on Start",Toast.LENGTH_LONG).show();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_main,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("on Start");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,20,20);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(MainActivity.this,"on Resume",Toast.LENGTH_LONG).show();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_main,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("on Resume");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.START,20,40);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        //toast.setText("on Resume");
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(MainActivity.this,"on Pause",Toast.LENGTH_LONG).show();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_main,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("on Pause");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,20,60);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        //toast.setText("on Pause");
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(MainActivity.this,"on Stop",Toast.LENGTH_LONG).show();

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_main,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("on Stop");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.END,20,80);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        //toast.setText("on Stop");
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
       // Toast.makeText(MainActivity.this,"on Restart",Toast.LENGTH_LONG).show();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_main,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("on Restart");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_HORIZONTAL,20,100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        //toast.setText("on Restart");
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(MainActivity.this,"on Destroy",Toast.LENGTH_LONG).show();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_main,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("on Destroy");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,20,120);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        //toast.setText("on Destroy");
        toast.show();
    }
}