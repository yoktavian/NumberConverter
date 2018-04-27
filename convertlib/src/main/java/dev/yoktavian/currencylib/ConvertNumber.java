package dev.yoktavian.currencylib;

import android.content.Context;
import android.content.res.Resources;
import java.text.NumberFormat;

public class ConvertNumber {
    public enum formatCurrency {
        ID_FORMAT {
            @Override
            public String toString() {
                return "Rp ";
            }
        },
        US_FORMAT {
            @Override
            public String toString() {
                return "$ ";
            }
        }
    }

    public static int convertDpToPx(int dpSize) {
        return (int) (dpSize * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int converPxToDp(int pxSize) {
        return (int) (pxSize / Resources.getSystem().getDisplayMetrics().density);
    }

    public static String formatCurrency(Context context, formatCurrency format, int number) {
        return context.getString(R.string.currency_format, format.toString(),
                NumberFormat.getInstance().format(number));
    }
}
