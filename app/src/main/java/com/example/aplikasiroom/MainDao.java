package com.example.aplikasiroom;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MainDao {
	@Insert(onConflict = REPLACE)
	void insert(MainData mainData);

	@Delete
	void delete(MainData mainData);

	@Query("UPDATE tb_mahasiswa SET namaMhs = :sNamaMhs, nimMHS = :sNimMhs, semesterMhs =:sSemesterMhs WHERE ID =:sID")
	void update(int sID, String sNamaMhs, String sNimMhs, String sSemesterMhs);

	@Query("SELECT * FROM tb_mahasiswa")
	List<MainData> getAll();
}
