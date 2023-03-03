package no2114_2106_2117_2129.project.sns_world;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
// C - 탐색
public class SearchPageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View 객체 정의
        View view = inflater.inflate(R.layout.fragment_search_page, container, false);

        return view;
    }
}
