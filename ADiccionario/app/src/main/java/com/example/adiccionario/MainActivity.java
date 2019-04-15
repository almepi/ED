package com.example.adiccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.adiccionario.R.id.button60;

public class MainActivity extends AppCompatActivity {


    //Button[] botones = new Button[15];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*botones[0]= findViewById(R.id.button48);
        botones[1]= findViewById(R.id.button53);
        botones[2]= findViewById(R.id.button54);
        botones[3]= findViewById(R.id.button45);
        botones[4]= findViewById(R.id.button46);
        botones[5]= findViewById(R.id.button47);
        botones[6]= findViewById(R.id.button43);
        botones[7]= findViewById(R.id.button42);
        botones[8]= findViewById(R.id.button44);
        botones[9]= findViewById(R.id.button55);
        botones[10]= findViewById(R.id.button56);
        botones[11]= findViewById(R.id.button57);
        botones[12]= findViewById(R.id.button58);
        botones[13]= findViewById(R.id.button59);
        botones[14]= findViewById(R.id.button60);
    }*/

        Button boton1 = (Button)findViewById(R.id.button48);
        boton1.setText("School");
        Button boton2 = (Button)findViewById(R.id.button53);
        boton2.setText("Car");
        Button boton3 = (Button)findViewById(R.id.button54);
        boton3.setText("Book");
        Button boton4 = (Button)findViewById(R.id.button45);
        boton4.setText("House");
        Button boton5 = (Button)findViewById(R.id.button46);
        boton5.setText("Computer");
        Button boton6 = (Button)findViewById(R.id.button47);
        boton6.setText("Green");
        Button boton7 = (Button)findViewById(R.id.button43);
        boton7.setText("Kitchen");
        Button boton8 = (Button)findViewById(R.id.button42);
        boton8.setText("Teacher");
        Button boton9 = (Button)findViewById(R.id.button44);
        boton9.setText("Window");
        Button boton10 = (Button)findViewById(R.id.button55);
        boton10.setText("Sing");
        Button boton11 = (Button)findViewById(R.id.button56);
        boton11.setText("Play");
        Button boton12 = (Button)findViewById(R.id.button57);
        boton12.setText("Toy");
        Button boton13 = (Button)findViewById(R.id.button58);
        boton13.setText("Beach");
        Button boton14 = (Button)findViewById(R.id.button59);
        boton14.setText("Country");
        Button boton15 = (Button)findViewById(R.id.button60);
        boton15.setText("Picture");
    }

    ArrayList<String> palabras = new ArrayList<>();


private void ListaPalabras (){
    palabras.add("Colegio");
    palabras.add("Coche");
    palabras.add("Libro");
    palabras.add("Casa");
    palabras.add("Ordenador");
    palabras.add("Verde");
    palabras.add("Cocina");
    palabras.add("Profesor");
    palabras.add("Ventana");
    palabras.add("Cantar");
    palabras.add("Jugar");
    palabras.add("Juguete");
    palabras.add("Playa");
    palabras.add("País");
    palabras.add("Fotografía");
}




ArrayList<String> Ingles = new ArrayList<>();
    private void Inglesas(){
        Ingles.add("School");
        Ingles.add("Car");
        Ingles.add("Book");
        Ingles.add("House");
        Ingles.add("Computer");
        Ingles.add("Green");
        Ingles.add("Kitchen");
        Ingles.add("Teacher");
        Ingles.add("Window");
        Ingles.add("Sing");
        Ingles.add("Play");
        Ingles.add("Toy");
        Ingles.add("Beach");
        Ingles.add("Country");
        Ingles.add("Picture");
    }

private void repartPalabras(){
        palabras.addAll(palabras);
        Collections.shuffle(palabras);


}









}
/*
private List<String> palabras = new ArrayList <>();
private void initPalabras(){
palabras.add("uno");
}
private String Frase = "hola que tal";
collections.shuffle(palabras);
Button button = findViewById(R.id.button);
button_setText(palabras.get(0));
*/

