package tw.brad.fragmenttest1;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class F3 extends Fragment {
    private View mainView;
    private MainActivity activity;
    private boolean isBrad;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (MainActivity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_f3, container, false);

        mainView.findViewById(R.id.f3_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeMainTitle();
            }
        });

        return mainView;
    }

    private void changeMainTitle(){
        isBrad = !isBrad;
        activity.setTitle(isBrad?"Brad":"資策會");
    }

}
