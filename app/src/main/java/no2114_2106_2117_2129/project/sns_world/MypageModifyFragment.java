package no2114_2106_2117_2129.project.sns_world;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MypageModifyFragment extends Fragment implements View.OnClickListener {

    // Y - 수정하기 text view 선언
    TextView myProfileModifyTextView;
    // Y - 전체 보기 text view 선언
    TextView allViewTextView;

    // Y - 자기 설명 edit text 선언
    EditText nameEditText;  // Y - 이름 edit text
    EditText ageEditText;   // Y - 나이 edit text
    EditText interestEditText;  // Y - 관심사 edit text
    EditText myProfileEditText; // Y - 자기소개 한 마디 edit text

    // Y - 성별 spinner 선언
    Spinner genderSpinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View 객체 정의
        View view = inflater.inflate(R.layout.fragment_my_page_modify, container, false);

        // Y - 수정하기 텍스트뷰 초기화
        myProfileModifyTextView = view.findViewById(R.id.my_profile_modify_text_view);
        // Y - 수정하기 버튼 클릭 리스너
        myProfileModifyTextView.setOnClickListener(this);

        // Y - 전체 보기 텍스트뷰 초기화
        allViewTextView = view.findViewById(R.id.all_view_text_view);
        // Y - 전체 보기 버튼 클릭 리스너
        allViewTextView.setOnClickListener(this);

        return view;
    }

    // Y - 수정하기 버튼 이벤트
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            // Y - 수정하기 버튼
            case R.id.my_profile_modify_text_view:
                Toast.makeText(getActivity(), "수정 완료", Toast.LENGTH_LONG).show();
            // Y - 전체 보기 버튼
            case R.id.all_view_text_view:
                Intent intent = new Intent(getActivity(), MypageListActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
        }
    }
}