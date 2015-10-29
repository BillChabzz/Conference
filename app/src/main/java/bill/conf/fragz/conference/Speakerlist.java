package bill.conf.fragz.conference;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by bill on 10/29/15.
 */
public class Speakerlist extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speaker_rlist);

        RecyclerView rv =(RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        LinearLayoutManager linearlayoutmanager= new LinearLayoutManager(this);
        rv.setLayoutManager(linearlayoutmanager);
    }
}
