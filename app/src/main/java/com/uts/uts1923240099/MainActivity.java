package com.uts.uts1923240099;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etnama, etnp;
    private Spinner spjp;
    private CheckBox cbconf;
    private Button btndftr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = findViewById(R.id.et_nama);
        etnp = findViewById(R.id.et_np);
        spjp = findViewById(R.id.sp_jp);
        cbconf = findViewById(R.id.cb_conf);
        btndftr = findViewById(R.id.btn_dftr);
        btndftr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama, np, sp;

                nama = etnama.getText().toString();
                np = etnp.getText().toString();
                sp = spjp.getSelectedItem().toString();

                if (nama.trim().equals("")){
                    etnama.setError("Nama Kosong");
                }
                else if (np.trim().equals("")){
                    etnp.setError(("Nomor Kosong"));
                }
                else if (sp.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Jalur Pendaftaran Kosong", Toast.LENGTH_SHORT).show();
                }
                else if (!(cbconf.isChecked())){
                    Toast.makeText(MainActivity.this, " Konfirmasi Pendaftaran Belum Dilakuakan", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this,MainActivitySecond.class);
                    intent.putExtra("vNama", nama);
                    intent.putExtra("vNomor", np);
                    intent.putExtra("vJalur", sp);
                    startActivity(intent);
                };
            };

        });
    };
}