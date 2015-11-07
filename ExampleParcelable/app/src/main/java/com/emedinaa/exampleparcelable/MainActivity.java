package com.emedinaa.exampleparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.emedinaa.exampleparcelable.model.PersonEntity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tviParcelable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendParcelable();
            }
        });
    }

    private void sendParcelable() {

        PersonEntity personEntity= new PersonEntity();
        personEntity.setId(100);
        personEntity.setName("Eduardo Medina");

        Intent intent= new Intent(this,DashboardActivity.class);
        intent.putExtra("ENTITY", personEntity);
        startActivity(intent);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
