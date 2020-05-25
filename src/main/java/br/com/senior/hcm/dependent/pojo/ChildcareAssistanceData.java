package br.com.senior.hcm.dependent.pojo;

import lombok.Data;

/**
 * Auxílio creche
 */
@Data
public class ChildcareAssistanceData {
    /**
     * Id do auxílio creche
     */
    String id;
    /**
     * Se tem auxílio creche
     */
    boolean childcareAssistance;
    /**
     * Meses
     */
    int months;
}
