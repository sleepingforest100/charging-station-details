package kz.just_code.charging_station_bottom_sheet

import kz.just_code.charging_station_bottom_sheet.databinding.DialogStation3Binding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BottomSheet3 : BaseBottomSheetDialog(true) {
    private lateinit var binding: DialogStation3Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogStation3Binding.inflate(inflater, container, false)
        return binding.root
    }
}