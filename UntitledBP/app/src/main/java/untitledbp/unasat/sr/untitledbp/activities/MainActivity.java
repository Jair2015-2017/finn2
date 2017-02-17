package untitledbp.unasat.sr.untitledbp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import untitledbp.unasat.sr.untitledbp.R;
import untitledbp.unasat.sr.untitledbp.db.dao.Dao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dao dao = new Dao(this);

    }
}
