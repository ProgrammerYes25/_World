package no2114_2106_2117_2129.project.sns_world;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    //C - 네비게이션뷰 선언
    BottomNavigationView mainBottomNavigationView;
    // C - 플레그먼트 선언
    // c - 순서대로 아지트, MY페이지, 알림, 귓속말, 검색
    Fragment groupMainPageFragment, myPageModifyFragment, groupNoticeFragment, whisperingListFragment, SearchPageFragment;
    LinearLayout topLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Y - 커밋 확인용
        // G - 커밋 확인용

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // C - 플레그먼트 정의
        SearchPageFragment = new SearchPageFragment();
        groupMainPageFragment = new GroupMainPageFragment();
        myPageModifyFragment = new MypageModifyFragment();
        groupNoticeFragment = new GroupNoticeFragment();
        whisperingListFragment = new WhisperingListFragment();

        topLayout = findViewById(R.id.top_linear_layout);

        // C - 네비게이션 버튼 정의
        mainBottomNavigationView = findViewById(R.id.main_bottom_navigation_view);

        // C - 플레그 먼트 띄우기
        getSupportFragmentManager().beginTransaction().add(R.id.main_frame_layout, groupMainPageFragment).commitAllowingStateLoss();

        // C - 네비게이션 버튼 기능구현
        mainBottomNavigationView.setOnNavigationItemSelectedListener( mainNavigationItemSelectedListener);
    }
    BottomNavigationView.OnNavigationItemSelectedListener  mainNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.search_item:
                    topLayout.setVisibility(View.GONE);
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame_layout, SearchPageFragment).commitAllowingStateLoss();
                    break;
                case R.id.notice_item:
                    topLayout.setVisibility(View.GONE);
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame_layout, groupNoticeFragment).commitAllowingStateLoss();
                    break;
                case R.id.group_item:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame_layout, groupMainPageFragment).commitAllowingStateLoss();
                    break;
                case R.id.my_item:
                    topLayout.setVisibility(View.GONE);
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame_layout, myPageModifyFragment).commitAllowingStateLoss();
                    break;
                case R.id.chat_item:
                    topLayout.setVisibility(View.GONE);
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame_layout, whisperingListFragment).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    };
}