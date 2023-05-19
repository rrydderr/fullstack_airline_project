package com.ryder.airline_fullstack.services;

import com.ryder.airline_fullstack.models.PackageHoliday;
import com.ryder.airline_fullstack.repositories.PackageHolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PackageHolidayService {
    @Autowired
    private PackageHolidayRepository packageHolidayRepository;

    //get all package holidays
    public List<PackageHoliday> getAllPackageHolidays(){
        return packageHolidayRepository.findAll();
    }

    //get package holiday by id
    public PackageHoliday getPackageHolidayById(long id){
        Optional<PackageHoliday> packageHoliday = packageHolidayRepository.findById(id);
        return packageHoliday.orElse(null);
    }

    //add package holiday
    public PackageHoliday addPackageHoliday(PackageHoliday packageHoliday) {
        return packageHolidayRepository.save(packageHoliday);
    }

    //update package holiday
    public PackageHoliday updatePackageHoliday(PackageHoliday packageHoliday){
        Optional<PackageHoliday> existingPackageHoliday = packageHolidayRepository.findById(packageHoliday.getId());
        if (existingPackageHoliday.isPresent()){
            return packageHolidayRepository.save(packageHoliday);
        } else {
            return null;
        }
    }

    //delete package holiday
    public void PackageHoliday(long id){
        packageHolidayRepository.deleteById(id);
    }
}
