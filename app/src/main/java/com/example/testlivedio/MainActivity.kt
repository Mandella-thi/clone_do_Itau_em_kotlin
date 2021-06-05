package com.example.testlivedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private var adapter= menuItemAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItemsLista()
    }
    private fun iniciaViews(){
        rvList= findViewById(R.id.rv_list)
        rvList.adapter= adapter
        rvList.layoutManager =GridLayoutManager(this,2)

    }
    private fun setItemsLista(){
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                    "Cartões"
                ),
            MenuItemModel("Meus comprovantes"),
                MenuItemModel("portabilidade de salário"),
                MenuItemModel(
                    "Meus investimentos"
                ),
                MenuItemModel("Meus comprovantes 2"),
                MenuItemModel("portabilidade de salário 2")
            )
        )
    }
}