package dev.yoktavian.currencylib;

import android.content.Context;
import android.content.res.Resources;
import java.text.NumberFormat;
import java.util.Locale;

public class ConvertNumber {
    public enum currency {
        IDR {
            @Override
            public String toString() {
                return "Rp ";
            }
        },
        USD {
            @Override
            public String toString() {
                return "$ ";
            }
        },
        EUR {
            @Override
            public String toString() {
                return "€ ";
            }
        },
        CNY {
            @Override
            public String toString() {
                return "¥ ";
            }
        },
        JPY {
            @Override
            public String toString() {
                return "¥ ";
            }
        },
        MYR {
            @Override
            public String toString() {
                return "RM ";
            }
        },
        PHP {
            @Override
            public String toString() {
                return "₱ ";
            }
        },
        PLN {
            @Override
            public String toString() {
                return "zł ";
            }
        },
        SGD {
            @Override
            public String toString() {
                return "$ ";
            }
        }
    }

    public enum separator {
        COMMA, DOT
    }

    public static int convertDpToPx(int dpSize) {
        return (int) (dpSize * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int converPxToDp(int pxSize) {
        return (int) (pxSize / Resources.getSystem().getDisplayMetrics().density);
    }

    public static String formatCurrency(Context context, currency currencyFormat,
                                        separator separatorFormat, int number) {
        switch (separatorFormat) {
            case DOT:
                Locale idFormat = new Locale("in", "ID");
                return context.getString(R.string.currency_format, currencyFormat.toString(),
                        NumberFormat.getInstance(idFormat).format(number));
            default:
                return context.getString(R.string.currency_format, currencyFormat.toString(),
                        NumberFormat.getInstance().format(number));
        }
    }
}
