package kz.just_code.charging_station_bottom_sheet

import kz.just_code.charging_station_bottom_sheet.databinding.DialogStation3Binding
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout

import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheet3(private var expanded: Boolean = false): BottomSheetDialogFragment() {
    private lateinit var binding: DialogStation3Binding

    private lateinit var behavior: BottomSheetBehavior<FrameLayout>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogStation3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val bottomSheet = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        behavior = bottomSheet.behavior

        if (expanded) behavior.state = BottomSheetBehavior.STATE_EXPANDED
        return bottomSheet
    }
}