package bill.conf.fragz.conference;

import android.support.v7.app.ActionBar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by bill on 10/29/15.
 */
public class Agenda extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agenda);
        Toolbar myToolbar=(Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

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

