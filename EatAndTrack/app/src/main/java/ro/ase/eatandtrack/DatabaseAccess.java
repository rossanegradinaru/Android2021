package ro.ase.eatandtrack;

import android.content.Context;

import androidx.room.Room;

public class DatabaseAccess {
    private Database database;

    private DatabaseAccess(Context context){
        database = Room.databaseBuilder(context,Database.class,
                "dbmasuratori").allowMainThreadQueries().build();
    }

    private static DatabaseAccess instance;

    public static DatabaseAccess getInstance(Context context){
        if(instance == null){
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public Database getDatabase(){
        return database;
    }
}

