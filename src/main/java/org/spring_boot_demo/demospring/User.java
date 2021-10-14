package org.spring_boot_demo.demospring;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id
    private String id;
    private String studentName;    
    private String dob;    
    private String standard;
    private String division;
    private String gender;

    
    
}
