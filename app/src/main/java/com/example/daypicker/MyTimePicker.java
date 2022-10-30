package com.example.daypicker;



import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyTimePicker extends DialogFragment {
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c = Calendar.getInstance();
        int hours = c.get(Calendar.HOUR);
        int min = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), (TimePickerDialog.OnTimeSetListener)getActivity(),hours,min,true);

    return timePickerDialog;
    }
}