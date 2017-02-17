package untitledbp.unasat.sr.untitledbp.db.schema;


import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.SchemaCategory.CAT_ID;
import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.SchemaCategory.CAT_TABLE;
import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.SchemaTransaction.TRAN_ID;
import static untitledbp.unasat.sr.untitledbp.db.schema.Schema.SchemaUser.USER_ID;

/**
 * Created by Jair on 2/16/2017.
 */

public class Schema {

    public static final String DATABASE_NAME = "untitledBP_database.db";
    public static final int DATABASE_VERSION = 1;


    public class SchemaUser {

        public static final String USER_TABLE = "user_table";
        public static final String USER_ID = "user_id";
        public static final String USERNAME = "username";
        public static final String PASSWORD = "password";
        public static final String NAME_USER = "name_user";
        public static final String SURNAME = "surname";
        public static final String EMAIL = "email";
        public static final String CREATED = "created";
        public static final String DELETED = "deleted";

        public static final String CREATE_USERTABLE =
                "create table "+USER_TABLE+" ( "+ USER_ID +" integer primary key, "
                                +USERNAME+" string not null unique, "
                                +PASSWORD+" string not null, "
                                +NAME_USER+" string , "
                                +SURNAME+" string , "
                                +EMAIL+" string , "
                                +CREATED+" string not null, "
                                +DELETED+" string); ";

        public static final String DROP_USERTABLE = "drop table if exists "+USER_TABLE;

}

    public class SchemaCategory {
        public static final String CAT_TABLE = "category_table";
        public static final String CAT_ID = "cat_id";
        public static final String CAT_NAME = "cat_name";
        public static final String CAT_DESCR = "cat_descr";
        public static final String BUDGET = "budget";

        public static final String CREATE_CATTABLE =
                "create table "+CAT_TABLE+" ( "+CAT_ID+" integer primary key, "
                        + CAT_NAME +" string not null unique, "
                        + CAT_DESCR +" string , "
                        + BUDGET +" string, "
                        +USER_ID +" string not null, "
                        +"FOREIGN KEY ("+USER_ID+") REFERENCES "+CAT_TABLE+"("+USER_ID+"); ";

        public static final String DROP_CATTABLE = "drop table if exists "+CAT_TABLE;
    }

    public class SchemaTransaction {
        public static final String TRAN_TABLE = "tran_table";
        public static final String TRAN_ID = "tran_id";
        public static final String TRAN_NAME = "tran_name";
        public static final String TRAN_DESCR = "tran_descr";
        public static final String TRAN_AMOUNT = "tran_amount";
        public static final String DATE = "date";

        public static final String CREATE_TRANTABLE =
                "create table "+TRAN_TABLE+" ( "+TRAN_ID+" integer primary key, "
                        + TRAN_NAME +" string, "
                        + TRAN_DESCR +" string, "
                        + TRAN_AMOUNT +" double, "
                        +DATE +" string not null, "
                        +CAT_ID +" integer, "
                        +"FOREIGN KEY ("+CAT_ID+") REFERENCES "+CAT_TABLE+"("+CAT_ID+"); ";

        public static final String DROP_TRANTABLE = "drop table if exists "+TRAN_TABLE;

    }

    public class SchemaBalance {
        public static final String BAL_TABLE = "balance_table";
        public static final String BAL_ID = "bal_id";
        public static final String OPENING = "opening";
        public static final String TRANSACTIONS = "transactions";
        public static final String CLOSING = "closing";


        public static final String CREATE_BALTABLE =
                "create table "+ BAL_TABLE +" ( "+ BAL_ID +" integer primary key, "
                        + OPENING +" double, "
                        + TRANSACTIONS +" double, "
                        + CLOSING +" double , "
                        +USER_ID+" integer); ";

        public static final String DROP_BALTABLE = "drop table if exists "+ BAL_TABLE;


    }

    public class SchemaReport {
        public static final String REP_TABLE = "user_table";
        public static final String REPORT_ID = "report_id";
        public static final String DAY = "username";
        public static final String WEEK = "password";
        public static final String MONTH = "name_user";
        public static final String YEAR = "surname";

        public static final String CREATE_REPTABLE =
                "create table "+ REP_TABLE +" ( "+ REPORT_ID +" integer primary key, "
                        + DAY +" integer, "
                        + WEEK +" integer, "
                        + MONTH +" integer, "
                        + YEAR +" integer, "
                        +USER_ID+" integer , "
                        +TRAN_ID+" integer, "
                        +CAT_ID+" integer); ";

        public static final String DROP_REPTABLE = "drop table if exists "+ REP_TABLE;

    }

}
