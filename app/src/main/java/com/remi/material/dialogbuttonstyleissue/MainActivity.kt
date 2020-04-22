package com.remi.material.dialogbuttonstyleissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MaterialAlertDialogBuilder(this)
            .setTitle("Hello hello")
            .setPositiveButton("Filled", null)
            .setNeutralButton("OutlinedButton", null)
            .setNegativeButton("TextButton", null)
            .show()
    }
}
