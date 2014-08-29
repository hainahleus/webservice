package com.onb.training.ws;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.onb.training.ws.schemas.EmployeeRequest;
import com.onb.training.ws.schemas.EmployeeResponse;
import com.onb.training.ws.schemas.EmployeeType;

@Endpoint
public class WebServiceEndpoint {
	public static final String NAMESPACE_URI = "http://com.onb.training/ws/schemas";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "EmployeeRequest")
	public @ResponsePayload EmployeeResponse retrieveEmployee(@RequestPayload EmployeeRequest employeeRequest) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeType employee = new EmployeeType();
		
		employee.setName("Alec");
		employee.setAge(30);
		employee.setGender("M");
		
		response.setEmployee(employee);
		
		return response;
	}
}
