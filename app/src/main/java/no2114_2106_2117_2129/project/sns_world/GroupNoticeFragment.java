package no2114_2106_2117_2129.project.sns_world;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GroupNoticeFragment extends Fragment implements View.OnClickListener{

    // Y - MY 알림 text view 선언
    TextView myNoticeTextView;

    // Y - 모두 지우기 text view 선언
    TextView allRemoveTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View 객체 정의
        View view = inflater.inflate(R.layout.fragment_group_notice, container, false);

        // Y - MY 알림 text view 초기화
        myNoticeTextView = view.findViewById(R.id.my_notice_text_view);
        // Y - MY 알림 버튼 클릭 리스너
        myNoticeTextView.setOnClickListener(this);

        // Y - 모두 지우기 text view 초기화
        allRemoveTextView = view.findViewById(R.id.all_remove_text_view);
        // Y - 모두 지우기 버튼 클릭 리스너
        allRemoveTextView.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_notice_text_view:
                Intent myNoticeIntent = new Intent(getActivity(), MyNoticeActivity.class);
                myNoticeIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(myNoticeIntent);
        }
    }
}