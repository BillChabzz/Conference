package bill.conf.fragz.conference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

/**
 * Created by bill on 10/29/15.
 */
public class Agenda extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agenda);

        CardView v=(CardView)findViewById(R.id.card_view);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Agenda.this,Agendadetail.class);
                startActivity(c);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent m = new Intent(Agenda.this,EventKeyDetail.class);
        startActivity(m);
    }
}

