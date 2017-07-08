package com.example.niltonboy.el1_dam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{
    RadioButton rbtantiguo, rbtmoderno, rbtnaturaleza;
    Spinner spnmaravilla;
    ImageView imgmaravilla;
    TextView txtresultado;
    RadioGroup rbgMaravilla;

    private void iniciarComponentes(){
        rbtantiguo = (RadioButton)findViewById(R.id.rbtAntiguo);
        rbtmoderno = (RadioButton)findViewById(R.id.rbtModerno);
        rbtnaturaleza = (RadioButton)findViewById(R.id.rbtNaturaleza);
        spnmaravilla = (Spinner)findViewById(R.id.spnMaravilla);
        imgmaravilla = (ImageView)findViewById(R.id.imgMaravilla);
        txtresultado = (TextView)findViewById(R.id.txtResultado);
        rbgMaravilla = (RadioGroup)findViewById(R.id.rbgMaravilla);

        rbtantiguo.setOnClickListener(this);
        rbtmoderno.setOnClickListener(this);
        rbtnaturaleza.setOnClickListener(this);

        spnmaravilla.setOnItemSelectedListener(this);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarComponentes();
    }

    @Override
    public void onClick(View v) {
        ArrayList<String> maravillas = new ArrayList<String>();
        if(v == rbtantiguo){
            maravillas.add("Gran piramide de guiza");
            maravillas.add("Lo jardines colgantes de babilonia");
            maravillas.add("El Templo de artemiza");
            maravillas.add("La Estatua de Zeus en Olimpia");
            maravillas.add("El Mausoleo de Halicarnaso");
            maravillas.add("El Coloso de Rodas");
            maravillas.add("El Faro de Alejandría");

            }
        if(v == rbtmoderno){
            maravillas.add("Machupicchu");
            maravillas.add("La gran Murralla China");
            maravillas.add("Cristo Redentor");
            maravillas.add("El coliseo de Roma");
            maravillas.add("Chichen Itza");
            maravillas.add("Petra");
            maravillas.add("Taj Mahal");
            }
        if(v == rbtnaturaleza){
             maravillas.add("Cataratas de Iguazu");
             maravillas.add("Isla Jeju");
             maravillas.add("Parque Nacional de Komodo");
             maravillas.add("Rio Subterraneo de Puerto Princesa");
             maravillas.add("La amazonia");
             maravillas.add("Salto angel");
             maravillas.add("Gran Cañon");
            }
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, maravillas);

        spnmaravilla.setAdapter(adaptador);

        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                if(rbtantiguo.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.imagen1);
                    txtresultado.setText("La Gran Piramide de Guiza - Egipto");
                    break;
                }
                if(rbtmoderno.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.machupicchu);
                    txtresultado.setText("Machupichu, Lugar sagrado de los inkas");
                }
                if(rbtnaturaleza.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.cataratasIguazu);
                    txtresultado.setText("Cataras de Iguazu - Argentina Brasil");
                }
            case 1:
                if(rbtantiguo.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.jardinesBabilonia);
                    txtresultado.setText("Los Jardines colgantes de babilonia - Iraq");
                    break;
                }
                if(rbtmoderno.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.muralla);
                    txtresultado.setText("La gran muralla china - China");
                }
                if(rbtnaturaleza.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.islaJeju);
                    txtresultado.setText("Isla Jeju - Corea del sur");
                }
            case 2:
                if(rbtantiguo.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.temploArtemisa);
                    txtresultado.setText("El Templo de artemiza - Turquia");
                    break;
                }
                if(rbtmoderno.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.cristo);
                    txtresultado.setText("Cristo Redentor - Brasil");
                }
                if(rbtnaturaleza.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.parqueKomodo);
                    txtresultado.setText("Parque nacional de Komodo - Indonesia");
                }
            case 3:
                if(rbtantiguo.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.estatuaZeus);
                    txtresultado.setText("La Estatua de Zeus en Olimpia - Grecia");
                    break;
                }
                if(rbtmoderno.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.coliseoRomano);
                    txtresultado.setText("Coliseo de Roma - Italia");
                }
                if(rbtnaturaleza.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.puertoSubterranea);
                    txtresultado.setText("Rio Subterraneo de Puerto Princesa - Filipinas");
                }
            case 4:
                if(rbtantiguo.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.tumbaMausoleo);
                    txtresultado.setText("El Mausoleo de Halicarnaso - Turquia");
                    break;
                }
                if(rbtmoderno.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.chichenItza);
                    txtresultado.setText("Chichen Itza - mexico");
                }
                if(rbtnaturaleza.isChecked()){
                   // imgmaravilla.setImageResource(R.drawable.amazonía);
                    txtresultado.setText("La amazonia - Peru");
                }
            case 5:
                if(rbtantiguo.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.celosoRodas);
                    txtresultado.setText("El Coloso de Rodas - Estatua de la Libertad");
                    break;
                }
                if(rbtmoderno.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.Petra);
                    txtresultado.setText("Petra - Jordania");
                }
                if(rbtnaturaleza.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.saltoAngel);
                    txtresultado.setText("Salto Ángel - Venezuela");
                }
            case 6:
                if(rbtantiguo.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.faroAlejandria);
                    txtresultado.setText("El Faro de Alejandría - cuidad de Alejandria");
                    break;
                }
                if(rbtmoderno.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.TajMahal);
                    txtresultado.setText("Taj Mahal - India");
                }
                if(rbtnaturaleza.isChecked()){
                    imgmaravilla.setImageResource(R.drawable.GranCañon);
                    txtresultado.setText("Gran Cañon - Estados Unidos");
                }

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
