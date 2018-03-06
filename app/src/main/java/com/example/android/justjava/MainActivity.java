/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match the package name found
 * in the project's AndroidManifest.xml file.
 *
 * Anne was here on Sun 25 Feb 2018 at 5:17 pm testing out how to use Git and GitHub with Android Studio
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 * Anne was here on Sun 25 Feb 2018 at 5:10 pm testing out how to use Git and GitHub with Android Studio
 *
 * https://stackoverflow.com/questions/37093723/how-to-add-an-android-studio-project-to-github
 *
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method creates a summary of the order
     *
     * @param priceOfOrder of the order
     * @return text summary
     */
    private String createOrderSummary(int priceOfOrder){
        String summary = "Name: Captain Kunal\nQuantity: " + quantity + "\nTotal: $" + priceOfOrder +  "\nThank you!";
        return summary;
    }



    /**
     * This method is called when the order button is clicked.
     * note: has to be public
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        String summary;
        String priceMessage = "Total $" + price + "\nThank you!";
        //displayMessage(priceMessage);
        summary = createOrderSummary(price);
        displayMessage(summary);
    }



    /**
     * This method calculates the price of the order
     *
     * @return total price
     */
    private int calculatePrice() {

        int price = quantity * 5;
        return price;
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }



    /**
     * This method increases quantity by 1
     * note: has to be public
     */
    public void increment(View view) {

        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method decreases quantity by 1
     * note: has to be public
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}


































