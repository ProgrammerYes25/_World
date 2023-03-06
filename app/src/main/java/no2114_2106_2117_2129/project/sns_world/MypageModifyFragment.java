package no2114_2106_2117_2129.project.sns_world;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

public class MypageModifyFragment extends Fragment {

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



        return view;
    }
}