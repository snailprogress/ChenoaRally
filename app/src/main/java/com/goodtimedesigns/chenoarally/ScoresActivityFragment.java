package com.goodtimedesigns.chenoarally;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class ScoresActivityFragment extends Fragment {

    public ScoresActivityFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        View rootView2 = inflater.inflate(R.layout.fragment_scores, container, false);
        View rootView2 = inflater.inflate(R.layout.fragment_scores, container, false);

        Resources res = getResources();
        String[] clues = res.getStringArray(R.array.checkpoint_1_clues);
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(clues));
 //       ListView list = (ListView)rootView2.findViewById(R.id.scoresListView);
        ListView list = (ListView)rootView2.findViewById(R.id.scoresListView);
//        ArrayList<HashMap<String, String>> mylistData = new ArrayList<HashMap<String, String>>();

//        String[] columnTags = new String[] {"col1", "col2", "col3", "col4"};
        String[] columnTags = new String[] {"col1", "col2", "col3", "col4"};

//        int[] columnIds = new int[] {R.id.checkpointNum, R.id.checkpointMiles, R.id.checkpointMinutes, R.id.checkpointScore};
        int[] columnIds = new int[] {R.id.checkpointNum, R.id.checkpointMiles, R.id.checkpointMinutes, R.id.checkpointScore};


        List<HashMap<String, String>> fullMap = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("col1", "1");
        map.put("col2", "10 miles");
        map.put("col3", "15 min");
        map.put("col4", "87");
        fullMap.add(map);

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("col1", "2");
        map2.put("col2", "18 miles");
        map2.put("col3", "27 min");
        map2.put("col4", "64");
        fullMap.add(map2);


        HashMap<String, String> map3 = new HashMap<String, String>();
        map3.put("col1", "3");
        map3.put("col2", "9 miles");
        map3.put("col3", "18 min");
        map3.put("col4", "22");
        fullMap.add(map3);

        HashMap<String, String> map4 = new HashMap<String, String>();
        map4.put("col1", "4");
        map4.put("col2", "0 miles");
        map4.put("col3", "0 min");
        map4.put("col4", "0");
        fullMap.add(map4);

        HashMap<String, String> map5 = new HashMap<String, String>();
        map5.put("col1", "5");
        map5.put("col2", "0 miles");
        map5.put("col3", "0 min");
        map5.put("col4", "0");
        fullMap.add(map5);


//        for(int i=0; i<4; i++)
//        {
//            HashMap<String,String> map = new HashMap<String, String>();
//            //initialize row data
//            for(int j=0; j<=3; j++)
//            {
//                map.put(columnTags[j], "test"+j);
//            }
//            mylistData.add(map);
//        }
//        SimpleAdapter arrayAdapter =
//                new SimpleAdapter(getActivity(), mylistData, R.layout.fragment_clue_list_item,
//                        columnTags , columnIds);
//        list.setAdapter(arrayAdapter);

        SimpleAdapter adapter2 = new SimpleAdapter(getActivity(), fullMap, R.layout.fragment_scores_list_item, columnTags, columnIds);


//        List<String> values = new ArrayList<String>(Arrays.asList(clues));
//        adapter2 =
//                new ArrayAdapter<String>(
//                        getActivity(), // The current context (this activity)
//                        R.layout.fragment_scores_list_item, // The name of the layout ID.
//                        R.id.checkpointNum, // The ID of the textview to populate.
//                        weekForecast);


        list.setAdapter(adapter2);

        return rootView2;

    }
}
