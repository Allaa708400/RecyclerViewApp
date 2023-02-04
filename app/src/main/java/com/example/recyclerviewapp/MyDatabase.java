package com.example.recyclerviewapp;


import android.annotation.SuppressLint;
import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


@SuppressLint("Range")
public class MyDatabase extends SQLiteAssetHelper {

        public static final String DB_NAME = "cars.db";
        public static final int DB_VERSION = 1;
        public static final String CAR_TB_NAME = "car";
        public static final String CAR_CLN_ID = "id";
        public static final String CAR_CLN_MODEL = "model";
        public static final String CAR_CLN_COLOR = "color";
        public static final String CAR_CLN_DESCRIPTION = "description";
        public static final String CAR_CLN_IMAGE = "image";
        public static final String CAR_CLN_DPL = "distancePerLetter";
        public MyDatabase(Context context) {

            super(context, DB_NAME, null, DB_VERSION);
        }

    }








