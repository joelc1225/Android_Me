package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by joelcamargo on 10/6/17.
 */

public class BodyPartFragment extends Fragment {

    // Mandatory constructor for instantiating the fragment
    public BodyPartFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // inflate the fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // get a reference to the imageview in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        // set the image resource to display
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        // return root view
        return rootView;
    }
}
