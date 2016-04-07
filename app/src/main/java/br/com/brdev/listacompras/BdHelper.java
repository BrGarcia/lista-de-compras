package br.com.brdev.listacompras;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BdHelper extends SQLiteOpenHelper{
    
    // Informacoes da tabela
    public static final String TABLE_PRODUTO = "produtos";
    public static final String PRODUTO_ID = "_id";
    public static final String PRODUTO_NOME = "nome";

    // informacoes da basede dados
    static final String DB_NOME = "DB_PRODUTO";
    static final int DB_VERSAO = 1;

    private static final String CREATE_TABLE = "create table "
            + TABLE_PRODUTO + "(" + PRODUCTO_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PRODUTO_NOME + " TEXT NOT NULL);";

    public BdHelper(Context context) {
        super(context, DB_NOME, null,DB_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

     @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCT);
        onCreate(db);
    }
}
