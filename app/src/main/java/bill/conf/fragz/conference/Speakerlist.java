package bill.conf.fragz.conference;

import  android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;


/**
 * Created by bill on 10/29/15.
 */
public class Speakerlist extends AppCompatActivity{
    Button v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speaker_list);
        Toolbar myToolbar=(Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent n = new Intent(Speakerlist.this,EventKeyDetail.class);
        startActivity(n);
    }
}
