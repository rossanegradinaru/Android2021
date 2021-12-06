package ro.ase.eatandtrack;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MasuratoriDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Masuratori ... masuratori);

    @Delete
    void delete(Masuratori masuratori);

    @Query("select * from masuratori")
    List<Masuratori> getAll();

    @Query("select * from masuratori where procentGrasimeCorporala>40")
    List<Masuratori> getAllProcent();


}