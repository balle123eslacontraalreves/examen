package com.example.eduardoballe.examenballe_califiqueconpiedad;

import java.util.ArrayList;

public class ListDataHelper {


        public static ArrayList<ListViewItem> provideItems(){
            ArrayList<ListViewItem> list = new ArrayList<>();

            list.add(new ListViewItem(R.drawable.bolita1, "HOLO BLUE BRIGHT", android.R.color.holo_blue_bright));
            list.add(new ListViewItem(R.drawable.bolita2, "HOLO BLUE LIGHT",android.R.color.holo_blue_dark));
            list.add(new ListViewItem(R.drawable.bolita3, "HOLO GREEN LIGHT",android.R.color.holo_blue_light));
            list.add(new ListViewItem(R.drawable.bolita4, "HOLO ORANGE LIGHT",android.R.color.holo_green_dark));
            list.add(new ListViewItem(R.drawable.bolita5, "HOLO RED LIGHT",android.R.color.holo_green_dark));
            list.add(new ListViewItem(R.drawable.bolita6, "HOLO PURPLE",android.R.color.holo_orange_dark));
            list.add(new ListViewItem(R.drawable.bolita7, "HOLO BLUE dark",android.R.color.holo_orange_light));
            list.add(new ListViewItem(R.drawable.bolita8, "HOLO GREEN dark",android.R.color.holo_red_dark));
            list.add(new ListViewItem(R.drawable.bolita9, "HOLO RED dark",android.R.color.holo_purple));
            list.add(new ListViewItem(R.drawable.bolita10, "HOLO ORANGE dark",android.R.color.holo_purple));

            return list;
        }

    }


