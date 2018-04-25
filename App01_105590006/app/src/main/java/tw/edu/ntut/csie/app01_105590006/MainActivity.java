package tw.edu.ntut.csie.app01_105590006;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText EdtAchie;
    private Button Btn;
    private TextView TxtR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtAchie = (EditText) findViewById(R.id.editAchie);
        Btn = (Button) findViewById(R.id.Button);
        TxtR = (TextView) findViewById(R.id.Textout);

        Btn.setOnClickListener(btnOnClick);
    }

    private View.OnClickListener btnOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int iAchie = Integer.parseInt(EdtAchie.getText().toString());

            String strSug = getString(R.string.suggestion);
            if(iAchie < 0){
                strSug += 'X';
            }
            else if (iAchie < 60){
                strSug += 'F';
            }
            else if (iAchie < 70){
                strSug += 'E';
            }
            else if (iAchie < 80){
                strSug += 'D';
            }
            else if (iAchie < 90){
                strSug += 'C';
            }
            else if(iAchie < 100){
                strSug += 'B';
            }
            else if(iAchie == 100){
                strSug += 'A';
            }
            else{
                strSug += 'X';
            }

            TxtR.setText(strSug);
        }
    };
}
