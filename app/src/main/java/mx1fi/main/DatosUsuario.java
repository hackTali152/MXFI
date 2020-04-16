package mx1fi.main;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatosUsuario  extends SQLiteOpenHelper {


    public DatosUsuario(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BDUS) {
    BDUS.execSQL("create table ResgistroUsuario (nickname string primary key, NombreUsuario string, ApellidoUsuario string, CorreoUsuario string, TelefonoUsuario int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}






