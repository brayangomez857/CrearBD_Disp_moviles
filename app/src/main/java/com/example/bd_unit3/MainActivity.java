package com.example.bd_unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.bd_unit3.db.AdminDB;

public class MainActivity extends AppCompatActivity {

  Button btnCrear;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    btnCrear=findViewById(R.id.btn_crear);

  }
  public void Crear(View view){
    AdminDB admin=new AdminDB(this,"BaseDatos",null,1);
    SQLiteDatabase BaseDatos=admin.getWritableDatabase();
    if (BaseDatos!=null){
      Toast.makeText(this,"Base de datos creada",Toast.LENGTH_LONG).show();
    }else {
      Toast.makeText(this,"Error en la creacion de la base de datos",Toast.LENGTH_LONG).show();
    }
  }
}