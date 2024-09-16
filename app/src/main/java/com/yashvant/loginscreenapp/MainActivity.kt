package com.yashvant.loginscreenapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.yashvant.loginscreenapp.databinding.ActivityMainBinding
import com.yashvant.loginscreenapp.model.Store
import com.yashvant.loginscreenapp.viewmodels.StoreViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: StoreViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        viewModel = ViewModelProvider(this).get(StoreViewModel::class.java)

        val store = Store(
            0,
            0,
            0,
            "string",
            0,
            0,
            0,
            0,
            "KG",
            "string",
            null,
            "string",
            0,
            "string"
        )

        binding.addDataButton.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                addStore(store, viewModel)
            }
        }
    }
}

suspend fun addStore(store: Store, viewModel: StoreViewModel) {
    viewModel.addStore(store)
}