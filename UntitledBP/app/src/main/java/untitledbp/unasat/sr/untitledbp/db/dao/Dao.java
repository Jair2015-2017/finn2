package untitledbp.unasat.sr.untitledbp.db.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.DATABASE_NAME;
import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.DATABASE_VERSION;
import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.SchemaBalance.CREATE_BALTABLE;
import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.SchemaCategory.CREATE_CATTABLE;
import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.SchemaReport.CREATE_REPTABLE;
import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.SchemaTransaction.CREATE_TRANTABLE;
import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.SchemaUser.CREATE_USERTABLE;

/**
 * Created by Jair on 2/16/2017.
 */

public class Dao extends SQLiteOpenHelper{

    public Dao(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_USERTABLE);
        db.execSQL(CREATE_TRANTABLE);
        db.execSQL(CREATE_CATTABLE);
        db.execSQL(CREATE_BALTABLE);
        db.execSQL(CREATE_REPTABLE);

       // setDefaultCategories();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void setDefaultCategories() {


    }
    //methods to use db


}
