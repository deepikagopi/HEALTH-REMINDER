package com.example.healthreminder.alarm;

import com.example.healthreminder.BasePresenter;
import com.example.healthreminder.BaseView;
import com.example.healthreminder.data.source.History;
import com.example.healthreminder.data.source.MedicineAlarm;



public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
