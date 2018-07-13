package br.com.jonathan.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class NomesAdapter: RecyclerView.Adapter<NomeViewHolder>() {


    val listasNomes : List<String> = listOf("Ney", "Breno", "Ricardo")


    //criar o item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_nome, parent, false)


        return NomeViewHolder(view)

    }


    //retornar o tamanho da lista
    override fun getItemCount(): Int = listasNomes.size



    //linka o dado com a posição
    override fun onBindViewHolder(holder: NomeViewHolder, position: Int) {

        holder.bind(listasNomes[position])

    }
}