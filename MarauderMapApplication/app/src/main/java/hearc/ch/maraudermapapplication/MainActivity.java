package hearc.ch.maraudermapapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import hearc.ch.maraudermapapplication.createmap.CreateMapActivity;
import hearc.ch.maraudermapapplication.settings.SettingsActivity;
import hearc.ch.maraudermapapplication.viewmap.ShowAllMapActivity;
import hearc.ch.maraudermapapplication.viewmap.VisualisationPlanActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void createNewMap(View v)
    {
        Intent intent = new Intent(this, CreateMapActivity.class);
        startActivity(intent);
    }

    public void sawAllMaps(View v)
    {
        Intent intent = new Intent(this, ShowAllMapActivity.class);
        startActivity(intent);
    }
}
