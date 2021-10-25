package com.example.aplikasiroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class AddActivity extends AppCompatActivity {

	EditText inputNamaMhs, inputNIMMhs, inputSemesterMhs;
	Button addButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);

		inputNamaMhs = findViewById(R.id.inputNamaMhs);
		inputNIMMhs = findViewById(R.id.inputNIMMhs);
		inputSemesterMhs = findViewById(R.id.inputSemesterMhs);

		addButton = findViewById(R.id.buttonAddMhs);

		addButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				MainDao mainDao = new MainDao() {
					@Override
					public void insert(MainData mainData) {

					}

					@Override
					public void delete(MainData mainData) {

					}

					@Override
					public void update(int sID, String sNamaMhs, String sNimMhs, String sSemesterMhs) {

					}

					@Override
					public List<MainData> getAll() {
						return null;
					}
				};
			}
		});

	}
}