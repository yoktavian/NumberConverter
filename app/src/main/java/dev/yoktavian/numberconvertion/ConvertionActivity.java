package dev.yoktavian.numberconvertion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import dev.yoktavian.currencylib.ConvertNumber;

public class ConvertionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertion);
        TextView mLabel = (TextView) findViewById(R.id.text_label_result);
        mLabel.setText(ConvertNumber.formatCurrency(this,
                ConvertNumber.formatCurrency.ID_FORMAT, 2000890));
    }
}
