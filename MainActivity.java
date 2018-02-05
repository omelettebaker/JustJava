/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
/**
 * This app displays an order form to order coffee.
 */

public class MainActivity extends AppCompatActivity {
    int quantity = 1;
    int priceOfCoffee = 5;
    String thankYou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {
        int totalPrice = quantity * priceOfCoffee;
        thankYou = "Thank You and Enjoy!";
        String priceMessage = "Total: $" + totalPrice;
        priceMessage = priceMessage + "\nThank You!";
        displayMessage(priceMessage);
//        displayPrice(quantity * priceOfCoffee);
        displayThanks(thankYou);
    }

    /**
     * This method is called with the "+" button is clicked. It will increase "quantity_text_view"
     * by 1.  The thank you message will be erased.
     */

    public void increment(View view) {
        quantity = quantity + 1;
        thankYou = "";
        display(quantity);
        displayPrice(quantity * priceOfCoffee);
        displayThanks(thankYou);
    }

    /**
     * This method is called with the "-" button is clicked.  It will decrease "quantity_text_view"
     * by 1.  The thank you message will be erased.
     */

    public void decrement(View view) {
        quantity = quantity - 1;
        thankYou = "";
        display(quantity);
        displayThanks(thankYou);
        displayPrice(quantity * priceOfCoffee);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays a thank you text after submitting the order.
     */

    public void displayThanks(String thanks) {
        TextView thankYouTextView = (TextView) findViewById(R.id.thank_you_text);
        thankYouTextView.setText(thanks);

    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}