package kz.just_code.charging_station_bottom_sheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kz.just_code.charging_station_bottom_sheet.databinding.DialogStation1Binding

class BottomSheet : BaseBottomSheetDialog(true) {
    private lateinit var binding: DialogStation1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogStation1Binding.inflate(inflater, container, false)
        return binding.root
    }
}