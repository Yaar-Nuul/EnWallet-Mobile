package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
//        displayEnwallet(walletItems = WalletItems())

    }
    fun displayEnwallet(walletItems: List<WalletItems>){
        val salary = WalletItems("drawable/income_trt.xml", "Salary", "KES 24000", "4 July 2024")




//        val contactsAdapter = BlogAdapter(contactList)
//        binding.rvWallet.adapter = contactsAdapter
    }
}