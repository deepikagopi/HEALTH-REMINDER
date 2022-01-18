package com.example.healthreminder.addmedicine;

import com.example.healthreminder.BasePresenter;
import com.example.healthreminder.BaseView;
import com.example.healthreminder.data.source.MedicineAlarm;
import com.example.healthreminder.data.source.Pills;

import java.util.List;



public interface AddMedicineContract {

    interface View extends BaseView<Presenter> {

        void showEmptyMedicineError();

        void showMedicineList();

        boolean isActive();

    }

    interface  Presenter extends BasePresenter{


        void saveMedicine(MedicineAlarm alarm, Pills pills);


        boolean isDataMissing();

        boolean isMedicineExits(String pillName);

        long addPills(Pills pills);

        Pills getPillsByName(String pillName);

        List<MedicineAlarm> getMedicineByPillName(String pillName);

        List<Long> tempIds();

        void deleteMedicineAlarm(long alarmId);

    }
}
