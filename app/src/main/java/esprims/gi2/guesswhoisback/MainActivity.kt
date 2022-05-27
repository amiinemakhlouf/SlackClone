package esprims.gi2.guesswhoisback

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.TextPaint
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.viewbinding.ViewBinding
import esprims.gi2.guesswhoisback.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val list=resources.getStringArray(R.array.channelse)
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,resources.getStringArray(R.array.channelse))
        binding.ChannelsMenu.setAdapter(adapter)

        // change border color of autocomplete
        binding.ChannelsMenu.setBackgroundColor(R.color.white)

        //change dropdown menu list color
        binding.ChannelsMenu.setDropDownBackgroundDrawable(ColorDrawable(resources.getColor(R.color.white)))

        binding.ChannelsMenu2.setBackgroundColor(R.color.white)

        binding.ChannelsMenu2.setDropDownBackgroundDrawable(ColorDrawable(resources.getColor(R.color.white)))






        binding.ChannelsMenu.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,list[position].toString(),Toast.LENGTH_LONG).show()


        }
    }
}