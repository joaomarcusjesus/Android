package unipe.aula.com.josiasandroidestagio_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PerfilActivity extends AppCompatActivity {

    private EditText nome_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        nome_perfil = (EditText) findViewById(R.id.nome_perfil);
    }

    public void backView(View view){
        ControllerPerfil.getInstance().setValue(nome_perfil.getText().toString());
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
