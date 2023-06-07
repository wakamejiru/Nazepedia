package com.example.nazepedia.ui.bbs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.nazepedia.databinding.FragmentBbsBinding;

public class BbsFragment extends Fragment {

    private FragmentBbsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BbsViewModel bbsViewModel =
                new ViewModelProvider(this).get(BbsViewModel.class);

        binding = FragmentBbsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // WebViewを表示
        final WebView webView = binding.bbsView;
        String Keijibvann_URL = "https://nazeru.jimdofree.com/%E9%97%87%E3%81%AE%E6%8E%B2%E7%A4%BA%E6%9D%BF/";
        webView.loadUrl(Keijibvann_URL);

        /*
        final TextView textView = binding.textDashboard;
        bbsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        */
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}