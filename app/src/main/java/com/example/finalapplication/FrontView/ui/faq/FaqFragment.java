package com.example.finalapplication.FrontView.ui.faq;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.finalapplication.FrontView.DriverHistoryVerifyActivity;
import com.example.finalapplication.FrontView.FAQActivity;
import com.example.finalapplication.FrontView.ui.driverhistory.DriverhistoryViewModel;
import com.example.finalapplication.R;

public class FaqFragment  extends Fragment {

    private FaqViewModel faqViewModel;
    Context context;
//    Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        faqViewModel =
                new ViewModelProvider(this).get(FaqViewModel.class);

        final View root = inflater.inflate(R.layout.fragment_faq, container, false);
        context =root.getContext();
        //final TextView textView = root.findViewById(R.id.button10);
        final Button button = root.findViewById(R.id.button17);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FAQActivity.class);
                startActivity(intent);
            }
        });


        faqViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                startActivity(new Intent(getActivity(), CostEstimationActivity1.class));
//                textView.setText(s);
            }

        });
        return root;
    }



}