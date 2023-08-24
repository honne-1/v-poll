package com.example.polling_app.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;
@Data
public class VoteRequest {
    @NotNull
    private Long choiceId;
}