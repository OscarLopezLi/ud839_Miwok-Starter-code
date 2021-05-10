/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//Librerias
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

//Clase principal
public class MainActivity extends AppCompatActivity {

    @Override
    //metodo para escuchar con java (abrir)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
     //Para numbers
       TextView numbers = (TextView) findViewById(R.id.numbers);
       numbers.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view) {
               Intent numbersIntent = new Intent(MainActivity.this, numbers.class);
               startActivity(numbersIntent);
           }
       });
        //Para colors
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, colors.class);
                startActivity(colorsIntent);
            }
        });

    //family
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, family.class);
                startActivity(familyIntent);
            }
        });
    //para phrases
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, phrases.class);
                startActivity(phrasesIntent);
            }
        });

}

    }