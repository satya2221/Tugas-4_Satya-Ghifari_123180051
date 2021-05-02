package com.example.tugas_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class TeamDetail extends AppCompatActivity {
    TextView teamName, teamDetail;
    ImageView logo, ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_detail);

        teamName = findViewById(R.id.team_name);
        teamDetail = findViewById(R.id.team_detail);
        logo = findViewById(R.id.logo);
        ivBack = findViewById(R.id.iv_back);

        teamName.setText(getIntent().getStringExtra("name"));
        teamDetail.setText(getIntent().getStringExtra("detail"));

        Glide.with(getApplicationContext())
                .load(getIntent().getStringExtra("photo"))
                .into(logo);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeamDetail.this, MainActivity.class);
                startActivity(intent);
                finish(); // Fungsi penempatan finish() disini agar ketika kita tidak kembali ke laman DetailActivity setelah pindah ke MainActivity
            }
        });
    }
}