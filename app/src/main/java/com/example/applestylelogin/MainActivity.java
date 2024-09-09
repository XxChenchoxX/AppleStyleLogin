package com.example.applestylelogin;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Asegúrate de que 'activity_main' existe en tu carpeta 'res/layout'

        // Referencias a los elementos de la interfaz
        EditText etUsername = findViewById(R.id.et_username);
        EditText etPassword = findViewById(R.id.et_password);
        Button btnLogin = findViewById(R.id.btn_login);

        // Evento de clic en el botón de inicio de sesión
        btnLogin.setOnClickListener(view -> {
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();

            // Verifica las credenciales
            if (username.equals("admin") && password.equals("admin")) {
                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                // Aquí puedes navegar a otra actividad si es necesario
            } else {
                Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
