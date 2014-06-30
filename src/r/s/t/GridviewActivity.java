package r.s.t;

import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;


public class GridviewActivity extends Activity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	 
	        GridView gridView = (GridView) findViewById(R.id.grid_view);
	 
	        // Instance of ImageAdapter Class
	        gridView.setAdapter(new ImageAdapter(this));
	    }
	}