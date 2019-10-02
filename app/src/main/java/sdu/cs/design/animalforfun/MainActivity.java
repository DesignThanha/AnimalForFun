package sdu.cs.design.animalforfun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปร JAVA กับอิลิเมนต์ XML
        final EditText nameEditText=findViewById(R.id.edtName);
        Button startButton=findViewById(R.id.btnStart);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameString = nameEditText.getText().toString();

                if (nameString.length()== 0 ){
                    Toast.makeText(getApplicationContext(),"กรุณาใส่ชื่อ...",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"ยินดีต้อนรับ "+nameString+" เข้าสู่เกม",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
