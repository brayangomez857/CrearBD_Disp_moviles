package com.example.bd_unit3.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminDB extends SQLiteOpenHelper {
  public AdminDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
    super(context, name, factory, version);
  }

  @Override
  public void onCreate(SQLiteDatabase BaseDatos) {
    BaseDatos.execSQL("create table clientes(codigo int primary key, nombre text, direccion text, telefono text)");
    BaseDatos.execSQL("create table pedido(codigo int primary key, descripcion text, fecha text)");
    BaseDatos.execSQL("create table producto(codigo int primary key, fabricante text, valor int)");
    BaseDatos.execSQL("create table factura(codigo int primary key, fecha text,valor int)");

  }

  @Override
  public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

  }
}
