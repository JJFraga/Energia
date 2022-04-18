package es.aplideka.electrolizador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity
{
    private Button _boton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        this._boton = findViewById(R.id.button);

        this._boton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(view.getContext(), es.aplideka.conversor.Calculadora.Sumar(1, 2) + "", (short) 500).show();
            }
        });
    }
}