package bill.conf.fragz.conference;


import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;


/**
 * Created by bill on 10/28/15.
 */
public class Speakers extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent b = new Intent(Speakers.this,EventKeyDetail.class);
        startActivity(b);
        finish();
    }
}
