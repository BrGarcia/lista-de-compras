package br.com.brdev.listacompras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class Main extends AppCompatActivity {
    Button
        buttonCadastrarProduto,
        buttonConsultarPreco,
        buttonMontarListaCompras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


    }
}
