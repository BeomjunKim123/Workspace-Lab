package com.mysite.rest.employee.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")		//CORS 셋팅 
@RestController
@RequestMapping ("/api/employee")
public class EmployeeController {

	// CRUD REST 통신 처리 블락 
	
	// get : 사원의 전체 리스트 정보  : /api/employee
	
	// get : 사원의 정보 : /api/employee/{id}
	
	// post : 사원을 등록 : /api/employee 
	
	// put : 사원정보를 수정 : /api/employee/{id} 
	
	// delete : 사원정보를 삭제 : /api/employee/{id} 
	
	
	
}
