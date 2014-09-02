package app.com.profile2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Activity123 extends Activity implements OnClickListener {
	private TextView tt1;
	private Button bb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout123);
        dd();
        
    }
	private void dd() {
		// TODO Auto-generated method stub
		tt1 = (TextView) findViewById(R.id.textView1);
		bb1= (Button) findViewById(R.id.button2);
		tt1.setText("Rungtiwa Samanma");
		bb1.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button2:
			Intent s = new Intent(Activity123.this,Tt.class);
			startActivity(s);
			break;
		case R.id.button1:
			
			break;

		default:
			break;
		}
	}
}

   