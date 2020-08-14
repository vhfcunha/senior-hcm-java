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
import br.com.senior.hcm.payroll.pojos.Attachment;
import br.com.senior.hcm.payroll.pojos.City;
import br.com.senior.hcm.payroll.pojos.Educationdegree;
import br.com.senior.hcm.payroll.pojos.Employee;
import br.com.senior.hcm.payroll.pojos.GenderType;
import br.com.senior.hcm.payroll.pojos.KinshipDegree;
import br.com.senior.hcm.payroll.pojos.MaritalStatus;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * Dependent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-14T17:15:20.586Z")



public class Dependent {
  @SerializedName("iseligibletoalimony")
  private Boolean iseligibletoalimony = null;

  @SerializedName("mothersname")
  private String mothersname = null;

  @SerializedName("birthdate")
  private LocalDate birthdate = null;

  @SerializedName("gender")
  private GenderType gender = null;

  @SerializedName("agelimitfamilysalary")
  private Integer agelimitfamilysalary = null;

  @SerializedName("disabilityDate")
  private LocalDate disabilityDate = null;

  @SerializedName("educationdegree")
  private Educationdegree educationdegree = null;

  @SerializedName("deathdate")
  private LocalDate deathdate = null;

  @SerializedName("employee")
  private Employee employee = null;

  @SerializedName("type")
  private KinshipDegree type = null;

  @SerializedName("attachment")
  private Attachment attachment = null;

  @SerializedName("cpf")
  private String cpf = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("registerNumber")
  private String registerNumber = null;

  @SerializedName("deathcertificate")
  private String deathcertificate = null;

  @SerializedName("livebirthdeclaration")
  private String livebirthdeclaration = null;

  @SerializedName("isaccountedforirrf")
  private Boolean isaccountedforirrf = null;

  @SerializedName("iseligibletofamilyallowence")
  private Boolean iseligibletofamilyallowence = null;

  @SerializedName("placeofbirth")
  private City placeofbirth = null;

  @SerializedName("sheetNumber")
  private String sheetNumber = null;

  @SerializedName("rg")
  private String rg = null;

  @SerializedName("maritalstatus")
  private MaritalStatus maritalstatus = null;

  @SerializedName("bookNumber")
  private String bookNumber = null;

  @SerializedName("agelimitir")
  private Integer agelimitir = null;

  @SerializedName("birthcertificate")
  private String birthcertificate = null;

  @SerializedName("fullname")
  private String fullname = null;

  @SerializedName("nameNotary")
  private String nameNotary = null;

  public Dependent iseligibletoalimony(Boolean iseligibletoalimony) {
    this.iseligibletoalimony = iseligibletoalimony;
    return this;
  }

   /**
   * Representa se o dependente é elegível a pensão alimentícia
   * @return iseligibletoalimony
  **/
  @ApiModelProperty(value = "Representa se o dependente é elegível a pensão alimentícia")
  public Boolean isIseligibletoalimony() {
    return iseligibletoalimony;
  }

  public void setIseligibletoalimony(Boolean iseligibletoalimony) {
    this.iseligibletoalimony = iseligibletoalimony;
  }

  public Dependent mothersname(String mothersname) {
    this.mothersname = mothersname;
    return this;
  }

   /**
   * Nome da mãe
   * @return mothersname
  **/
  @ApiModelProperty(value = "Nome da mãe")
  public String getMothersname() {
    return mothersname;
  }

  public void setMothersname(String mothersname) {
    this.mothersname = mothersname;
  }

  public Dependent birthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
    return this;
  }

   /**
   * Data de nascimento
   * @return birthdate
  **/
  @ApiModelProperty(value = "Data de nascimento")
  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public Dependent gender(GenderType gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public GenderType getGender() {
    return gender;
  }

  public void setGender(GenderType gender) {
    this.gender = gender;
  }

  public Dependent agelimitfamilysalary(Integer agelimitfamilysalary) {
    this.agelimitfamilysalary = agelimitfamilysalary;
    return this;
  }

   /**
   * Limite de idade para pensão familiar
   * @return agelimitfamilysalary
  **/
  @ApiModelProperty(value = "Limite de idade para pensão familiar")
  public Integer getAgelimitfamilysalary() {
    return agelimitfamilysalary;
  }

  public void setAgelimitfamilysalary(Integer agelimitfamilysalary) {
    this.agelimitfamilysalary = agelimitfamilysalary;
  }

  public Dependent disabilityDate(LocalDate disabilityDate) {
    this.disabilityDate = disabilityDate;
    return this;
  }

   /**
   * Data da invalidez
   * @return disabilityDate
  **/
  @ApiModelProperty(value = "Data da invalidez")
  public LocalDate getDisabilityDate() {
    return disabilityDate;
  }

  public void setDisabilityDate(LocalDate disabilityDate) {
    this.disabilityDate = disabilityDate;
  }

  public Dependent educationdegree(Educationdegree educationdegree) {
    this.educationdegree = educationdegree;
    return this;
  }

   /**
   * Get educationdegree
   * @return educationdegree
  **/
  @ApiModelProperty(value = "")
  public Educationdegree getEducationdegree() {
    return educationdegree;
  }

  public void setEducationdegree(Educationdegree educationdegree) {
    this.educationdegree = educationdegree;
  }

  public Dependent deathdate(LocalDate deathdate) {
    this.deathdate = deathdate;
    return this;
  }

   /**
   * Data de óbito
   * @return deathdate
  **/
  @ApiModelProperty(value = "Data de óbito")
  public LocalDate getDeathdate() {
    return deathdate;
  }

  public void setDeathdate(LocalDate deathdate) {
    this.deathdate = deathdate;
  }

  public Dependent employee(Employee employee) {
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

  public Dependent type(KinshipDegree type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public KinshipDegree getType() {
    return type;
  }

  public void setType(KinshipDegree type) {
    this.type = type;
  }

  public Dependent attachment(Attachment attachment) {
    this.attachment = attachment;
    return this;
  }

   /**
   * Get attachment
   * @return attachment
  **/
  @ApiModelProperty(value = "")
  public Attachment getAttachment() {
    return attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }

  public Dependent cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * CPF
   * @return cpf
  **/
  @ApiModelProperty(value = "CPF")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Dependent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do dependente
   * @return id
  **/
  @ApiModelProperty(value = "Id do dependente")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Dependent registerNumber(String registerNumber) {
    this.registerNumber = registerNumber;
    return this;
  }

   /**
   * Número do registro
   * @return registerNumber
  **/
  @ApiModelProperty(value = "Número do registro")
  public String getRegisterNumber() {
    return registerNumber;
  }

  public void setRegisterNumber(String registerNumber) {
    this.registerNumber = registerNumber;
  }

  public Dependent deathcertificate(String deathcertificate) {
    this.deathcertificate = deathcertificate;
    return this;
  }

   /**
   * Certidão de óbito
   * @return deathcertificate
  **/
  @ApiModelProperty(value = "Certidão de óbito")
  public String getDeathcertificate() {
    return deathcertificate;
  }

  public void setDeathcertificate(String deathcertificate) {
    this.deathcertificate = deathcertificate;
  }

  public Dependent livebirthdeclaration(String livebirthdeclaration) {
    this.livebirthdeclaration = livebirthdeclaration;
    return this;
  }

   /**
   * Declaração de nascimento
   * @return livebirthdeclaration
  **/
  @ApiModelProperty(value = "Declaração de nascimento")
  public String getLivebirthdeclaration() {
    return livebirthdeclaration;
  }

  public void setLivebirthdeclaration(String livebirthdeclaration) {
    this.livebirthdeclaration = livebirthdeclaration;
  }

  public Dependent isaccountedforirrf(Boolean isaccountedforirrf) {
    this.isaccountedforirrf = isaccountedforirrf;
    return this;
  }

   /**
   * Representa se o dependente é contabilizado no IRRF
   * @return isaccountedforirrf
  **/
  @ApiModelProperty(value = "Representa se o dependente é contabilizado no IRRF")
  public Boolean isIsaccountedforirrf() {
    return isaccountedforirrf;
  }

  public void setIsaccountedforirrf(Boolean isaccountedforirrf) {
    this.isaccountedforirrf = isaccountedforirrf;
  }

  public Dependent iseligibletofamilyallowence(Boolean iseligibletofamilyallowence) {
    this.iseligibletofamilyallowence = iseligibletofamilyallowence;
    return this;
  }

   /**
   * Representa se o dependente é elegível para subsídio familiar (Salário família)
   * @return iseligibletofamilyallowence
  **/
  @ApiModelProperty(value = "Representa se o dependente é elegível para subsídio familiar (Salário família)")
  public Boolean isIseligibletofamilyallowence() {
    return iseligibletofamilyallowence;
  }

  public void setIseligibletofamilyallowence(Boolean iseligibletofamilyallowence) {
    this.iseligibletofamilyallowence = iseligibletofamilyallowence;
  }

  public Dependent placeofbirth(City placeofbirth) {
    this.placeofbirth = placeofbirth;
    return this;
  }

   /**
   * Get placeofbirth
   * @return placeofbirth
  **/
  @ApiModelProperty(value = "")
  public City getPlaceofbirth() {
    return placeofbirth;
  }

  public void setPlaceofbirth(City placeofbirth) {
    this.placeofbirth = placeofbirth;
  }

  public Dependent sheetNumber(String sheetNumber) {
    this.sheetNumber = sheetNumber;
    return this;
  }

   /**
   * Número da folha
   * @return sheetNumber
  **/
  @ApiModelProperty(value = "Número da folha")
  public String getSheetNumber() {
    return sheetNumber;
  }

  public void setSheetNumber(String sheetNumber) {
    this.sheetNumber = sheetNumber;
  }

  public Dependent rg(String rg) {
    this.rg = rg;
    return this;
  }

   /**
   * RG
   * @return rg
  **/
  @ApiModelProperty(value = "RG")
  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public Dependent maritalstatus(MaritalStatus maritalstatus) {
    this.maritalstatus = maritalstatus;
    return this;
  }

   /**
   * Get maritalstatus
   * @return maritalstatus
  **/
  @ApiModelProperty(value = "")
  public MaritalStatus getMaritalstatus() {
    return maritalstatus;
  }

  public void setMaritalstatus(MaritalStatus maritalstatus) {
    this.maritalstatus = maritalstatus;
  }

  public Dependent bookNumber(String bookNumber) {
    this.bookNumber = bookNumber;
    return this;
  }

   /**
   * Número do livro
   * @return bookNumber
  **/
  @ApiModelProperty(value = "Número do livro")
  public String getBookNumber() {
    return bookNumber;
  }

  public void setBookNumber(String bookNumber) {
    this.bookNumber = bookNumber;
  }

  public Dependent agelimitir(Integer agelimitir) {
    this.agelimitir = agelimitir;
    return this;
  }

   /**
   * Limite de idade para IR
   * @return agelimitir
  **/
  @ApiModelProperty(value = "Limite de idade para IR")
  public Integer getAgelimitir() {
    return agelimitir;
  }

  public void setAgelimitir(Integer agelimitir) {
    this.agelimitir = agelimitir;
  }

  public Dependent birthcertificate(String birthcertificate) {
    this.birthcertificate = birthcertificate;
    return this;
  }

   /**
   * Certidão de nascimento
   * @return birthcertificate
  **/
  @ApiModelProperty(value = "Certidão de nascimento")
  public String getBirthcertificate() {
    return birthcertificate;
  }

  public void setBirthcertificate(String birthcertificate) {
    this.birthcertificate = birthcertificate;
  }

  public Dependent fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * Nome completo
   * @return fullname
  **/
  @ApiModelProperty(value = "Nome completo")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public Dependent nameNotary(String nameNotary) {
    this.nameNotary = nameNotary;
    return this;
  }

   /**
   * Nome do cartório
   * @return nameNotary
  **/
  @ApiModelProperty(value = "Nome do cartório")
  public String getNameNotary() {
    return nameNotary;
  }

  public void setNameNotary(String nameNotary) {
    this.nameNotary = nameNotary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dependent dependent = (Dependent) o;
    return Objects.equals(this.iseligibletoalimony, dependent.iseligibletoalimony) &&
        Objects.equals(this.mothersname, dependent.mothersname) &&
        Objects.equals(this.birthdate, dependent.birthdate) &&
        Objects.equals(this.gender, dependent.gender) &&
        Objects.equals(this.agelimitfamilysalary, dependent.agelimitfamilysalary) &&
        Objects.equals(this.disabilityDate, dependent.disabilityDate) &&
        Objects.equals(this.educationdegree, dependent.educationdegree) &&
        Objects.equals(this.deathdate, dependent.deathdate) &&
        Objects.equals(this.employee, dependent.employee) &&
        Objects.equals(this.type, dependent.type) &&
        Objects.equals(this.attachment, dependent.attachment) &&
        Objects.equals(this.cpf, dependent.cpf) &&
        Objects.equals(this.id, dependent.id) &&
        Objects.equals(this.registerNumber, dependent.registerNumber) &&
        Objects.equals(this.deathcertificate, dependent.deathcertificate) &&
        Objects.equals(this.livebirthdeclaration, dependent.livebirthdeclaration) &&
        Objects.equals(this.isaccountedforirrf, dependent.isaccountedforirrf) &&
        Objects.equals(this.iseligibletofamilyallowence, dependent.iseligibletofamilyallowence) &&
        Objects.equals(this.placeofbirth, dependent.placeofbirth) &&
        Objects.equals(this.sheetNumber, dependent.sheetNumber) &&
        Objects.equals(this.rg, dependent.rg) &&
        Objects.equals(this.maritalstatus, dependent.maritalstatus) &&
        Objects.equals(this.bookNumber, dependent.bookNumber) &&
        Objects.equals(this.agelimitir, dependent.agelimitir) &&
        Objects.equals(this.birthcertificate, dependent.birthcertificate) &&
        Objects.equals(this.fullname, dependent.fullname) &&
        Objects.equals(this.nameNotary, dependent.nameNotary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iseligibletoalimony, mothersname, birthdate, gender, agelimitfamilysalary, disabilityDate, educationdegree, deathdate, employee, type, attachment, cpf, id, registerNumber, deathcertificate, livebirthdeclaration, isaccountedforirrf, iseligibletofamilyallowence, placeofbirth, sheetNumber, rg, maritalstatus, bookNumber, agelimitir, birthcertificate, fullname, nameNotary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependent {\n");
    
    sb.append("    iseligibletoalimony: ").append(toIndentedString(iseligibletoalimony)).append("\n");
    sb.append("    mothersname: ").append(toIndentedString(mothersname)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    agelimitfamilysalary: ").append(toIndentedString(agelimitfamilysalary)).append("\n");
    sb.append("    disabilityDate: ").append(toIndentedString(disabilityDate)).append("\n");
    sb.append("    educationdegree: ").append(toIndentedString(educationdegree)).append("\n");
    sb.append("    deathdate: ").append(toIndentedString(deathdate)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    registerNumber: ").append(toIndentedString(registerNumber)).append("\n");
    sb.append("    deathcertificate: ").append(toIndentedString(deathcertificate)).append("\n");
    sb.append("    livebirthdeclaration: ").append(toIndentedString(livebirthdeclaration)).append("\n");
    sb.append("    isaccountedforirrf: ").append(toIndentedString(isaccountedforirrf)).append("\n");
    sb.append("    iseligibletofamilyallowence: ").append(toIndentedString(iseligibletofamilyallowence)).append("\n");
    sb.append("    placeofbirth: ").append(toIndentedString(placeofbirth)).append("\n");
    sb.append("    sheetNumber: ").append(toIndentedString(sheetNumber)).append("\n");
    sb.append("    rg: ").append(toIndentedString(rg)).append("\n");
    sb.append("    maritalstatus: ").append(toIndentedString(maritalstatus)).append("\n");
    sb.append("    bookNumber: ").append(toIndentedString(bookNumber)).append("\n");
    sb.append("    agelimitir: ").append(toIndentedString(agelimitir)).append("\n");
    sb.append("    birthcertificate: ").append(toIndentedString(birthcertificate)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    nameNotary: ").append(toIndentedString(nameNotary)).append("\n");
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
