package com.goodtimedesigns.chenoarally;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class ClueListActivityFragment extends Fragment {

    public ClueListActivityFragment() {
    }

    ArrayAdapter<String> adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

    View rootView = inflater.inflate(R.layout.fragment_clue_list, container, false);


    Resources res = getResources();
    String[] clues = res.getStringArray(R.array.checkpoint_1_clues);
    List<String> weekForecast = new ArrayList<String>(Arrays.asList(clues));


        adapter =
                new ArrayAdapter<String>(
                        getActivity(), // The current context (this activity)
                        R.layout.fragment_clue_list_item, // The name of the layout ID.
                        R.id.text1, // The ID of the textview to populate.
                        weekForecast);


        ListView lv = (ListView)rootView.findViewById(R.id.clueListView);
        lv.setAdapter(adapter);


        return rootView;


        }
}
