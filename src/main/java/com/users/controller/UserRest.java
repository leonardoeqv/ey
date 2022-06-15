package com.users.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.users.entities.UserEntity;
import com.users.models.ResponseModel;
import com.users.repositories.UserRepository;
import com.users.services.Utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "/v1")
public class UserRest {
    
	@Autowired
    private UserRepository userRepository;
    
    private static final Logger logger = LoggerFactory.getLogger(UserRest.class);
    
    @PostMapping("user")
    public ResponseEntity<ResponseModel> insertUser(@RequestBody UserEntity UserEntity) {
        ResponseModel responseModel = new ResponseModel();
        UserEntity auxUserEntity = null;
        try {
            if (Utility.validarEmail(UserEntity.getEmail())) {
            	auxUserEntity = userRepository.findByemail(UserEntity.getEmail());
            	if (auxUserEntity == null) {
            		if (Utility.validarPass(UserEntity.getPassword())) {
	            		auxUserEntity = userRepository.save(UserEntity);
			            if (auxUserEntity != null) {
			            	responseModel.setData(userRepository.findById(auxUserEntity.getId()));
			                responseModel.setCode(200);
			                responseModel.setInformation("Creado Exitosamente");
			                return ResponseEntity.status(HttpStatus.CREATED).body(responseModel);
			            }else {
			            	responseModel.setData(null);
			                responseModel.setCode(409);
			                responseModel.setInformation("Error al crear usuario");
			                return ResponseEntity.status(HttpStatus.CONFLICT).body(responseModel);
			            }
            		}else {
            			responseModel.setData(null);
    	                responseModel.setCode(409);
    	                responseModel.setInformation("Error password no cumple con los requerido");
    	                return ResponseEntity.status(HttpStatus.CONFLICT).body(responseModel);	
            		}
            	}else {
            		responseModel.setData(null);
	                responseModel.setCode(409);
	                responseModel.setInformation("Error correo ya registrado");
	                return ResponseEntity.status(HttpStatus.CONFLICT).body(responseModel);
            	}
            }else {
            	responseModel.setData(null);
                responseModel.setCode(409);
                responseModel.setInformation("Error correo invalido");
                return ResponseEntity.status(HttpStatus.CONFLICT).body(responseModel);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.toString());
            responseModel.setCode(401);
            responseModel.setInformation("INTERNAL_SERVER_ERROR");
            responseModel.setData(null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseModel);
        }
    }
	
}