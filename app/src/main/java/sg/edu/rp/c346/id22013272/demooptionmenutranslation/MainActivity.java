package sg.edu.rp.c346.id22013272.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import sg.edu.rp.c346.id22013272.demooptionmenutranslation.R;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.textView);

        //other working code
        registerForContextMenu(tvTranslatedText);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
            if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
                //code for action
                tvTranslatedText.setText("Hello");
                //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();

                return true; //menu item successfully handled
            } else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText.setText("Ciao");
                //Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();

                return true;  //menu item successfully handled
            }
            return false;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvTranslatedText.setText("Hello ");
            return true;
        } else if (id == R.id.italianSelection) {
            tvTranslatedText.setText("Ciao");
            return true;
        } else {
            tvTranslatedText.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }
}

