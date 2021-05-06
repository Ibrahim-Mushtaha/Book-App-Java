package com.ix.ibrahim7.ps.text.bookappjava.db;

import android.provider.BaseColumns;

/**
 * Created by adewijanugraha on 13/02/18.
 */

public class DatabaseContract {

    static String TABLE_NOTE = "note";
    static final class NoteColumns implements BaseColumns {
        //Note title
        static String TITLE = "title";
        //Note description
        static String DESCRIPTION = "description";
        //Note date
        static String AUTHOR = "Author";
    }
}