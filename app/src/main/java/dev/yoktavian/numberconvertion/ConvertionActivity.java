package dev.yoktavian.numberconvertion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import dev.yoktavian.currencylib.ConvertNumber;
import dev.yoktavian.currencylib.ConvertNumber.currency;
import dev.yoktavian.currencylib.ConvertNumber.separator;

public class ConvertionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertion);
        TextView mPrice = (TextView) findViewById(R.id.text_label_result);
        mPrice.setText(ConvertNumber.formatCurrency(
            this, currency.JPY, separator.DOT, 2000000));
    }
}
