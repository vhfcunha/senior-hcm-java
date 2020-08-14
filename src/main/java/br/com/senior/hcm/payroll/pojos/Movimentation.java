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
import br.com.senior.hcm.payroll.pojos.Company;
import br.com.senior.hcm.payroll.pojos.Costcenter;
import br.com.senior.hcm.payroll.pojos.CurrencyType;
import br.com.senior.hcm.payroll.pojos.Department;
import br.com.senior.hcm.payroll.pojos.Employee;
import br.com.senior.hcm.payroll.pojos.HireType;
import br.com.senior.hcm.payroll.pojos.Jobposition;
import br.com.senior.hcm.payroll.pojos.Movimentationreason;
import br.com.senior.hcm.payroll.pojos.RaisType;
import br.com.senior.hcm.payroll.pojos.SalaryType;
import br.com.senior.hcm.payroll.pojos.Wagelevel;
import br.com.senior.hcm.payroll.pojos.Workshift;
import br.com.senior.hcm.payroll.pojos.Workstation;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Movimentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-14T17:15:20.586Z")



public class Movimentation {
  @SerializedName("newemploymentrelationship")
  private RaisType newemploymentrelationship = null;

  @SerializedName("departmentreason")
  private Movimentationreason departmentreason = null;

  @SerializedName("datewhen")
  private OffsetDateTime datewhen = null;

  @SerializedName("newcompanynumber")
  private Integer newcompanynumber = null;

  @SerializedName("adjustmentpercentage")
  private Double adjustmentpercentage = null;

  @SerializedName("workstationreason")
  private Movimentationreason workstationreason = null;

  @SerializedName("employee")
  private Employee employee = null;

  @SerializedName("newdepartament")
  private Department newdepartament = null;

  @SerializedName("newwagelevel")
  private Wagelevel newwagelevel = null;

  @SerializedName("performancepercentage")
  private Double performancepercentage = null;

  @SerializedName("newspendingmoneyCrypto")
  private String newspendingmoneyCrypto = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("jobpositionreason")
  private Movimentationreason jobpositionreason = null;

  @SerializedName("newworkstation")
  private Workstation newworkstation = null;

  @SerializedName("newsalarytype")
  private SalaryType newsalarytype = null;

  @SerializedName("newjobposition")
  private Jobposition newjobposition = null;

  @SerializedName("newcurrency")
  private CurrencyType newcurrency = null;

  @SerializedName("transfertype")
  private HireType transfertype = null;

  @SerializedName("salaryreason")
  private Movimentationreason salaryreason = null;

  @SerializedName("newcostcenter")
  private Costcenter newcostcenter = null;

  @SerializedName("newvalueCrypto")
  private String newvalueCrypto = null;

  @SerializedName("movimentationdate")
  private OffsetDateTime movimentationdate = null;

  @SerializedName("newworkshift")
  private Workshift newworkshift = null;

  @SerializedName("newregisternumber")
  private Integer newregisternumber = null;

  @SerializedName("newcompany")
  private Company newcompany = null;

  public Movimentation newemploymentrelationship(RaisType newemploymentrelationship) {
    this.newemploymentrelationship = newemploymentrelationship;
    return this;
  }

   /**
   * Get newemploymentrelationship
   * @return newemploymentrelationship
  **/
  @ApiModelProperty(value = "")
  public RaisType getNewemploymentrelationship() {
    return newemploymentrelationship;
  }

  public void setNewemploymentrelationship(RaisType newemploymentrelationship) {
    this.newemploymentrelationship = newemploymentrelationship;
  }

  public Movimentation departmentreason(Movimentationreason departmentreason) {
    this.departmentreason = departmentreason;
    return this;
  }

   /**
   * Get departmentreason
   * @return departmentreason
  **/
  @ApiModelProperty(value = "")
  public Movimentationreason getDepartmentreason() {
    return departmentreason;
  }

  public void setDepartmentreason(Movimentationreason departmentreason) {
    this.departmentreason = departmentreason;
  }

  public Movimentation datewhen(OffsetDateTime datewhen) {
    this.datewhen = datewhen;
    return this;
  }

   /**
   * Data da movimentação (Com timezone)
   * @return datewhen
  **/
  @ApiModelProperty(value = "Data da movimentação (Com timezone)")
  public OffsetDateTime getDatewhen() {
    return datewhen;
  }

  public void setDatewhen(OffsetDateTime datewhen) {
    this.datewhen = datewhen;
  }

  public Movimentation newcompanynumber(Integer newcompanynumber) {
    this.newcompanynumber = newcompanynumber;
    return this;
  }

   /**
   * Número da empresa
   * @return newcompanynumber
  **/
  @ApiModelProperty(value = "Número da empresa")
  public Integer getNewcompanynumber() {
    return newcompanynumber;
  }

  public void setNewcompanynumber(Integer newcompanynumber) {
    this.newcompanynumber = newcompanynumber;
  }

  public Movimentation adjustmentpercentage(Double adjustmentpercentage) {
    this.adjustmentpercentage = adjustmentpercentage;
    return this;
  }

   /**
   * Porcentagem de ajuste
   * @return adjustmentpercentage
  **/
  @ApiModelProperty(value = "Porcentagem de ajuste")
  public Double getAdjustmentpercentage() {
    return adjustmentpercentage;
  }

  public void setAdjustmentpercentage(Double adjustmentpercentage) {
    this.adjustmentpercentage = adjustmentpercentage;
  }

  public Movimentation workstationreason(Movimentationreason workstationreason) {
    this.workstationreason = workstationreason;
    return this;
  }

   /**
   * Get workstationreason
   * @return workstationreason
  **/
  @ApiModelProperty(value = "")
  public Movimentationreason getWorkstationreason() {
    return workstationreason;
  }

  public void setWorkstationreason(Movimentationreason workstationreason) {
    this.workstationreason = workstationreason;
  }

  public Movimentation employee(Employee employee) {
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(value = "")
  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Movimentation newdepartament(Department newdepartament) {
    this.newdepartament = newdepartament;
    return this;
  }

   /**
   * Get newdepartament
   * @return newdepartament
  **/
  @ApiModelProperty(value = "")
  public Department getNewdepartament() {
    return newdepartament;
  }

  public void setNewdepartament(Department newdepartament) {
    this.newdepartament = newdepartament;
  }

  public Movimentation newwagelevel(Wagelevel newwagelevel) {
    this.newwagelevel = newwagelevel;
    return this;
  }

   /**
   * Get newwagelevel
   * @return newwagelevel
  **/
  @ApiModelProperty(value = "")
  public Wagelevel getNewwagelevel() {
    return newwagelevel;
  }

  public void setNewwagelevel(Wagelevel newwagelevel) {
    this.newwagelevel = newwagelevel;
  }

  public Movimentation performancepercentage(Double performancepercentage) {
    this.performancepercentage = performancepercentage;
    return this;
  }

   /**
   * Porcentagem de desempenho
   * @return performancepercentage
  **/
  @ApiModelProperty(value = "Porcentagem de desempenho")
  public Double getPerformancepercentage() {
    return performancepercentage;
  }

  public void setPerformancepercentage(Double performancepercentage) {
    this.performancepercentage = performancepercentage;
  }

  public Movimentation newspendingmoneyCrypto(String newspendingmoneyCrypto) {
    this.newspendingmoneyCrypto = newspendingmoneyCrypto;
    return this;
  }

   /**
   * Valor do adicional criptografado
   * @return newspendingmoneyCrypto
  **/
  @ApiModelProperty(value = "Valor do adicional criptografado")
  public String getNewspendingmoneyCrypto() {
    return newspendingmoneyCrypto;
  }

  public void setNewspendingmoneyCrypto(String newspendingmoneyCrypto) {
    this.newspendingmoneyCrypto = newspendingmoneyCrypto;
  }

  public Movimentation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id da movimentação
   * @return id
  **/
  @ApiModelProperty(value = "Id da movimentação")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Movimentation jobpositionreason(Movimentationreason jobpositionreason) {
    this.jobpositionreason = jobpositionreason;
    return this;
  }

   /**
   * Get jobpositionreason
   * @return jobpositionreason
  **/
  @ApiModelProperty(value = "")
  public Movimentationreason getJobpositionreason() {
    return jobpositionreason;
  }

  public void setJobpositionreason(Movimentationreason jobpositionreason) {
    this.jobpositionreason = jobpositionreason;
  }

  public Movimentation newworkstation(Workstation newworkstation) {
    this.newworkstation = newworkstation;
    return this;
  }

   /**
   * Get newworkstation
   * @return newworkstation
  **/
  @ApiModelProperty(value = "")
  public Workstation getNewworkstation() {
    return newworkstation;
  }

  public void setNewworkstation(Workstation newworkstation) {
    this.newworkstation = newworkstation;
  }

  public Movimentation newsalarytype(SalaryType newsalarytype) {
    this.newsalarytype = newsalarytype;
    return this;
  }

   /**
   * Get newsalarytype
   * @return newsalarytype
  **/
  @ApiModelProperty(value = "")
  public SalaryType getNewsalarytype() {
    return newsalarytype;
  }

  public void setNewsalarytype(SalaryType newsalarytype) {
    this.newsalarytype = newsalarytype;
  }

  public Movimentation newjobposition(Jobposition newjobposition) {
    this.newjobposition = newjobposition;
    return this;
  }

   /**
   * Get newjobposition
   * @return newjobposition
  **/
  @ApiModelProperty(value = "")
  public Jobposition getNewjobposition() {
    return newjobposition;
  }

  public void setNewjobposition(Jobposition newjobposition) {
    this.newjobposition = newjobposition;
  }

  public Movimentation newcurrency(CurrencyType newcurrency) {
    this.newcurrency = newcurrency;
    return this;
  }

   /**
   * Get newcurrency
   * @return newcurrency
  **/
  @ApiModelProperty(value = "")
  public CurrencyType getNewcurrency() {
    return newcurrency;
  }

  public void setNewcurrency(CurrencyType newcurrency) {
    this.newcurrency = newcurrency;
  }

  public Movimentation transfertype(HireType transfertype) {
    this.transfertype = transfertype;
    return this;
  }

   /**
   * Get transfertype
   * @return transfertype
  **/
  @ApiModelProperty(value = "")
  public HireType getTransfertype() {
    return transfertype;
  }

  public void setTransfertype(HireType transfertype) {
    this.transfertype = transfertype;
  }

  public Movimentation salaryreason(Movimentationreason salaryreason) {
    this.salaryreason = salaryreason;
    return this;
  }

   /**
   * Get salaryreason
   * @return salaryreason
  **/
  @ApiModelProperty(value = "")
  public Movimentationreason getSalaryreason() {
    return salaryreason;
  }

  public void setSalaryreason(Movimentationreason salaryreason) {
    this.salaryreason = salaryreason;
  }

  public Movimentation newcostcenter(Costcenter newcostcenter) {
    this.newcostcenter = newcostcenter;
    return this;
  }

   /**
   * Get newcostcenter
   * @return newcostcenter
  **/
  @ApiModelProperty(value = "")
  public Costcenter getNewcostcenter() {
    return newcostcenter;
  }

  public void setNewcostcenter(Costcenter newcostcenter) {
    this.newcostcenter = newcostcenter;
  }

  public Movimentation newvalueCrypto(String newvalueCrypto) {
    this.newvalueCrypto = newvalueCrypto;
    return this;
  }

   /**
   * Valor do salário criptografado
   * @return newvalueCrypto
  **/
  @ApiModelProperty(value = "Valor do salário criptografado")
  public String getNewvalueCrypto() {
    return newvalueCrypto;
  }

  public void setNewvalueCrypto(String newvalueCrypto) {
    this.newvalueCrypto = newvalueCrypto;
  }

  public Movimentation movimentationdate(OffsetDateTime movimentationdate) {
    this.movimentationdate = movimentationdate;
    return this;
  }

   /**
   * Data da movimentação (Sem timezone)
   * @return movimentationdate
  **/
  @ApiModelProperty(value = "Data da movimentação (Sem timezone)")
  public OffsetDateTime getMovimentationdate() {
    return movimentationdate;
  }

  public void setMovimentationdate(OffsetDateTime movimentationdate) {
    this.movimentationdate = movimentationdate;
  }

  public Movimentation newworkshift(Workshift newworkshift) {
    this.newworkshift = newworkshift;
    return this;
  }

   /**
   * Get newworkshift
   * @return newworkshift
  **/
  @ApiModelProperty(value = "")
  public Workshift getNewworkshift() {
    return newworkshift;
  }

  public void setNewworkshift(Workshift newworkshift) {
    this.newworkshift = newworkshift;
  }

  public Movimentation newregisternumber(Integer newregisternumber) {
    this.newregisternumber = newregisternumber;
    return this;
  }

   /**
   * Número do registro
   * @return newregisternumber
  **/
  @ApiModelProperty(value = "Número do registro")
  public Integer getNewregisternumber() {
    return newregisternumber;
  }

  public void setNewregisternumber(Integer newregisternumber) {
    this.newregisternumber = newregisternumber;
  }

  public Movimentation newcompany(Company newcompany) {
    this.newcompany = newcompany;
    return this;
  }

   /**
   * Get newcompany
   * @return newcompany
  **/
  @ApiModelProperty(value = "")
  public Company getNewcompany() {
    return newcompany;
  }

  public void setNewcompany(Company newcompany) {
    this.newcompany = newcompany;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Movimentation movimentation = (Movimentation) o;
    return Objects.equals(this.newemploymentrelationship, movimentation.newemploymentrelationship) &&
        Objects.equals(this.departmentreason, movimentation.departmentreason) &&
        Objects.equals(this.datewhen, movimentation.datewhen) &&
        Objects.equals(this.newcompanynumber, movimentation.newcompanynumber) &&
        Objects.equals(this.adjustmentpercentage, movimentation.adjustmentpercentage) &&
        Objects.equals(this.workstationreason, movimentation.workstationreason) &&
        Objects.equals(this.employee, movimentation.employee) &&
        Objects.equals(this.newdepartament, movimentation.newdepartament) &&
        Objects.equals(this.newwagelevel, movimentation.newwagelevel) &&
        Objects.equals(this.performancepercentage, movimentation.performancepercentage) &&
        Objects.equals(this.newspendingmoneyCrypto, movimentation.newspendingmoneyCrypto) &&
        Objects.equals(this.id, movimentation.id) &&
        Objects.equals(this.jobpositionreason, movimentation.jobpositionreason) &&
        Objects.equals(this.newworkstation, movimentation.newworkstation) &&
        Objects.equals(this.newsalarytype, movimentation.newsalarytype) &&
        Objects.equals(this.newjobposition, movimentation.newjobposition) &&
        Objects.equals(this.newcurrency, movimentation.newcurrency) &&
        Objects.equals(this.transfertype, movimentation.transfertype) &&
        Objects.equals(this.salaryreason, movimentation.salaryreason) &&
        Objects.equals(this.newcostcenter, movimentation.newcostcenter) &&
        Objects.equals(this.newvalueCrypto, movimentation.newvalueCrypto) &&
        Objects.equals(this.movimentationdate, movimentation.movimentationdate) &&
        Objects.equals(this.newworkshift, movimentation.newworkshift) &&
        Objects.equals(this.newregisternumber, movimentation.newregisternumber) &&
        Objects.equals(this.newcompany, movimentation.newcompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newemploymentrelationship, departmentreason, datewhen, newcompanynumber, adjustmentpercentage, workstationreason, employee, newdepartament, newwagelevel, performancepercentage, newspendingmoneyCrypto, id, jobpositionreason, newworkstation, newsalarytype, newjobposition, newcurrency, transfertype, salaryreason, newcostcenter, newvalueCrypto, movimentationdate, newworkshift, newregisternumber, newcompany);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Movimentation {\n");
    
    sb.append("    newemploymentrelationship: ").append(toIndentedString(newemploymentrelationship)).append("\n");
    sb.append("    departmentreason: ").append(toIndentedString(departmentreason)).append("\n");
    sb.append("    datewhen: ").append(toIndentedString(datewhen)).append("\n");
    sb.append("    newcompanynumber: ").append(toIndentedString(newcompanynumber)).append("\n");
    sb.append("    adjustmentpercentage: ").append(toIndentedString(adjustmentpercentage)).append("\n");
    sb.append("    workstationreason: ").append(toIndentedString(workstationreason)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    newdepartament: ").append(toIndentedString(newdepartament)).append("\n");
    sb.append("    newwagelevel: ").append(toIndentedString(newwagelevel)).append("\n");
    sb.append("    performancepercentage: ").append(toIndentedString(performancepercentage)).append("\n");
    sb.append("    newspendingmoneyCrypto: ").append(toIndentedString(newspendingmoneyCrypto)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobpositionreason: ").append(toIndentedString(jobpositionreason)).append("\n");
    sb.append("    newworkstation: ").append(toIndentedString(newworkstation)).append("\n");
    sb.append("    newsalarytype: ").append(toIndentedString(newsalarytype)).append("\n");
    sb.append("    newjobposition: ").append(toIndentedString(newjobposition)).append("\n");
    sb.append("    newcurrency: ").append(toIndentedString(newcurrency)).append("\n");
    sb.append("    transfertype: ").append(toIndentedString(transfertype)).append("\n");
    sb.append("    salaryreason: ").append(toIndentedString(salaryreason)).append("\n");
    sb.append("    newcostcenter: ").append(toIndentedString(newcostcenter)).append("\n");
    sb.append("    newvalueCrypto: ").append(toIndentedString(newvalueCrypto)).append("\n");
    sb.append("    movimentationdate: ").append(toIndentedString(movimentationdate)).append("\n");
    sb.append("    newworkshift: ").append(toIndentedString(newworkshift)).append("\n");
    sb.append("    newregisternumber: ").append(toIndentedString(newregisternumber)).append("\n");
    sb.append("    newcompany: ").append(toIndentedString(newcompany)).append("\n");
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

