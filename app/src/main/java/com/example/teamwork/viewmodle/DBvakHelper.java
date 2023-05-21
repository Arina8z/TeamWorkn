package com.example.teamwork.viewmodle;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

/*public class DBvakHelper extends SQLiteOpenHelper {
    // поля базы данных
    private Context context; // поле текущего контекста

    private static final String DBName = "MyVakcins"; // поле названия БД
    private static final int DatabaseVersion = 1; // поле версии БД

    private static final String tablName = "myVakcins"; // поле названия таблицы в БД
    private static final String columId = "id";  // поле колонки для идентификаторов записей в таблице в БД
    private static final String columTitle = "vaks";  // поле колонки для заголовков названий в таблице в БД
    private static final String columData = "data";

    // конструктор
    public DBvakHelper(@Nullable Context context) {
        // задание параметров (контекст, название БД, курсор, версия БД)
        super(context, DBName,null, DatabaseVersion);
        this.context = context;
    }
    // метод создания рабочей таблицы в БД
    @Override
    public void onCreate(SQLiteDatabase db) {
        // определение запроса на создание таблицы базы данных

        String query = "CREATE TABLE " + tablName +" (" + columId + " INTEGER PRIMARY KEY AUTOINCREMENT," + columTitle
                + " TEXT, " + columData + " TEXT);";
        db.execSQL(query);
        //Toast.makeText(context, "создана новая таблица", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tablName);
        // определение запроса на создание таблицы базы данных
        onCreate(db);
    }

    public void addVaks(String vaks, String data) {

        /** с помощью getWritableDatabase() мы проверяем есть ли подключение к БД,
         * если есть то им пользуемся, если нет то создаём новое
         */
    /*    SQLiteDatabase db = this.getWritableDatabase();

   /*     /** нужно создать объект класса ContentValues для добавления и обновления существующих записей БД,
         * Данный объект представляет словарь, который содержит набор пар "ключ-значение"
         * Для добавления в этот словарь нового объекта применяется метод put
         */
    /*    ContentValues cv = new ContentValues();

        cv.put(columTitle,vaks); // добавление заголовка записи
        cv.put(columData,data);

        // добавление новой записи в БД
        long resultValue = db.insert(tablName,null, cv);

        if (resultValue == -1){ // если resultValue возвращает -1, значит добавление записи в БД не удалось
            Toast.makeText(context, "Данные в БД не добавлены", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Данные в БД успешно добавлены", Toast.LENGTH_SHORT).show();
        }
    }
    public Cursor readVaks(){

        // формирование запроса к БД
        String query = "SELECT * FROM " + tablName;

        // метод getReadableDatabase() получает БД для чтения
        SQLiteDatabase database= this.getReadableDatabase();

        // создаём нулевой курсор
        Cursor cursor = null;

        if (database != null){ // если БД существует, то инициализируем курсор
            cursor = database.rawQuery(query,null);

        }

        // возврат курсора
        return cursor;
    }
    public void deleteAllVaks() {

        // проверка подключения к БД
        SQLiteDatabase database = this.getWritableDatabase();

        // формирование запроса удаления таблицы БД
        String query = "DELETE FROM " + tablName;
        database.execSQL(query);

    }
    public void updateVaks(String vaks, String data,  String id){

        // проверка подключения к БД
        SQLiteDatabase database =  this.getWritableDatabase();

        // создание контейнера для данных
        ContentValues cv = new ContentValues();
        // запись данных в контейнер
        cv.put(columTitle,vaks);
        cv.put(columData, data);



        // обновление записи по id, где в метод update() подаются
        // (название таблицы, данные для обновления, запись для проверки id, запись в текстовый массив id)
        long result  = database.update(tablName, cv,"id=?", new String[]{id});

        if (result == -1) {
            Toast.makeText(context, "Обновление не получилось", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Обновление прошло успешно", Toast.LENGTH_SHORT).show();
        }
    }
    public  void  deleteSingleItem(String id){

        // проверка подключения к БД
        SQLiteDatabase db = this.getWritableDatabase();

        // удаление записи по id, где в метод delete() подаются
        // (название таблицы, запись для проверки id, запись в текстовый массив id)
        long result = db.delete(tablName,"id=?", new String[]{id});

        if (result == -1) {
            Toast.makeText(context, "Запись не удалена", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Запись успешно удалена", Toast.LENGTH_SHORT).show();
        }
        db.close();
    }
}
*/

