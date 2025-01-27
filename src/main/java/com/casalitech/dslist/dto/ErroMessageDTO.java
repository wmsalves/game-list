package com.casalitech.dslist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErroMessageDTO {
    String field;
    String message;
}
