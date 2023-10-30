package kz.just_code.charging_station_bottom_sheet

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kz.just_code.charging_station_bottom_sheet.databinding.DialogStation1Binding

class BottomSheet : BaseBottomSheetDialog(true) {
    private lateinit var binding: DialogStation1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogStation1Binding.inflate(inflater, container, false)
        val rootView = binding.root

        val imageView = rootView.findViewById<ImageView>(R.id.imageView11)

        // Добавьте обработчик нажатия на ImageView
        imageView.setOnClickListener {
            // Обработка нажатия
            // В данном случае, перейти по ссылке
            val url = "https://www.google.com/maps/place/%D0%9B%D0%BE%D1%81-%D0%90%D0%BD%D0%B4%D0%B6%D0%B5%D0%BB%D0%B5%D1%81,+%D0%9A%D0%B0%D0%BB%D0%B8%D1%84%D0%BE%D1%80%D0%BD%D0%B8%D1%8F,+%D0%A1%D0%A8%D0%90/@34.0200392,-118.7413867,10z/data=!3m1!4b1!4m6!3m5!1s0x80c2c75ddc27da13:0xe22fdf6f254608f4!8m2!3d34.0549076!4d-118.242643!16s%2Fm%2F030qb3t?entry=ttu"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        return rootView

    }
}