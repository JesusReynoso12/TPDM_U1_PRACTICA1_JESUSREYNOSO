package reynosojesus.ittepic.edu.tpdm_u1_practica1_jesusreynoso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView resultado;
    Button btncalc,toast;
    RadioButton rsum,rmul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1= findViewById(R.id.txtNum1);
        num2= findViewById(R.id.txtNum2);
        rsum= findViewById(R.id.Rsum);
        rmul= findViewById(R.id.Rmult);
        resultado= findViewById(R.id.result);
        btncalc = findViewById(R.id.botoncalc);

        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(num1.getText().toString());
                int numero2 = Integer.parseInt(num2.getText().toString());
                if(rsum.isChecked()==true){
                    resultado.setText("Resultado: "+(numero1+numero2));
                }else if(rmul.isChecked()==true){
                    resultado.setText("Resultado: "+(numero1*numero2));
                }else{
                    Toast.makeText(MainActivity.this,"Por favor Selecciona Una Operacion",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    public void Limpiar(View v){
        String mensaje="Los Campos se han restablecido";
        resultado.setText("Resultado:");
        num1.setText("");
        num2.setText("");
        rsum.setChecked(false);
        rmul.setChecked(false);
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}
