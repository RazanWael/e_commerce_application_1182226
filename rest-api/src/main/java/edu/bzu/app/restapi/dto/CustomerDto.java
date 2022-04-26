package edu.bzu.app.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class CustomerDto {
        private long id;
        private String fullName;
        private String gender;
        private String email;
        private long phoneNumber;



}
