package com.example.avantsofttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.avantsofttest.adapters.UsersAdapter
import com.example.avantsofttest.api.IEndpoint
import com.example.avantsofttest.util.Constants
import com.example.moeda.util.NetworkUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    lateinit var rvUsers: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUsers = findViewById(R.id.rvUsers)

        getCurrencies()
    }

    private fun getCurrencies() {
        val network = NetworkUtils.getRetrofitInstance(Constants.API_BASE_URL)
        val endpoint = network.create(IEndpoint::class.java)

        endpoint.getCurrencies()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                val usersData = it.Users
                rvUsers.adapter = UsersAdapter(usersData)
            },
            {
                Log.d(localClassName, "Erro ${it.message}")
            })
    }
}