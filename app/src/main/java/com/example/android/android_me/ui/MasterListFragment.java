package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by joelcamargo on 10/7/17.
 */

public class MasterListFragment extends Fragment {

    private static final String TAG = "MasterListFragment";

    //
    public MasterListFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        // get a reference to the gridview to populate with the images needed
        GridView gridView = (GridView) rootView.findViewById(R.id.gridView);

        // create the adapter
        MasterListAdapter masterListAdapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());

        // set the adapter onto the gridview
        gridView.setAdapter(masterListAdapter);

        return rootView;
    }
}
