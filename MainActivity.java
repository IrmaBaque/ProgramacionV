package com.example.felix.myapplication;
//logica es java y xml es grafica
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asigna el control de la variable
    }
   //boton siguiente
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, SegundoActivity.class);
        //indicar el metodo star nos ayuda a lanzar el segundo sctivit
        siguiente.putExtra("Nombre","Irma Baque Paredes");
        siguiente.putExtra("cedula","0925828550");
        siguiente.putExtra("Direccion","cdla. Los esteros");
        siguiente.putExtra("Primaria: ","Escuela Isabel Morlas");
        siguiente.putExtra("Secundaria","Colegio Amarilis fuentes Alcivar");
        siguiente.putExtra("Superior","Universidad de Guayaquil");
        siguiente.putExtra("Empresa","Sub.Direcion de Aviacion Civil");
        siguiente.putExtra("direccion: ","av. de las Americas");
        siguiente.putExtra("nombre","Ing. jessica Lino");
        siguiente.putExtra("telefono","0967308874");

        startActivity(siguiente);
     }

     public void salir(View view){
         finish();
     }


     @Override
     public boolean onCreateOptionsMenu(Menu mimenu){
     getMenuInflater().inflate(R.menu.menus_en_activity, mimenu);
         return true;
     }
    @Override
    public boolean onOptionsItemSelected(MenuItem optionMenu){
        int id=optionMenu.getItemId();
        if(id==R.id.configuracion){
            return true;
        }
        if(id==R.id.info){
            Siguiente(null);
            return true;
        }
        return super.onOptionsItemSelected(optionMenu);
    }
}
