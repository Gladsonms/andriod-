package com.example.prg13;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button click=(Button) findViewById(R.id.button1);
        final RelativeLayout rl=(RelativeLayout) findViewById(R.id.r1);
      click.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			rl.setBackgroundColor(Color.YELLOW);
			
			
		}
	});
        
        
    }

   
}
