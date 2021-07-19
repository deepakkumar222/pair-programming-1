package org.tg.ppad.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tg.ppad.bean.ResponseBean;
import org.tg.ppad.mgr.IEmployeeMgr;
import org.tg.ppad.model.Employee;
import org.tg.ppad.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class EmployeeMgrImpl implements IEmployeeMgr {

    @Autowired
    private EmployeeRepository employeeRepository;

    private static String headers[] = {"First Name","Last Name","Age","Email Id"};

    @Override
    public ResponseBean employeedata() {
        ResponseBean responseBean = new ResponseBean();
        List<Object[]> objectArry =  employeeRepository.getEmployeeData();
        if(null==objectArry || objectArry.isEmpty()){
            return responseBean;
        }
        List<Map<String,Object>> employeeList = new ArrayList<Map<String,Object>>();
        Map<String,Object> mapObj = null;

        int i = 0;
        for(Object[] obj : objectArry){
            mapObj = new LinkedHashMap<String,Object>();
            i=0;
            mapObj.put(headers[i++], obj[0] );
            mapObj.put(headers[i++], obj[1] );
            mapObj.put(headers[i++], obj[2] );
            mapObj.put(headers[i++], obj[3] );

            employeeList.add(mapObj);
        }

        Employee employee = new Employee();
        employee.setHeaders(headers);
        employee.setEmployeeList(employeeList);

        responseBean.setValid(true);
        responseBean.setData(employee);
        return responseBean;
    }
}
