package com.casalitech.dslist.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class ReplacementDTO {
    @Schema(example ="3" )
    private Integer sourceIndex;
    @Schema(example ="2" )
    private  Integer destinationIndex;

    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }
}
