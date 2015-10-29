package bill.conf.fragz.conference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by bill on 10/29/15.
 */
public class Agendadetail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agenda_detail);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent b = new Intent(Agendadetail.this,Agenda.class);
        startActivity(b);
    }
}
