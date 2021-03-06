package com.example.justjava;




import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
       TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);

        int quantity=Integer.parseInt((String) quantityTextView.getText());
        //displayPrice(quantity*5);
    String priceMessage="Price : Rs "+ quantity*5;
        priceMessage=priceMessage+ "\n Thankyou";
    displayMessage(priceMessage);


    }

    public void increment(View view)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);

        int quantity=Integer.parseInt((String) quantityTextView.getText());
        quantity=quantity+1;
        display(quantity);
    }

    public void decrement(View view)
    {  TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);

        int quantity=Integer.parseInt((String) quantityTextView.getText());
        quantity=quantity-1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}