package no2114_2106_2117_2129.project.sns_world;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    //C - 네비게이션뷰 선언
    BottomNavigationView mainBottomNavigationView;
    // C - 플레그먼트 선언
    Fragment groupMainPageFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Y - 커밋 확인용
        // G - 커밋 확인용

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // C - 플레그먼트 정의
        groupMainPageFragment = new GroupMainPageFragment();
        // C - 네비게이션 버튼 정의
        mainBottomNavigationView = findViewById(R.id.main_bottom_navigation_view);
 /*       LinearLayout layout = findViewById(R.id.top_linear_layout);
        layout.setVisibility(View.GONE);*/
        // C - 플레그 먼트 띄우기
        getSupportFragmentManager().beginTransaction().add(R.id.main_frame_layout, groupMainPageFragment).commitAllowingStateLoss();
    }
}