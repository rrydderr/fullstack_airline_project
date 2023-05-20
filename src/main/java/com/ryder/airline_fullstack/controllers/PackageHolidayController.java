package com.ryder.airline_fullstack.controllers;

import com.ryder.airline_fullstack.models.PackageHoliday;
import com.ryder.airline_fullstack.services.PackageHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/packageHolidays")
public class PackageHolidayController {
    @Autowired
    private PackageHolidayService packageHolidayService;

    //get all package holidays
    @GetMapping
    public ResponseEntity<List<PackageHoliday>> getAllPackageHolidays(){
        List<PackageHoliday> packageHolidays = packageHolidayService.getAllPackageHolidays();
        return new ResponseEntity<>(packageHolidays, HttpStatus.OK);
    }

    //get package holiday by id
    @GetMapping("/{id}")
    public ResponseEntity<PackageHoliday> getPackageHolidayById(@PathVariable long id){
        PackageHoliday packageHoliday = packageHolidayService.getPackageHolidayById(id);
        if (packageHoliday == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(packageHoliday, HttpStatus.OK);
    }

    //add package holiday
    @PostMapping
    public ResponseEntity<PackageHoliday> addPackageHoliday(PackageHoliday packageHoliday){
        packageHolidayService.addPackageHoliday(packageHoliday);
        return new ResponseEntity<>(packageHoliday, HttpStatus.OK);
    }

    //update package holiday
    @PutMapping(value = "/{id}")
    public ResponseEntity<PackageHoliday> updatePackageHoliday(@PathVariable long id, @RequestBody PackageHoliday packageHoliday){
        packageHoliday.setId(id);
        PackageHoliday updatedPackageHoliday = packageHolidayService.updatePackageHoliday(packageHoliday);
        if (updatedPackageHoliday == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedPackageHoliday, HttpStatus.OK);
    }

    //delete package holiday
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PackageHoliday> deletePackageHoliday(@PathVariable long id){
        packageHolidayService.deletePackageHoliday(id);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
