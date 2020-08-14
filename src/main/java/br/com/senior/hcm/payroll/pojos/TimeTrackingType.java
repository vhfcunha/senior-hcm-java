/*
 * Folha de Pagamento
 * HCM - Folha de pagamento
 *
 * OpenAPI spec version: 9.0.3
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.hcm.payroll.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets timeTrackingType
 */
@JsonAdapter(TimeTrackingType.Adapter.class)
public enum TimeTrackingType {
  
  _01_WORKING("TYPE_01_WORKING"),
  
  _02_VACATION("TYPE_02_VACATION"),
  
  _03_AID_DISEASE("TYPE_03_AID_DISEASE"),
  
  _04_WORK_ACCIDENT("TYPE_04_WORK_ACCIDENT"),
  
  _05_MILITARY_SERVICE("TYPE_05_MILITARY_SERVICE"),
  
  _06_MATERNITY_LICENSE("TYPE_06_MATERNITY_LICENSE"),
  
  _07_FIRED("TYPE_07_FIRED"),
  
  _08_LICENSE_WITHOUT_PAY("TYPE_08_LICENSE_WITHOUT_PAY"),
  
  _09_PAID_BY_COMPANY_LICENSE("TYPE_09_PAID_BY_COMPANY_LICENSE"),
  
  _10_PAID_BY_EMPLOYEE_LICENSE("TYPE_10_PAID_BY_EMPLOYEE_LICENSE"),
  
  _11_PATERNITY_LICENSE("TYPE_11_PATERNITY_LICENSE"),
  
  _12_COLLECTIVE_HOLIDAY("TYPE_12_COLLECTIVE_HOLIDAY"),
  
  _13_NOTICE_WORKED("TYPE_13_NOTICE_WORKED"),
  
  _14_MEDICAL_LICENSE_PAID_BY_COMPANY("TYPE_14_MEDICAL_LICENSE_PAID_BY_COMPANY"),
  
  _15_ABSENCES("TYPE_15_ABSENCES"),
  
  _16_OVERTIME("TYPE_16_OVERTIME"),
  
  _17_TIME_TRACKING("TYPE_17_TIME_TRACKING"),
  
  _18_READINESS("TYPE_18_READINESS"),
  
  _19_MATERNITY_LICENSE_INSS("TYPE_19_MATERNITY_LICENSE_INSS"),
  
  _20_ASSOCIATION_MANDATE("TYPE_20_ASSOCIATION_MANDATE"),
  
  _21_USED_VACATION_TAKEN("TYPE_21_USED_VACATION_TAKEN"),
  
  _22_RETIREMENT("TYPE_22_RETIREMENT"),
  
  _23_WORK_ACCIDENT_LICENSE_PAID_BY_COMPANY("TYPE_23_WORK_ACCIDENT_LICENSE_PAID_BY_COMPANY"),
  
  _24_CITIZEN_COMPANY_MATERNITY("TYPE_24_CITIZEN_COMPANY_MATERNITY"),
  
  _99_OTHER("TYPE_99_OTHER");

  private String value;

  TimeTrackingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TimeTrackingType fromValue(String text) {
    for (TimeTrackingType b : TimeTrackingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TimeTrackingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TimeTrackingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TimeTrackingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TimeTrackingType.fromValue(String.valueOf(value));
    }
  }
}

