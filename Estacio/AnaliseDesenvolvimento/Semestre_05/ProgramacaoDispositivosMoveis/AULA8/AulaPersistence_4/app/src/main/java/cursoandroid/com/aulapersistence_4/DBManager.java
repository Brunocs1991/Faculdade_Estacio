package cursoandroid.com.aulapersistence_4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DBManager {
    private DBHelper dbHelper;
    private Context context;
    private SQLiteDatabase database;

    public DBManager(Context c){
        context = c;
    }
    public DBManager open() throws SQLException {
        dbHelper = new DBHelper(context);
        database = dbHelper.getWritableDatabase();
        return this;
    }
    public void close(){
        dbHelper.close();
    }
    public void insert(String name,String desc){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBHelper.NOME, name);
        contentValues.put(DBHelper.EMAIL, desc);
        database.insert(DBHelper.NOME_TABELA,null, contentValues);
    }
    public Cursor fetch(){
        String[] colunns = new String[]{
                DBHelper._ID, DBHelper.NOME, DBHelper.EMAIL
        };
        Cursor cursor =  database.query(DBHelper.NOME_TABELA,colunns, null, null, null, null
        , null);
        if(cursor != null){
            cursor.moveToFirst();
        }
        return cursor;
    }
    public int update (long _id, String nome, String desc){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBHelper.NOME, nome);
        contentValues.put(DBHelper.EMAIL, desc);
        int i = database.update(DBHelper.NOME_TABELA, contentValues, DBHelper._ID + " =" + _id, null);
        return i;
    }
    public void delete(long _id){
        database.delete(DBHelper.NOME_TABELA, DBHelper._ID + " =" + _id, null);
    }
}
