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
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.rvWallet.layoutManager = LinearLayoutManager(this)
//
//     displayEnwallet()
//
//    }
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.rvWallet.layoutManager = LinearLayoutManager(this)

    displayEnwallet()
}
    fun displayEnwallet() {
        val expenseList = mutableListOf<EnWallet>()
        val expense1 = EnWallet(R.drawable.income_trx, "Salary", "KES 40000", "1 July 2024")
        val expense2= EnWallet(R.drawable.expense_trx,"Rent", "KES 16000", "2 July 2024")
        val expense3= EnWallet(R.drawable.income_trx,"Dividends", "KES 2400", "4 July 2024")
        val expense4 = EnWallet(R.drawable.expense_trx,"Electricity", "KES 800", "5 July 2024")
        val expense5 = EnWallet(R.drawable.expense_trx,"Internet", "KES 2500", "5 July 2024")
        val expense6 = EnWallet(R.drawable.expense_trx,"Shopping", "KES 3500", "5 July 2024")
        val expense7 = EnWallet(R.drawable.expense_trx,"Bus fare", "KES 500", "11 July 2024")
        val expense8 = EnWallet(R.drawable.expense_trx,"Water bill", "KES 1200", "11 July 2024")
        val expense9 = EnWallet(R.drawable.expense_trx,"land tax", "KES 2000", "13 July 2024")

        expenseList.add(expense1)
        expenseList.add(expense2)
        expenseList.add(expense3)
        expenseList.add(expense4)
        expenseList.add(expense5)
        expenseList.add(expense6)
        expenseList.add(expense7)
        expenseList.add(expense8)
        expenseList.add(expense9)

        val walletAdapter = WalletAdapter(expenseList)
        binding.rvWallet.adapter = walletAdapter

        // notify the adapter about the changes
//        walletAdapter.notifyDataSetChanged()
    }


}