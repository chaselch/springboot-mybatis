package com.ch.springbootmybatis.mapper;

import com.ch.springbootmybatis.bean.Employee;

//@Mapper或MapperScan装配到
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);

}
