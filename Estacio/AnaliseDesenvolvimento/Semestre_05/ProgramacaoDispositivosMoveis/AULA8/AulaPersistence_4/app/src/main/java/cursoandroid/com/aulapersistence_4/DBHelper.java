package cursoandroid.com.aulapersistence_4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String NOME_TABELA = "PESSOAS";
    public static final String _ID = "_id";
    public static final String NOME = "subject";
    public static final String EMAIL = "description";

    static final String NOME_BANCO = "BANCO.DB";
    static final int VERSAO_BANCO = 1;

    private static final String CREATE_TABLE = "create table " + NOME_TABELA + "(" + _ID +
            " INTEGER PRIMARY KEY AUTOINCREMENT, " + NOME + " TEXT NOT NULL, " + EMAIL + " TEXT);";
    public DBHelper(Context context){
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + NOME_TABELA);
        onCreate(db);
    }
}
