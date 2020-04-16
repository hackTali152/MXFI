package mx1fi.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void siguiente(View view){
        Intent siguiente = new Intent(this, registro.class);
        startActivity(siguiente);
    }
    public void menuUsu(View view){
        Intent menuUsu=new Intent( this, menu.class);
        startActivity(menuUsu);

    }
}
