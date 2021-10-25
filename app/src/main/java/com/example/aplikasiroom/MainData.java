package com.example.aplikasiroom;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

//Mendefinisikan Tabel Mahasiswa
@Entity(tableName = "tb_mahasiswa")
public class MainData implements Serializable {
	@PrimaryKey(autoGenerate = true)
	private int ID;

	@ColumnInfo(name="namaMhs")
	private String namaMhs;

	@ColumnInfo(name="nimMhs")
	private String nimMhs;

	@ColumnInfo(name="semesterMhs")
	private String semesterMhs;

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNamaMhs() {
		return namaMhs;
	}

	public void setNamaMhs(String namaMhs) {
		this.namaMhs = namaMhs;
	}

	public String getNimMhs() {
		return nimMhs;
	}

	public void setNimMhs(String nimMhs) {
		this.nimMhs = nimMhs;
	}

	public String getSemesterMhs() {
		return semesterMhs;
	}

	public void setSemesterMhs(String semesterMhs) {
		this.semesterMhs = semesterMhs;
	}
}
