package esprims.gi2.guesswhoisback

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.ui.AppBarConfiguration
import esprims.gi2.guesswhoisback.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)

        val fragmentManager=supportFragmentManager
        fragmentManager.beginTransaction().replace(
            R.id.fragment_holder,FirstFragment()
        ).commit()


        /*  binding = ActivityMainBinding.inflate(layoutInflater)
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


        }*/

        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {
                    fragmentManager.beginTransaction().replace(
                        R.id.fragment_holder,FirstFragment()
                    ).commit()

                    true

                }
                R.id.dm ->{
                    fragmentManager.beginTransaction().replace(
                        R.id.fragment_holder,DMFragment()
                    ).commit()

                    true
                }


                else ->false
            }

        }

    }
}