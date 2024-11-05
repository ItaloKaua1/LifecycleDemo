package com.example.lifecycledemo

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("LifecycleDemo", "onCreate chamado")
        Toast.makeText(this, "onCreate chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()

        Log.d("LifecycleDemo", "onStart chamado")
        Toast.makeText(this, "onStart chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        //Mensagem de log e Toast para onResume
        Log.d("LifecycleDemo", "onResume chamado")
        Toast.makeText(this, "onResume chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Log.d("LifecycleDemo", "onPause chamado")
        Toast.makeText(this, "onPuase chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Log.d("LifecycleDemo", "onStop chamado")
        Toast.makeText(this, "onStop chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("LifecycleDemo", "onDestroy chamado")
        Toast.makeText(this, "onDestroy chamado", Toast.LENGTH_SHORT).show()
    }
}