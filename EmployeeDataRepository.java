package com.Data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.DataModel.EmployeeData;

import java.lang.Long;
import java.time.LocalDate;
import java.util.List;




public interface EmployeeDataRepository extends JpaRepository<EmployeeData , Long> {

	EmployeeData getEmployeeDataByCity(String empCity);

	ResponseEntity<List<EmployeeData>> findBy(LocalDate joinDate, LocalDate leaveDate);

}
