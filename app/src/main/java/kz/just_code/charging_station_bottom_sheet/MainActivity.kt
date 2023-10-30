package kz.just_code.charging_station_bottom_sheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.just_code.charging_station_bottom_sheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val station1Dialog = BottomSheet(true)
    private val station2Dialog = BottomSheet2(true)
    private val station3Dialog = BottomSheet3(true)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.station1.setOnClickListener {
            station1Dialog.show(supportFragmentManager, "Station1BottomSheet")

        }
        binding.station2.setOnClickListener {
            station2Dialog.show(supportFragmentManager, "Station2BottomSheet")

        }
        binding.station3.setOnClickListener {
            station3Dialog.show(supportFragmentManager, "Station3BottomSheet")

        }

    }
}