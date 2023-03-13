package no2114_2106_2117_2129.project.sns_world;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyNoticeActivity extends AppCompatActivity {

    // Y - 그룹 알림 text view 선언
    TextView groupNoticeTextView;

    // Y - 모두 지우기 text view 선언
    TextView allRemoveTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_my_notice);

        // Y - MY 알림 text view 초기화
        groupNoticeTextView = findViewById(R.id.group_notice_text_view);
        // Y - MY 알림 버튼 클릭 리스너
        groupNoticeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent groupNoticeIntent = new Intent(getApplicationContext(), GroupNoticeFragment.class);
                startActivity(groupNoticeIntent);
            }
        });

        // Y - 모두 지우기 text view 초기화
        allRemoveTextView = findViewById(R.id.all_remove_text_view);
        // Y - 모두 지우기 버튼 클릭 리스너
//        allRemoveTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }
}