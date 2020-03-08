package com.example.tarefas.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tarefas")
public class Tarefa
{
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String descricao;
    private boolean realizado = false;
    private long dataHora;

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id + ", descricao='" + descricao + '\'' + ", realizado=" + realizado + ", dataHora=" + dataHora + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public long getDataHora() {
        return dataHora;
    }

    public void setDataHora(long dataHora) {
        this.dataHora = dataHora;
    }

    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Tarefa() {
    }


}



