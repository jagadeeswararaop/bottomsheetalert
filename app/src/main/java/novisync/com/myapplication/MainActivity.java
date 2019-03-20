package novisync.com.myapplication;

import android.content.DialogInterface;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


Button button;
BottomSheetDialog bottomSheetDialog ;
LinearLayout okay_layout,cancel_layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      bottomSheetDialog =new BottomSheetDialog(MainActivity.this);
         View bottomDialog=getLayoutInflater().inflate(R.layout.bottom_sheet_dialog, null);
        bottomSheetDialog.setContentView(bottomDialog);


        okay_layout=bottomDialog.findViewById(R.id.okay_layout);
        cancel_layout=bottomDialog.findViewById(R.id.cancel_layout);
        button=findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog.show();
            }
        });


        okay_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"okay",Toast.LENGTH_LONG).show();

                //replace with your code
            }
        });


        cancel_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"cancel",Toast.LENGTH_LONG).show();

                //replace with your code
            }
        });


    }


}
