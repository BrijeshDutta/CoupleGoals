package couplegoals.com.couplegoals.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import couplegoals.com.couplegoals.R;
import couplegoals.com.couplegoals.database.DatabaseValues;

public class BaseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewBaseFragment = inflater.inflate(R.layout.fragment_base, container, false);

        return viewBaseFragment;
    }
}
