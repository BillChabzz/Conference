package bill.conf.fragz.conference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

/**
 * Created by bill on 10/29/15.
 */
public class Speakerlist extends Activity{
    Button v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speaker_list);



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent n = new Intent(Speakerlist.this,EventKeyDetail.class);
        startActivity(n);
    }
}
