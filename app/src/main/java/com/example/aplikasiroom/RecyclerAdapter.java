package com.example.aplikasiroom;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

	private Context context;
//	private ArrayList mhs_id, mhs_nama, mhs_nim, mhs_semester;
	List<MainData> dataList;
	int position;
	Activity activity;
	RoomDB database;

	RecyclerAdapter(Activity activity, Context context, List<MainData> dataList){
		this.activity = activity;
		this.context = context;
		this.dataList = dataList;
		notifyDataSetChanged();
	}


	@NonNull
	@Override
	public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(R.layout.my_row, parent, false);
		return new MyViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
		this.position = position;

		MainData data = dataList.get(position);
		database = RoomDB.getInstance(context);

		holder.mhs_id.setText(String.valueOf(data.getID()));
		holder.mhs_nama.setText(String.valueOf(data.getNamaMhs()));
		holder.mhs_nim.setText(String.valueOf(data.getNimMhs()));
		holder.mhs_semester.setText("Semester " + String.valueOf(data.getSemesterMhs()));
		holder.rowLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(context, UpdateActivity.class);
				intent.putExtra("id", String.valueOf(data.getID()));
				intent.putExtra("nama", String.valueOf(data.getNamaMhs()));
				intent.putExtra("nim", String.valueOf(data.getNimMhs()));
				intent.putExtra("semester", String.valueOf(data.getSemesterMhs()));
				activity.startActivityForResult(intent, 1);
//				context.startActivity(intent);
			}
		});

	}

	@Override
	public int getItemCount() {
		return dataList.size();
	}

	public class MyViewHolder extends RecyclerView.ViewHolder{

		TextView mhs_id, mhs_nama, mhs_nim, mhs_semester;
		LinearLayout rowLayout;

		public MyViewHolder(@NonNull View itemView) {
			super(itemView);
			mhs_id = itemView.findViewById(R.id.mhs_id);
			mhs_nama = itemView.findViewById(R.id.mhs_nama);
			mhs_nim = itemView.findViewById(R.id.mhs_nim);
			mhs_semester = itemView.findViewById(R.id.mhs_semester);
			rowLayout = itemView.findViewById(R.id.rowLayout);

		}
	}
}
