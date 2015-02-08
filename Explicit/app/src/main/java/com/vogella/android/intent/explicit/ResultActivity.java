package com.vogella.android.intent.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Cilvia on 7/2/2015.
 */
public class ResultActivity extends Activity{
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        bundle = getIntent().getExtras();
        String value = bundle.getString("myKey");
        TextView text = (TextView) findViewById(R.id.displayintentextra);
        text.setText(value);
    }

    @Override
    public void finish() {
        Intent in = new Intent(this, ResultActivity.class);
        EditText edit = (EditText) findViewById(R.id.returnValue);
        String extra = edit.getText().toString();
        in.putExtra("returnkey",extra);
        setResult(RESULT_OK, in);
        super.finish();
    }
}
