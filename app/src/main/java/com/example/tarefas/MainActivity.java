package com.example.tarefas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.example.tarefas.model.Tarefa;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ListView lsvListarTarefas;
    private List<Tarefa> tarefas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsvListarTarefas = (ListView) findViewById(R.id.lsv_listar_tarefas);

        tarefas =  new ArrayList<Tarefa>();

        Tarefa t1 = new Tarefa(1, "Pagar boleto de energia");
        Tarefa t2 = new Tarefa(2, "Estudar para a prova de matemática");
        Tarefa t3 = new Tarefa(3, "Compra biscoito");

        tarefas.add(t1);
        tarefas.add(t2);
        tarefas.add(t3);

        ArrayAdapter<Tarefa> adapter = new ArrayAdapter<Tarefa>(this, android.R.layout.simple_list_item_1, tarefas);

        lsvListarTarefas.setAdapter(adapter);
    }
}
