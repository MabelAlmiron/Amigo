package pys.edu.facitec.amigos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView amigosListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amigosListView = (ListView) findViewById(R.id.listViewAmigos);
        List<Amigos> amigos  = AmigosDataProvider.getAmigos();
        AmigosAdapter adapter = new AmigosAdapter(amigos, getApplicationContext());
        amigosListView.setAdapter(adapter) ;
    }
}
