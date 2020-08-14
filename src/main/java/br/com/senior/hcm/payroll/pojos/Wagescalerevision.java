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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.hcm.payroll.pojos.Wagescale;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * Wagescalerevision
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-14T17:15:20.586Z")



public class Wagescalerevision {
  @SerializedName("enddate")
  private LocalDate enddate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("startdate")
  private LocalDate startdate = null;

  @SerializedName("wagescale")
  private Wagescale wagescale = null;

  public Wagescalerevision enddate(LocalDate enddate) {
    this.enddate = enddate;
    return this;
  }

   /**
   * Data do fim da revisão de escala salarial
   * @return enddate
  **/
  @ApiModelProperty(value = "Data do fim da revisão de escala salarial")
  public LocalDate getEnddate() {
    return enddate;
  }

  public void setEnddate(LocalDate enddate) {
    this.enddate = enddate;
  }

  public Wagescalerevision id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id da revisão de escala salarial
   * @return id
  **/
  @ApiModelProperty(value = "Id da revisão de escala salarial")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Wagescalerevision startdate(LocalDate startdate) {
    this.startdate = startdate;
    return this;
  }

   /**
   * Data de inicio da revisão de escala salarial
   * @return startdate
  **/
  @ApiModelProperty(value = "Data de inicio da revisão de escala salarial")
  public LocalDate getStartdate() {
    return startdate;
  }

  public void setStartdate(LocalDate startdate) {
    this.startdate = startdate;
  }

  public Wagescalerevision wagescale(Wagescale wagescale) {
    this.wagescale = wagescale;
    return this;
  }

   /**
   * Get wagescale
   * @return wagescale
  **/
  @ApiModelProperty(value = "")
  public Wagescale getWagescale() {
    return wagescale;
  }

  public void setWagescale(Wagescale wagescale) {
    this.wagescale = wagescale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wagescalerevision wagescalerevision = (Wagescalerevision) o;
    return Objects.equals(this.enddate, wagescalerevision.enddate) &&
        Objects.equals(this.id, wagescalerevision.id) &&
        Objects.equals(this.startdate, wagescalerevision.startdate) &&
        Objects.equals(this.wagescale, wagescalerevision.wagescale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enddate, id, startdate, wagescale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wagescalerevision {\n");
    
    sb.append("    enddate: ").append(toIndentedString(enddate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    wagescale: ").append(toIndentedString(wagescale)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

