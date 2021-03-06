package com.example.changoo.mafia.Database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by changoo on 2016-12-11.
 */

public class HiddenChatDBOpenHelper extends SQLiteOpenHelper {

    public HiddenChatDBOpenHelper(Context context, String name, int version) {
        super(context, name, null, version);
    }

    public HiddenChatDBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public HiddenChatDBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table hiddenchats (";
        sql += "name text,";
        sql += "emoticonID int,";
        sql += "text text,";
        sql += "type int";
        sql += ");";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table hiddenchats");
        onCreate(db);
    }
}
