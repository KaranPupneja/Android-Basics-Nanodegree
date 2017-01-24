package com.example.ayaan.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.ayaan.justjava.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public int increment(View view){
        quantity=quantity+1;
        display(quantity);
        return(quantity);
    }
    public int decrement(View view){
        if (quantity>0)
            quantity=quantity-1;

        display(quantity);
        return(quantity);
    }
    public void submitOrder(View view) {
        price=cal(quantity);
        summary();
        displayMessage(s);
    }
    int price;
    public int cal(int q){
        price=q*5;
        return price;
    }
    String s;
    public String summary(){
        s="Name: Ayaan Faiz\nQuantity: "+quantity+"\nTotal: $"+price+"\nThank You!";
        return s;
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
//    private void displayPrice(int number) {
//        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
//        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
//    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);

    }

}