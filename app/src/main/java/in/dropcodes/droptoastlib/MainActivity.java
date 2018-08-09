package in.dropcodes.droptoastlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import in.dropcodes.droptoast.DropToast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Success(View view) {
        DropToast.makeText(MainActivity.this,"SUCCESS",DropToast.SUCCESS,DropToast.LONG);
    }

    public void Error(View view) {
        DropToast.makeText(MainActivity.this,"ERROR",DropToast.ERROR,DropToast.LONG);
    }

    public void Warning(View view) {
        DropToast.makeText(MainActivity.this,"WARNING",DropToast.WARNING,DropToast.LONG);
    }

    public void Default(View view) {
        DropToast.makeText(MainActivity.this,"Default",DropToast.DEFAULT,DropToast.LONG);
    }

    public void Confused(View view) {
        DropToast.makeText(MainActivity.this,"Confused",DropToast.CONFUSED,DropToast.LONG);
    }
}
