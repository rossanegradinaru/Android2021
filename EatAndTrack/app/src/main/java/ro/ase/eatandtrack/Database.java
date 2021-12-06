package ro.ase.eatandtrack;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Masuratori.class},version = 1,exportSchema = false)
public abstract class Database extends RoomDatabase {

    public abstract MasuratoriDao masuratoriDao();
}
