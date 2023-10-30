package kz.just_code.charging_station_bottom_sheet

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kz.just_code.charging_station_bottom_sheet.databinding.DialogStation2Binding


class BottomSheet2 : BaseBottomSheetDialog(true) {
    private lateinit var binding: DialogStation2Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogStation2Binding.inflate(inflater, container, false)
        val rootView = binding.root

        val imageView = rootView.findViewById<ImageView>(R.id.imageView11)

        // Добавьте обработчик нажатия на ImageView
        imageView.setOnClickListener {
            // Обработка нажатия
            // В данном случае, перейти по ссылке
            val url = "https://www.google.com/maps/place/%D0%9D%D1%8C%D1%8E-%D0%99%D0%BE%D1%80%D0%BA,+%D0%A1%D0%A8%D0%90/@40.6958089,-74.6035501,10z/data=!3m1!4b1!4m6!3m5!1s0x89c24fa5d33f083b:0xc80b8f06e177fe62!8m2!3d40.7127753!4d-74.0059728!16zL20vMDJfMjg2?entry=ttu"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        return rootView
    }
}