package kz.just_code.charging_station_bottom_sheet

import android.content.Intent
import android.net.Uri
import kz.just_code.charging_station_bottom_sheet.databinding.DialogStation3Binding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class BottomSheet3 : BaseBottomSheetDialog(true) {
    private lateinit var binding: DialogStation3Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogStation3Binding.inflate(inflater, container, false)
        val rootView = binding.root

        val imageView = rootView.findViewById<ImageView>(R.id.imageView11)

        // Добавьте обработчик нажатия на ImageView
        imageView.setOnClickListener {
            // Обработка нажатия
            // В данном случае, перейти по ссылке
            val url ="https://www.google.com/maps/place/%D0%92%D0%B0%D1%88%D0%B8%D0%BD%D0%B3%D1%82%D0%BE%D0%BD,+%D0%A1%D0%A8%D0%90/@47.2426768,-123.5220392,7z/data=!3m1!4b1!4m6!3m5!1s0x5485e5ffe7c3b0f9:0x944278686c5ff3ba!8m2!3d47.7510741!4d-120.7401385!16zL20vMDgxeXc?entry=ttu"
                  val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        return rootView
    }
}