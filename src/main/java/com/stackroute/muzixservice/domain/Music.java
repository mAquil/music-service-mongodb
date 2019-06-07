package com.stackroute.muzixservice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.Id;


@Builder
@Data
//@Entity
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Music {
    @Id
    private int id;
    private String trackName;
    private String trackComments;

}
