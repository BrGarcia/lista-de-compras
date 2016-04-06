package br.com.brdev.listacompras;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BdHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 2;              //versao do db
    private static final String DATABASE_NAME = "PRODUTOS";     //nome do db
    private static final String DICTIONARY_TABLE_CREATE =       // texto padrao de criacao do db
            "CREATE TABLE " + DICTIONARY_TABLE_NAME + " (" +
            " NOME TEXT, " +
            " VALOR TEXT);";

    public BdHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DICTIONARY_TABLE_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
